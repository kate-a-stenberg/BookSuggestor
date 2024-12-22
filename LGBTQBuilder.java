/*
FINAL PROJECT
LGBTQBuilder class file
12/7/2023
Kate Stenberg
 */

public class LGBTQBuilder implements BuilderI<LGBTQ> {

    /**
     * This class represents a builder to make a LGBTQ enum.
     * It implements the Builder interface of type LGBTQ.
     */

    public LGBTQBuilder() {}

    /**
     * Converts a piece of data from a String to a LGBTQ enum
     * @param input the data to convert
     * @return a LGBTQ enum type
     */
    @Override
    public LGBTQ build(String input) {
        LGBTQ protagLGBTQ;
        if (input.equalsIgnoreCase("STRAIGHT")) {
            protagLGBTQ = LGBTQ.STRAIGHT;
        }
        else if (input.equalsIgnoreCase("LESBIAN")) {
            protagLGBTQ = LGBTQ.LESBIAN;
        }
        else if (input.equalsIgnoreCase("GAY")) {
            protagLGBTQ = LGBTQ.GAY;
        }
        else if (input.equalsIgnoreCase("BISEXUAL")) {
            protagLGBTQ = LGBTQ.BISEXUAL;
        }
        else if (input.equalsIgnoreCase("TRANS")) {
            protagLGBTQ = LGBTQ.TRANS;
        }
        else if (input.equalsIgnoreCase("QUEER")) {
            protagLGBTQ = LGBTQ.QUEER;
        }
        else {
            protagLGBTQ = null;
        }
        return protagLGBTQ;
    }

}
