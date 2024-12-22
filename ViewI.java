/*
FINAL PROJECT
ViewI interface file
12/7/2023
Kate Stenberg
 */

import java.util.ArrayList;

/**
 * This interface contains all operations that all ViewI classes must support.
 */
public interface ViewI {

    /**
     * Creates a new book based on the appropriate attributes
     * @return a new Book object
     */
    Book getBook();

    /**
     * displays a list of results
     * @param results the ArrayList<CompBook> to be displayed
     */
    void showResults(ArrayList<CompBook> results);

}
