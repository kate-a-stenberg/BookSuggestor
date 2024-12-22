/*
FINAL PROJECT
MoodBuilder class file
12/7/2023
Kate Stenberg
 */

public class MoodBuilder implements BuilderI<Mood> {

    /**
     * This class represents a builder to make a Mood enum.
     * It implements the Builder interface of type Mood.
     */

    public MoodBuilder() {}

    /**
     * Converts a piece of data from a String to a Mood enum
     * @param input the data to convert
     * @return a Mood enum type
     */
    @Override

    public Mood build(String input) {
        Mood mood;
        if (input.equalsIgnoreCase("COZY")) {
            mood = Mood.COZY;
        }
        else if (input.equalsIgnoreCase("FUNNY")) {
            mood = Mood.FUNNY;
        }
        else if (input.equalsIgnoreCase("THRILLING")) {
            mood = Mood.THRILLING;
        }
        else if (input.equalsIgnoreCase("SPOOKY")) {
            mood = Mood.SPOOKY;
        }
        else {
            mood = null;
        }
        return mood;
    }

}
