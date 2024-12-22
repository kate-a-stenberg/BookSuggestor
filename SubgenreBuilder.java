/*
FINAL PROJECT
SubgenreBuilder class file
12/7/2023
Kate Stenberg
 */

public class SubgenreBuilder implements BuilderI<RomanceSubgenre> {

    /**
     * This class represents a builder to make a RomanceSubgenre enum.
     * It implements the Builder interface of type RomanceSubgenre.
     */

    public SubgenreBuilder() {}

    /**
     * Converts a piece of data from a String to a RomanceSubgenre enum
     * @param input the data to convert
     * @return a RomanceSubgenre enum type
     */
    @Override
    public RomanceSubgenre build(String input) {
        RomanceSubgenre subgenre;
        if (input.equalsIgnoreCase("CONTEMPORARY")) {
            subgenre = RomanceSubgenre.CONTEMP;
        }
        else if (input.equalsIgnoreCase("HISTORICAL")) {
            subgenre = RomanceSubgenre.HISTORICAL;
        }
        else if (input.equalsIgnoreCase("PARANORMAL")) {
            subgenre = RomanceSubgenre.PARANORMAL;
        }
        else if (input.equalsIgnoreCase("FANTASY")) {
            subgenre = RomanceSubgenre.FANTASY;
        }
        else if (input.equalsIgnoreCase("SCIFI")) {
            subgenre = RomanceSubgenre.SCIFI;
        }
        else if (input.equalsIgnoreCase("ROMCOM")) {
            subgenre = RomanceSubgenre.ROMCOM;
        }
        else {
            subgenre = null;
        }
        return subgenre;
    }

}
