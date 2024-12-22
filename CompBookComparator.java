/*
FINAL PROJECT
CompBookComparator class file
12/7/2023
Kate Stenberg
 */

import java.util.Comparator;

public class CompBookComparator implements Comparator<CompBook> {

    /**
     * This class represents a CompBookComparator, which implements Comparator with the type CompBook and compares two CompBooks
     */

    public CompBookComparator() {}

    /**
     * compares two CompBook objects based on their similarity attributes
     * @param b1 the first object to be compared.
     * @param b2 the second object to be compared.
     * @return the order of whichever is less and which is more
     */
    @Override
    public int compare(CompBook b1, CompBook b2)
    {
        if (b1.getSimilarity() == b2.getSimilarity())
            return 0;
        else if (b1.getSimilarity() > b2.getSimilarity())
            return -1;
        else
            return 1;
    }

}
