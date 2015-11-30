package application.engine.game_object;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import application.communication.GameObjectDAO;
import application.engine.entities.Bullet;
import application.engine.entities.Bullet.Type;
import application.engine.game_object.GameObject;
import application.util.Timer;
import application.util.Vector2;
import application.engine.rendering.TranslatedPoint;
import javafx.scene.image.Image;

/**
 * The weapon takes care of spawning bullets.
 * 
 * @author Gruppe6
 *
 */
public class Weapon extends Observable
{

    private double fireRate;
    private double bulletSpeed;
    private int bulletSize;
    private int reloadSpeed;
    private int magazineMaxSize;
    private int magazineSize;
    private int damage;
    private GameObject gameObject;

    private boolean reloading = false;
    private boolean shooting = false;
    private Set<GameObject> activeBullets;
    Timer timer;
    private static Map<Type, Image> bulletImages;

    static
    {
        bulletImages = new HashMap<>();
        bulletImages.put(Type.RIFLE, new Image("images/silver_ball.png"));
    }

    /**
     * Creates a weapon for the game object.
     * 
     * @param gameObject
     *            The game object this weapon belongs to.
     * @param firerate
     *            How many bullets the weapon shoots per second.
     * @param magazineSize
     *            The size of the magazine. Example: Value of 30 would result in a need to reload every time 30 bullets was spawned.
     * @param damage
     *            Damage per bullet.
     */
    public Weapon(GameObject gameObject, double firerate, int magazineMaxSize, int damage, double bulletSpeed, int reloadSpeed, int bulletSize)
    {
        activeBullets = Collections.newSetFromMap(new ConcurrentHashMap<GameObject, Boolean>());
        timer = new Timer();
        timer.start();
        this.gameObject = gameObject;
        this.fireRate = firerate;
        this.damage = damage;
        this.bulletSpeed = bulletSpeed;
        this.reloadSpeed = reloadSpeed;
        this.magazineMaxSize = magazineMaxSize;
        this.magazineSize = magazineMaxSize;
        this.bulletSize = bulletSize;
    }

    int bulletsCreated = 500; // FIXME need better way of handling ID.

    /**
     * The weapons starts shooting bullets by its firerate.
     */
    public void startShooting()
    {
        if (timer.getDuration() < (1000 / fireRate) || shooting)
        {
            return;
        }

        shooting = true;
        timer.reset();
        new Thread(() ->
        {

            while (shooting)
            {
                if (!reloading)
                {
                    Vector2 orientation = gameObject.getBody().getOrientation().setMagnitude(gameObject.getBody().getHeight() / 2);
                    TranslatedPoint position = new TranslatedPoint(gameObject.getBody().getCenter().getX() + orientation.getX(),
                            gameObject.getBody().getCenter().getY() + orientation.getY());
                    Vector2 velocity = new Vector2(gameObject.getBody().getOrientation());
                    velocity.setMagnitude(bulletSpeed);
                    Bullet bullet = new Bullet(bulletsCreated++, position, bulletSize, velocity, damage, Bullet.Type.RIFLE,
                            bulletImages.get(Bullet.Type.RIFLE), gameObject.getId());
                    bullet.getBody().setCenter(position);
                    activeBullets.add(bullet);
                    setChanged();
                    notifyObservers(bullet);
                    magazineSize--;
                }
                try
                {
                    Thread.sleep((long) (1000 / fireRate));
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
                if (magazineSize < 1)
                {
                    reload();
                }

            }
        }).start();

    }

    public void reload()
    {
        if (!reloading)
        {
            reloading = true;
            new Thread(() ->
            {
                try
                {
                    Thread.sleep(reloadSpeed);
                }
                catch (InterruptedException e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                magazineSize = magazineMaxSize;
                reloading = false;
            }).start();
        }
    }

    public Set<GameObject> getActiveBullets()
    {
        return activeBullets;
    }

    /**
     * The weapon stops shooting bullets.
     */
    public void stopShooting()
    {
        shooting = false;
    }

    public static Map getBulletImages()
    {
        return bulletImages;
    }

    /**
     * The current active bullets of the weapon. I.e the bullets that are still in the air that this weapon has created.
     * 
     * @return Returns the active bullets this weapon has created.
     */

    public void setDamage(int damage)
    {
        this.damage = damage;
    }

    public void setFireRate(double fireRate)
    {
        this.fireRate = fireRate;
    }
    
    public void setBulletSpeed(double bulletSpeed)
    {
        this.bulletSpeed = bulletSpeed;
    }

    public void setMagazineMaxSize(int magazineMaxSize)
    {
        this.magazineMaxSize = magazineMaxSize;
    }

    public void setReloadSpeed(int reloadSpeed)
    {
        this.reloadSpeed = reloadSpeed;
    }

    @Override
    public String toString()
    {
        return String.format("Weapon [firerate=%s, magazineSize=%s, gameObject=%s, damage=%s, shooting=%s,]", fireRate, magazineSize,
                gameObject, damage, shooting);
    }

}
