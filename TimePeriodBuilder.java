/*
FINAL PROJECT
TimePeriodBuilder class file
12/7/2023
Kate Stenberg
 */

public class TimePeriodBuilder implements BuilderI<TimePeriod> {

    /**
     * This class represents a builder to make a TimePeriod enum.
     * It implements the Builder interface of type TimePeriod.
     */

    public TimePeriodBuilder() {}

    /**
     * Converts a piece of data from a String to a TimePeriod enum
     * @param input the data to convert
     * @return a TimePeriod enum type
     */
    @Override
    public TimePeriod build(String input) {
        TimePeriod timePeriod;
        if (input.equalsIgnoreCase("MODERN")) {
            timePeriod = TimePeriod.MODERN;
        }
        else if (input.equalsIgnoreCase("FANTASY")) {
            timePeriod = TimePeriod.FANTASY;
        }
        else if (input.equalsIgnoreCase("ANCIENT")) {
            timePeriod = TimePeriod.ANCIENT;
        }
        else if (input.equalsIgnoreCase("MEDIEVAL")) {
            timePeriod = TimePeriod.MEDIEVAL;
        }
        else if (input.equalsIgnoreCase("COLONIAL")) {
            timePeriod = TimePeriod.COLONIAL;
        }
        else if (input.equalsIgnoreCase("19TH CENTURY")) {
            timePeriod = TimePeriod.NINETEENTHCENTURY;
        }
        else if (input.equalsIgnoreCase("20TH CENTURY")) {
            timePeriod = TimePeriod.TWENTIETHCENTURY;
        }
        else if (input.equalsIgnoreCase("MULTIPLE")) {
            timePeriod = TimePeriod.MULTIPLE;
        }
        else {
            timePeriod = null;
        }
        return timePeriod;
    }

}
