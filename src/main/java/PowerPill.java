
/**
 * This class defines how power pills behave in
 * a game.  The purpose of a power pill is to simply
 * provide a character with power.
 *
 * @author (You)
 * @version (0.1)
 */
public class PowerPill {
    // TODO - replace this line with instruction from step 1
    public static int DEFAULT_POWER = 10;
    // instance variables
    // TODO - replace this line with instruction from step 2
    private int power;
    // TODO - replace this line with instruction from step 3
    private String name;
    // constructors
    /**
     * Initializes this power pill to the value of power
     * and sets the name of the pill to name.
     * @param name the name of this power pill
     * @param power the power level of this power pill.
     */
// TODO - Step 4 and 5 together

    public PowerPill(String name){
        this.name = name;
        this.power = DEFAULT_POWER;
    }


    // TODO -Step 5
    public PowerPill(String name,int power){
        this.name = name;
        this.power = power;
    }

    // accessor methods

    // TODO - replace this line with instruction from step 6
 //Returns the powerlevel of the powerShell
    public int getPower() {
        return power;
    }
//Returns the name of the powerShell
    public String getName() {
        return name;
    }
    // mutator methods

    // TODO - replace this line with instruction from step 7
    //Sets the power level of the Power pill
    public void setPower(int power){
        this.power = power;
    }
    // toString method
    //sets the name of the powerPill
    public void setName(String name){
        this.name = name;
    }
    // TODO - replace this line with instruction from step 8

    @Override
    public String toString() {
        return "PowerPill "+ name + " = " + power;
    }
}