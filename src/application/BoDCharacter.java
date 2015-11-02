package application;

import org.datacontract.schemas._2004._07.Ball_of_Duty_Server_DTO.GameObjectDTO;

import javafx.geometry.Point2D;
/**
 * Characters in the game consists of the balls that players control.
 * @author Gruppe6
 *
 */
public class BoDCharacter extends GameObject
{
    public MousePosition mousePosition;

    /**
     * Creates a BoDCharacter from the data in a GameObjectDTO
     * 
     * @param goDTO
     *            the DTO
     */
    public BoDCharacter(GameObjectDTO goDTO)
    {
        super(goDTO.getId());

        this.body = new Body(this, new Point2D(goDTO.getBody().get_point().getX(), goDTO.getBody().get_point().getY()),
                goDTO.getBody().get_width(), goDTO.getBody().get_height(), Body.Type.CIRCLE);
        this.physics = new Physics(this, 0); // TODO get velocity from server so we can update the enemies position while inbetween position
                                             // updates.
        this.view = new View(this); // TODO if enemy has special cosmetics it's passed through here.
        this.mousePosition = new MousePosition();
    }

    /**
     * Creates a character with certain speed, width, length and position.
     * 
     * @param id
     *            Id of the character
     * @param position
     *            Starting position of the character.
     * @param width Width of the character.
     * @param height Height of the character.
     * @param speed Movement speed of the character.
     */
    public BoDCharacter(int id, Point2D position, double width, double height, int speed)
    {
        super(id);
        this.body = new Body(this, position, width, height, Body.Type.CIRCLE);
        this.physics = new Physics(this, speed);
        this.view = new View(this);
        this.mousePosition = new MousePosition();
        this.weapon = new Weapon(this, 5, 20, 10); // Default weapon would be created per spec
        this.health = new Health(100);

    }

    /**
     *  Creates a character with default size, position and speed.
     * @param id Id of the character
     */
    public BoDCharacter(int id)
    {
        super(id);
        this.body = new Body(this, new Point2D(10, 10), 50, 50, Body.Type.CIRCLE);
        this.physics = new Physics(this, 200);
        this.view = new View(this);
        this.mousePosition = new MousePosition();
    }

}
