/*
FINAL PROJECT
BooleanBuilder class file
12/7/2023
Kate Stenberg
 */

public class BooleanBuilder implements BuilderI<Boolean> {

    /**
     * This class represents a builder to make a boolean value.
     * It implements the Builder interface of type Boolean.
     */

    public BooleanBuilder() {}

    /**
     * Converts a piece of data from a String to a Boolean
     * @param input the data to convert
     * @return a Boolean object
     */
    @Override
    public Boolean build(String input) {
        if (input.equalsIgnoreCase("Y")) {
            return true;
        }
        else {
            return false;
        }
    }

}
