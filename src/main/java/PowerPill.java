
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill
{
    public static int DEFAULT_POWER = 10;

    // instance variables
    int power;
    String name;

    // constructors
    // This gives intial values to power pill as DEFAULT_POWER
    // This sets the name of pill to name

    public PowerPill(String name){
       this.name = name;
       power = DEFAULT_POWER;
    }

    // This sets pill to name and sets power pill to power

    public PowerPill(String name, int power){
        this.name = name;
        this.power = power;
    }

    // accessor methods

    public String getName(){
        return name;
    }
    public int getPower(){
        return power;
    }


    // mutator methods

    public void setName(String name){
        this.name = name;
    }
    public void setPower(int power){
        this.power = power;
    }

    // toString method

    public String toString(){
        return "PowerPill " + name + " = " + power;
    }

}