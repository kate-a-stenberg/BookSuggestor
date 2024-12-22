/*
FINAL PROJECT
GenreBuilder class file
12/7/2023
Kate Stenberg
 */

public class GenreBuilder implements BuilderI<Genre> {

    /**
     * This class represents a builder to make a Genre enum.
     * It implements the Builder interface of type Genre.
     */

    public GenreBuilder() {}

    /**
     * Converts a piece of data from a String to a Genre enum
     * @param input the data to convert
     * @return a Genre enum type
     */
    @Override
    public Genre build(String input) {
        Genre genre;
        if (input.equalsIgnoreCase("FANTASY")) {
            genre = Genre.FANTASY;
        }
        else if (input.equalsIgnoreCase("ROMANCE")) {
            genre = Genre.ROMANCE;
        }
        else if (input.equalsIgnoreCase("MYSTERY")) {
            genre = Genre.MYSTERY;
        }
        else {
            genre = null;
        }
        return genre;
    }

}
