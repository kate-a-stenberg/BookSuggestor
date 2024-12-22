/*
FINAL PROJECT
EthnicityBuilder class file
12/7/2023
Kate Stenberg
 */

public class EthnicityBuilder implements BuilderI<Ethnicity> {

    /**
     * This class represents a builder to make an Ethnicity enum.
     * It implements the Builder interface of type Ethnicity.
     */

    public EthnicityBuilder() {}

    /**
     * Converts a piece of data from a String to an Ethnicity enum
     * @param input the data to convert
     * @return an Ethnicity enum type
     */
    @Override
    public Ethnicity build(String input) {
        Ethnicity protagEthnicity;
        if (input.equalsIgnoreCase("WHITE")) {
            protagEthnicity = Ethnicity.WHITE;
        }
        else if (input.equalsIgnoreCase("BLACK")) {
            protagEthnicity = Ethnicity.BLACK;
        }
        else if (input.equalsIgnoreCase("ASIAN")) {
            protagEthnicity = Ethnicity.ASIAN;
        }
        else if (input.equalsIgnoreCase("INDIAN")) {
            protagEthnicity = Ethnicity.INDIAN;
        }
        else if (input.equalsIgnoreCase("MIDDLE EASTERN")) {
            protagEthnicity = Ethnicity.MIDDLEEASTERN;
        }
        else if (input.equalsIgnoreCase("INDIGENOUS")) {
            protagEthnicity = Ethnicity.INDIGENOUS;
        }
        else if (input.equalsIgnoreCase("HISPANIC")) {
            protagEthnicity = Ethnicity.HISPANIC;
        }
        else if (input.equalsIgnoreCase("MIXED")) {
            protagEthnicity = Ethnicity.MIXED;
        }
        else {
            protagEthnicity = null;
        }
        return protagEthnicity;
    }

}
