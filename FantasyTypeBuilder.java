/*
FINAL PROJECT
FantasyBuilder class file
12/7/2023
Kate Stenberg
 */

public class FantasyTypeBuilder implements BuilderI<FantasyType> {

    /**
     * This class represents a builder to make a FantasyType enum.
     * It implements the Builder interface of type FantasyType.
     */

    public FantasyTypeBuilder() {}

    /**
     * Converts a piece of data from a String to a FantasyType enum
     * @param input the data to convert
     * @return a FantasyType enum type
     */
    @Override
    public FantasyType build(String input) {
        FantasyType fantasyType;
        if (input.equalsIgnoreCase("HIGH")) {
            fantasyType = FantasyType.HIGH;
        }
        else if (input.equalsIgnoreCase("LOW")) {
            fantasyType = FantasyType.LOW;
        }
        else {
            fantasyType = null;
        }
        return fantasyType;
    }

}
