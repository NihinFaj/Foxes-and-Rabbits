import java.util.List;
/**
 * An Actor abstract class that serves as Super class to all 
 * types of simulation participants
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (6th of January 2019)
 */
public abstract class Actor
{

    /**
     * Constructor for objects of class Actor
     */
    public Actor()
    {
    }

    abstract protected void act(List<Actor> newActors);
    
    abstract protected boolean isActive();
}
