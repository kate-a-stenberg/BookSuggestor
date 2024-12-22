/*
FINAL PROJECT
PairingBuilder class file
12/7/2023
Kate Stenberg
 */

public class PairingBuilder implements BuilderI<Pairing> {

    /**
     * This class represents a builder to make a Pairing enum.
     * It implements the Builder interface of type Pairing.
     */

    public PairingBuilder() {}

    /**
     * Converts a piece of data from a String to a Pairing enum
     * @param input the data to convert
     * @return a Pairing enum type
     */
    @Override
    public Pairing build(String input) {
        Pairing pairing;
        if (input.equalsIgnoreCase("M/F")) {
            pairing = Pairing.MF;
        }
        else if (input.equalsIgnoreCase("M/M")) {
            pairing = Pairing.MM;
        }
        else if (input.equalsIgnoreCase("F/F")) {
            pairing = Pairing.FF;
        }
        else if (input.equalsIgnoreCase("F/NB")) {
            pairing = Pairing.FNB;
        }
        else if (input.equalsIgnoreCase("M/NB")) {
            pairing = Pairing.MNB;
        }
        else if (input.equalsIgnoreCase("NB/NB")) {
            pairing = Pairing.NBNB;
        }
        else {
            pairing = null;
        }
        return pairing;
    }

}
