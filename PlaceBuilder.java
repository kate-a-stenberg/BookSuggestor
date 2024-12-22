/*
FINAL PROJECT
PlaceBuilder class file
12/7/2023
Kate Stenberg
 */

public class PlaceBuilder implements BuilderI<Place> {

    /**
     * This class represents a builder to make a Place enum.
     * It implements the Builder interface of type Place.
     */

    public PlaceBuilder() {}

    /**
     * Converts a piece of data from a String to a Place enum
     * @param input the data to convert
     * @return a Place enum type
     */
    @Override
    public Place build(String input) {
        Place place;
        if (input.equalsIgnoreCase("CITY")) {
            place = Place.CITY;
        }
        else if (input.equalsIgnoreCase("TOWN")) {
            place = Place.TOWN;
        }
        else if (input.equalsIgnoreCase("VILLAGE")) {
            place = Place.VILLAGE;
        }
        else if (input.equalsIgnoreCase("SUBURB")) {
            place = Place.SUBURB;
        }
        else if (input.equalsIgnoreCase("COUNTRY")) {
            place = Place.COUNTRY;
        }
        else if (input.equalsIgnoreCase("WILDERNESS")) {
            place = Place.WILDERNESS;
        }
        else if (input.equalsIgnoreCase("SCHOOL/COLLEGE")) {
            place = Place.SCHOOLCOLLEGE;
        }
        else if (input.equalsIgnoreCase("SPACE")) {
            place = Place.SPACE;
        }
        else if (input.equalsIgnoreCase("COURT")) {
            place = Place.COURT;
        }
        else if (input.equalsIgnoreCase("MULTIPLE")) {
            place = Place.MULTIPLE;
        }
        else {
            place = null;
        }
        return place;
    }

}
