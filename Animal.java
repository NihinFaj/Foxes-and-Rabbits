import java.util.List;
/**
 * The Animal class, which acts a Superclass for all types of animals in the Simulator program
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (5ht of January 2019)
 */
public class Animal
{
    // Whether the animal is alive or not.
    private boolean alive;
    // The field occupied by the animal.
    private Field field;
    // The animal's position.
    private Location location;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(Field field, Location location)
    {
        alive = true;
        this.field = field;
        this.location = location;
    }

    /**
     * To get the current field pf the animal
     * @return The Animal's field
     */
    protected Field getField()
    {
        return field;
    }

    /**
     * Return the animal's location.
     * @return The animal's location.
     */
    protected Location getLocation()
    {
        return location;
    }

    /**
     * Place the animal at the new location in the given field.
     * @param newLocation The animal's new location.
     */
    protected void setLocation(Location newLocation)
    {
        if(location != null) {
            field.clear(location);
        }
        location = newLocation;
        field.place(this, newLocation);
    }

    /**
     * Check whether the animal is alive or not.
     * @return True if the animal is still alive.
     */
    protected boolean isAlive()
    {
        return alive;
    }

    /**
     * Indicate that the animal is no longer alive.
     * It is removed from the field.
     */
    protected void setDead()
    {
        alive = false;
        if(location != null) {
            field.clear(location);
            location = null;
            field = null;
        }
    }
    
    /**
     * Allows an animal to act in accordance to it's type
     */
    public void act(List<Animal> newAnimals)
    {
    }
}
