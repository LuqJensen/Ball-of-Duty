package application;

import javafx.geometry.Point2D;

/**
 * A bullet can damage other objects with health.
 * @author Gruppe6
 *
 */
public class Bullet extends GameObject
{

    double damage;
    private Timer timer;
    private int lifeTime;

    /**
     * Creates a bullet with a body, physics, view and damage.
     * @param id The id of the bullet.
     * @param position The starting position of the bullet.
     * @param height The height of the bullet.
     * @param width The width of the bullet.
     * @param velocity The velocity of the bullet.
     * @param damage The amount of health reduced on another object if this bullet collides with the object.
     */
    public Bullet(int id, Point2D position, double height, double width, Vector2 velocity, double damage)
    {
        super(id, Body.Type.CIRCLE);
        this.damage = damage;
        this.body = new Body(this, position, height, width, Body.Type.CIRCLE);
        this.physics = new Physics(this, (int) velocity.getMagnitude());
        physics.setVelocity(velocity);
        this.view = new View(this);
        lifeTime = 5;
        new Thread(()->
        {
            timer = new Timer();
            timer.start();
            while((timer.getDuration()<1000*lifeTime))
            {
                try
                {
                    Thread.sleep(20);
                }
                catch (Exception e)
                {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
            setChanged();
            notifyObservers();
        }).start();;
        
    }

    /**
     * Gets the damage of this bullet. I.e The amount of health reduced on another object if this bullet collides with the object.
     * @return
     */
    public double getDamage()
    {
        return damage;
    }
    

}
