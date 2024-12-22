/*
FINAL PROJECT
BookComparerI interface file
12/7/2023
Kate Stenberg
 */

/**
 * This interface contains all operations that all BookComparerI classes should support.
 */
public interface BookComparerI {

   /**
     * Determines the match value for two books, based on the match values of all attributes.
     * @param b1 the first book to be compared
     * @param b2 the second book to be compared
     * @return the match value of the two books
     */
    float compareBooks(Book b1, Book b2);

}
