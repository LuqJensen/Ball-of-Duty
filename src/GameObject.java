
public abstract class GameObject
{
    public Body body;
    public Physics physics;
    public View view;
    
    public int id;

    public GameObject()
    {
        
    }
    
    public void draw()
    {
        
    }
    
    public void update()
    {
        
    }
    
    public void destroy()
    {
        
    }

    public Body getBody()
    {
        return body;
    }

    public void setBody(Body body)
    {
        this.body = body;
    }

    public Physics getPhysics()
    {
        return physics;
    }

    public void setPhysics(Physics physics)
    {
        this.physics = physics;
    }

    public View getView()
    {
        return view;
    }

    public void setView(View view)
    {
        this.view = view;
    }
    
    public int getId() 
    {
    	return id;
    }
    
    public void setId(int id)
    {
    	this.id = id;
    }
}
