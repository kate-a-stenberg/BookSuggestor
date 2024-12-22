/*
FINAL PROJECT
GenderBuilder class file
12/7/2023
Kate Stenberg
 */

public class GenderBuilder implements BuilderI<Gender> {

    /**
     * This class represents a builder to make a Gender enum.
     * It implements the Builder interface of type Gender.
     */

    public GenderBuilder() {}

    /**
     * Converts a piece of data from a String to a Gender enum
     * @param input the data to convert
     * @return a Gender enum type
     */
    @Override
    public Gender build(String input) {
        Gender protagGender;
        if (input.equalsIgnoreCase("MALE")) {
            protagGender = Gender.MALE;
        }
        else if (input.equalsIgnoreCase("FEMALE")) {
            protagGender = Gender.FEMALE;
        }
        else if (input.equalsIgnoreCase("NONBINARY")) {
            protagGender = Gender.NB;
        }
        else {
            protagGender = null;
        }
        return protagGender;
    }

}
