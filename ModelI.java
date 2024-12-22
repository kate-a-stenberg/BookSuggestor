/*
FINAL PROJECT
ModelI interface file
12/7/2023
Kate Stenberg
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;

/**
 * This interface contains all operations that all ModelI classes should support
 */
public interface ModelI {

    /**
     * sets the original book to be used in the model
     * @param origBook the original book to be used in the model
     */
    void setOrigBook(Book origBook);

    /**
     * gets the results list of books
     * @return the ArrayList results list of CompBooks
     */
    ArrayList<CompBook> getResults();

    /**
     * creates an ArrayList of Books from a csv file
     * @return new ArrayList of Book type
     * @throws FileNotFoundException if the target file is not found
     */
    ArrayList<Book> makeBookList() throws FileNotFoundException;

    /**
     * gets the bookList of books
     * @return the ArrayList bookList of Books
     */
    ArrayList<Book> getBookList();

    /**
     * Creates the results list of books by similarity
     * @return a new ArrayList of CompBook type
     */
    ArrayList<CompBook> makeResultsList();

    /**
     * Sorts the objects in the results list using a CompBookComparator
     */
    void sortResults();

    /**
     * Filters the objects in the results list
     */
    void filterResults();

}
