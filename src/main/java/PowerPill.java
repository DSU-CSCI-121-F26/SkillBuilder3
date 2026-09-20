
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

    int power;
    String name;



    public PowerPill(String name) {
        this.name = name;
        this.power = DEFAULT_POWER; // typical default assignment
    }

    public PowerPill(String name, int power) {
            this.name = name;
            this.power = power;
    }


    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public void setName(String name){
        this.name = name;
    }

   public void setPower(int power) {
        this.power = power;
   }
    public String toString() {
        return "PowerPill " + name + " = " + power;
    }
    // instance variables


    // constructors

    // TODO - replace this line with instruction from step 4

    // TODO - replace this line with instruction from step 5


    // accessor methods

    // TODO - replace this line with instruction from step 6


    // mutator methods



    // toString method

    // TODO - replace this line with instruction from step 8

}