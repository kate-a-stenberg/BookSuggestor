/*
FINAL PROJECT
CultureBuilder class file
12/7/2023
Kate Stenberg
 */

public class CultureBuilder implements BuilderI<Culture> {

    /**
     * This class represents a builder to make a Culture enum.
     * It implements the Builder interface of type Culture.
     */

    public CultureBuilder() {}

    /**
     * Converts a piece of data from a String to a Culture enum
     * @param input the data to convert
     * @return a Culture enum type
     */
    @Override
    public Culture build(String input) {
        Culture culture;
        if (input.equalsIgnoreCase("NORTH AMERICAN")) {
            culture = Culture.NORTHAMERICAN;
        }
        else if (input.equalsIgnoreCase("MESOAMERICAN")) {
            culture = Culture.MESOAMERICAN;
        }
        else if (input.equalsIgnoreCase("EUROPEAN")) {
            culture = Culture.EUROPEAN;
        }
        else if (input.equalsIgnoreCase("SLAVIC")) {
            culture = Culture.SLAVIC;
        }
        else if (input.equalsIgnoreCase("EAST ASIAN")) {
            culture = Culture.EASTASIAN;
        }
        else if (input.equalsIgnoreCase("INDIAN")) {
            culture = Culture.INDIAN;
        }
        else if (input.equalsIgnoreCase("MIDDLE EASTERN")) {
            culture = Culture.MIDDLEEASTERN;
        }
        else if (input.equalsIgnoreCase("AFRICAN")) {
            culture = Culture.AFRICAN;
        }
        else if (input.equalsIgnoreCase("AUSTRONESIAN")) {
            culture = Culture.AUSTRONESIAN;
        }
        else if (input.equalsIgnoreCase("CELTIC")) {
            culture = Culture.CELTIC;
        }
        else if (input.equalsIgnoreCase("POLYNESIAN")) {
            culture = Culture.POLYNESIAN;
        }
        else if (input.equalsIgnoreCase("SCANDINAVIAN")) {
            culture = Culture.SCANDINAVIAN;
        }
        else {
            culture = null;
        }
        return culture;
    }

}
