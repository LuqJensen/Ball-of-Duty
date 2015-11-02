package application;

import java.util.HashSet;
import java.util.Observable;
import java.util.Observer;
import java.util.Set;

import javafx.geometry.Point2D;

/**
 * The weapon takes care of spawning bullets.
 * @author Gruppe6
 *
 */
public class Weapon extends Observable implements Observer
{

    private double firerate;
    private Bullet bullet;
    private int magazineSize;
    private GameObject gameObject;
    private double damage;
    private boolean shooting = false;
    private Set<Bullet> activeBullets;
    Timer timer;

    /**
     * Creates a weapon for the game object.
     * @param gameObject The game object this weapon belongs to.
     * @param firerate
     *            How many bullets the weapon shoots per second.
     * @param magazineSize The size of the magazine. Example: Value of 30 would result in a need to reload every time 30 bullets was spawned.
     * @param damage
     *            Damage per bullet.
     */
    public Weapon(GameObject gameObject, double firerate, int magazineSize, double damage)
    {
        activeBullets = new HashSet<Bullet>();
        timer = new Timer();
        timer.start();
        this.gameObject = gameObject;
        this.firerate = firerate;
        this.damage = damage;
        this.magazineSize = magazineSize;
    }

    int bulletsCreated = 500; // FIXME need better way of handling ID.

    /**
     * The weapons starts shooting bullets by its firerate.
     */
    public void startShooting()
    {

        if(timer.getDuration()<(1000 / firerate))
        {
            return;
        }
        timer.reset();
        
        shooting = true;
        new Thread(() ->
        {
            while (shooting)
            {

                Vector2 orientation = gameObject.body.getOrientation().setMagnitude(gameObject.body.getHeight() / 2);
                Point2D position = new Point2D(gameObject.body.getCenter().getX() + orientation.getX(),
                        gameObject.body.getCenter().getY() + orientation.getY());
                Vector2 velocity = new Vector2(gameObject.body.getOrientation());
                velocity.setMagnitude(300); // bullet speed magic number atm
               
                Bullet bullet = new Bullet(bulletsCreated++, position, 10, 10, velocity, damage);
                setChanged();
                notifyObservers(bullet); // Det her skal ske med noget server shit.
                System.out.println(this.countObservers());
                activeBullets.add(bullet);
                bullet.addObserver(this);
               
                
                try
                {
                    Thread.sleep((long) (1000 / firerate));
                }
                catch (Exception e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            }
        }).start();

    }

    /**
     * The weapon stops shooting bullets.
     */
    public void stopShooting()
    {
        shooting = false;
    }
    /**
     * The current active bullets of the weapon. I.e the bullets that are still in the air that this weapon has created.
     * @return Returns the active bullets this weapon has created.
     */
    public Set<Bullet> getActiveBullets()
    {
        return activeBullets;
    }


    
    @Override
    public void update(Observable observable, Object args)
    {
        System.out.println("hej");
        if(observable instanceof Bullet)
        {
            activeBullets.remove(observable);
        }
        
    }
}
