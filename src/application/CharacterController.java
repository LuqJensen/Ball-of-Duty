package application;

import java.awt.MouseInfo;

import javafx.geometry.Point2D;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.BorderPane;
/**
 * Controls a character with input from peripherals such as keyboard and mouse.
 * @author gruppe6
 *
 */
public class CharacterController
{
    private BoDCharacter character;
    private static final Vector2 UP_VECTOR = new Vector2(0, -1);
    private static final Vector2 DOWN_VECTOR = new Vector2(0, 1);
    private static final Vector2 RIGHT_VECTOR = new Vector2(1, 0);
    private static final Vector2 LEFT_VECTOR = new Vector2(-1, 0);
    private KeyHandler keyHandler;
    private Point2D canvasRelativeLocation;
    private BorderPane gameBox;

    /**
     * Creates a controller defining the character to control, the gamebox on which it is being controlled, and the windows relative location. 
     * The action a input starts is defined by the key handler.
     * @param inputChar The character to control.
     * @param gameBox The game box on which the character is being controlled.
     * @param windowRelativeLocation The location of the application window relative to the windows OS.
     */
    public CharacterController(BoDCharacter inputChar, BorderPane gameBox, Point2D windowRelativeLocation)
    {
        this.gameBox = gameBox;
        this.canvasRelativeLocation = windowRelativeLocation.add(gameBox.getCenter().getLayoutX(), gameBox.getCenter().getLayoutY());

        character = inputChar;
        keyHandler = new KeyHandler();

        gameBox.setOnKeyPressed(actionEvent ->
        {
            KeyHandler.Action action = keyHandler.getAction(actionEvent.getCode());

            if (action == KeyHandler.Action.MOVE_UP)
            {
                character.physics.addDirection(UP_VECTOR);
            }
            else if (action == KeyHandler.Action.MOVE_DOWN)
            {
                character.physics.addDirection(DOWN_VECTOR);
            }
            else if (action == KeyHandler.Action.MOVE_LEFT)
            {
                character.physics.addDirection(LEFT_VECTOR);
            }
            else if (action == KeyHandler.Action.MOVE_RIGHT)
            {
                character.physics.addDirection(RIGHT_VECTOR);
            }
            else if (action == KeyHandler.Action.BLINK)
            {
                System.out.println(getMousePoint());
                character.body.setCenter(getMousePoint());
            }

        });
        gameBox.setOnKeyReleased(actionEvent ->
        {
            KeyHandler.Action action = keyHandler.getAction(actionEvent.getCode());

            if (action == KeyHandler.Action.MOVE_UP)
            {
                character.physics.removeDirection(UP_VECTOR);
            }
            else if (action == KeyHandler.Action.MOVE_DOWN)
            {
                character.physics.removeDirection(DOWN_VECTOR);
            }
            else if (action == KeyHandler.Action.MOVE_LEFT)
            {
                character.physics.removeDirection(LEFT_VECTOR);
            }
            else if (action == KeyHandler.Action.MOVE_RIGHT)
            {
                character.physics.removeDirection(RIGHT_VECTOR);
            }
        });
        
        gameBox.setOnMousePressed(actionEvent ->
        {
            if(actionEvent.getButton() == MouseButton.PRIMARY)
            {
               character.weapon.startShooting();
            }
            
        });
        gameBox.setOnMouseReleased(actionEvent ->
        {
            if(actionEvent.getButton() == MouseButton.PRIMARY)
            {
               character.weapon.stopShooting();
            }
            
        });

        character.physics.addCalculation(() ->
        {

            Point2D position = character.body.getCenter();
            double deltaX = getMousePoint().getX() - position.getX();
            double deltaY = getMousePoint().getY() - position.getY();
            character.body.setOrientation(new Vector2(deltaX, deltaY));
        });
    }

    /**
     * The current mouse position, relative to the canvas location. (Canvas is where the game is drawn).
     * @return
     */
    public Point2D getMousePoint()
    {
        return new Point2D(
                MouseInfo.getPointerInfo().getLocation().getX() - (canvasRelativeLocation.getX() + gameBox.getCenter().getLayoutX()),
                MouseInfo.getPointerInfo().getLocation().getY() - (canvasRelativeLocation.getY() + gameBox.getCenter().getLayoutY()));
    }

    /**
     * Sets the relative location of the canvas compared to the windows OS.
     * @param windowRelativeLocation
     */
    public void setCanvasRelativeLocation(Point2D canvasRelativeLocation)
    {

        this.canvasRelativeLocation = canvasRelativeLocation;
    }
}
