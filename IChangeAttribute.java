/*
FINAL PROJECT
IChangeAttribute interface file
12/7/2023
Kate Stenberg
 */

/**
 * This is a functional interface that contains operations that all IChangeAttribute classes should support.
 */
@FunctionalInterface
public interface IChangeAttribute<T,R> {

    /**
     * changes a piece of data in a node and changes it into another piece of data
     * @param node the node containing the T type data to be changed
     * @param newData the new data of type R (inside the data type T) to be used
     */
    public void changeThing(Node<T> node, R newData);
}
