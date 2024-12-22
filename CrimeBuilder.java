/*
FINAL PROJECT
CrimeBuilder class file
12/7/2023
Kate Stenberg
 */

public class CrimeBuilder implements BuilderI<Crime> {

    /**
     * This class represents a builder to make a Crime enum.
     * It implements the Builder interface of type Crime.
     */

    public CrimeBuilder() {}

    /**
     * Converts a piece of data from a String to a Crime enum
     * @param input the data to convert
     * @return a Crime enum type
     */
    @Override
    public Crime build(String input) {
        Crime crime;
        if (input.equalsIgnoreCase("ABDUCTION")) {
            crime = Crime.ABDUCTION;
        }
        else if (input.equalsIgnoreCase("SINGLE MURDER")) {
            crime = Crime.SINGLEMURDER;
        }
        else if (input.equalsIgnoreCase("MULTIPLE MURDER")) {
            crime = Crime.MULTIMURDER;
        }
        else if (input.equalsIgnoreCase("ARSON")) {
            crime = Crime.ARSON;
        }
        else if (input.equalsIgnoreCase("THEFT")) {
            crime = Crime.THEFT;
        }
        else if (input.equalsIgnoreCase("STALKING")) {
            crime = Crime.STALKING;
        }
        else if (input.equalsIgnoreCase("TERRORISM")) {
            crime = Crime.TERRORISM;
        }
        else {
            crime = null;
        }
        return crime;
    }

}
