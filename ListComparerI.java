/*
FINAL PROJECT
ListComparerI interface file
12/7/2023
Kate Stenberg
 */

/**
 * This interface contains all operations that all ListComparerI classes should support.
 */
public interface ListComparerI <T> {

    /**
     * compares two lists
     * @param l1 the first list to be compared
     * @param l2 the second list to be compared
     * @return a numeric value representing how similar the two lists are
     */
    float compareLists(ListADT<T> l1, ListADT<T> l2);

}
