/*
FINAL PROJECT
ListComparer1 class file
12/7/2023
Kate Stenberg
 */

public class ListComparer<T> implements ListComparerI<T> {

    /**
     * This represents a list comparer.
     */

    public ListComparer() {}

    /**
     * compares two lists
     * @param l1 the first list to be compared
     * @param l2 the second list to be compared
     * @return a numeric value representing how similar the two lists are
     */
    public float compareLists(ListADT<T> l1, ListADT<T> l2) {
        if (l1.countAll() == 0 && l2.countAll() == 0) { // if both lists are empty
            return 1; // return full match
        }
        if (l1.countAll() == 0 || l2.countAll() == 0) { // if only one list is empty
            return 0; // return no match
        }
        float matches = 0; // start matches at 0
        Node<T> node = l1.getNode(); // start at list 1 first node
        while (node instanceof ElementNode<T>) { // until we've reached the end of list 1
            if (l2.findElement(node.getElement())) { // check if the node is in list 2
                matches = matches + 1; // if yes, increase match count
            }
            node = node.getNextNode(); // move to next node in list 1
        }
        float comp1 = matches/l1.countAll(); // how many nodes in list 1 are also in list 2
        float comp2 = matches/l2.countAll(); // how many node in list 2 are also in list 1
        return (comp1+comp2)/2; // average two calculations
    }

}
