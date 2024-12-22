/*
FINAL PROJECT
AgeRangeBuilder class file
12/7/2023
Kate Stenberg
 */

public class AgeRangeBuilder implements BuilderI<AgeRange> {

    /**
     * This class represents a builder to make an AgeRange enum.
     * It implements the Builder interface of type AgeRange.
     */

    public AgeRangeBuilder() {}

    /**
     * Converts a piece of data from a String to an AgeRange enum
     * @param input the data to convert
     * @return an AgeRange enum type
     */
    @Override
    public AgeRange build(String input) {
        if (input.equalsIgnoreCase("MIDDLE GRADE")) {
            return AgeRange.MIDDLEGRADE;
        }
        else if (input.equalsIgnoreCase("YA")) {
            return AgeRange.YA;
        }
        else if (input.equalsIgnoreCase("NA")) {
            return AgeRange.NA;
        }
        else if (input.equalsIgnoreCase("ADULT")) {
            return AgeRange.ADULT;
        }
        else {
            return null;
        }
    }
}
