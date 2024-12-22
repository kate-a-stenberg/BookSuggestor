/*
FINAL PROJECT
POVBuilder class file
12/7/2023
Kate Stenberg
 */

public class POVBuilder implements BuilderI<POV> {

    /**
     * This class represents a builder to make a POV enum.
     * It implements the Builder interface of type POV.
     */

    public POVBuilder() {}

    /**
     * Converts a piece of data from a String to a POV enum
     * @param input the data to convert
     * @return a POV enum type
     */
    @Override
    public POV build(String input) {
        POV pov;
        if (input.equalsIgnoreCase("FIRST")) {
            pov = POV.FIRST;
        }
        else if (input.equalsIgnoreCase("FIRST MULTIPLE")) {
            pov = POV.FIRSTMULTIPLE;
        }
        else if (input.equalsIgnoreCase("THIRD")) {
            pov = POV.THIRD;
        }
        else if (input.equalsIgnoreCase("THIRD MULTIPLE")) {
            pov = POV.THIRDMULTIPLE;
        }
        else if (input.equalsIgnoreCase("MIXED")) {
            pov = POV.MIXED;
        }
        else {
            pov = null;
        }
        return pov;
    }

}
