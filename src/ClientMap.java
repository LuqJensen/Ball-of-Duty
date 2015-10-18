import java.awt.geom.Point2D;
import java.awt.geom.Point2D.Double;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;

public class ClientMap extends Observable
{
    public HashMap<Integer, GameObject> gameObjects;
    public BoDCharacter myChar;

    private Broker broker;
    
    public ClientMap(IMap serverMap, Broker broker)
    {
        this.broker = broker;
    }

    public void activate()
    {
        
    }

    public void deactivate()
    {
        
    }
    
    public void updatePositions(List<ObjectPosition> positions)
    {
    	for (ObjectPosition pos : positions) 
    	{
    		GameObject go = gameObjects.get(pos.getId());
    		if (go != null) 
    		{
    			go.getBody().setPosition(pos.getPosition());
    		}
    	}
    }
     
    public void sendPositionUpdate() {
    	broker.sendPositionUpdate(myChar.getBody().getPosition(), myChar.getId());
    }
}
