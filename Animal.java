import java.util.List;
/**
 * The Animal class, which acts a Superclass for all types of animals in the Simulator program
 *
 * @author (Nihinlolamiwa Fajemilehin)
 * @version (5th of January 2019)
 */
public abstract class Animal
{
    // Whether the animal is alive or not.
    private boolean alive;
    // The field occupied by the animal.
    private Field field;
    // The animal's position.
    private Location location;
    // The animal's age.
    private int age;

    /**
     * Constructor for objects of class Animal
     */
    public Animal(Field field, Location location)
    {
        alive = true;
        this.field = field;
        this.location = location;
        age = 0;
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
     * Get the age of the animal
     * @return The age of the animal
     */
    protected int getAge()
    {
        return age;
    }
    
    /**
     * Set the age of the animal
     */
    protected void setAge(int animalAge)
    {
        age = animalAge;
    }
   
    /**
     * An animal can breed if it has reached the breeding age.
     */
    protected boolean canBreed()
    {
        return getAge() >= getBreedingAge();
    }   
   
    /**
     * Get the breedding age of the Animal
     */
    abstract public int getBreedingAge();   

    /**
     * Allows an animal to act in accordance to it's type
     */
    abstract public void act(List<Animal> newAnimals);
}
