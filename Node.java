/*
FINAL PROJECT
Node interface file
12/7/2023
Kate Stenberg
 */

import java.util.function.Predicate;

/**
 * This interface contains all operations that all Node classes must support.
 */
public interface Node<T> {

    /**
     * getElement gets the data element of the node
     * @return the data element of the node
     */
    public T getElement();

    /**
     * getNextNode gets the next node that follows this node
     * @return the next node that follows this node
     */
    public Node<T> getNextNode();

    /**
     * setNextNode sets the next node in the list following this one
     * @param node the node to follow this one in the list
     */
    public void setNextNode(Node<T> node);

    /**
     * changeAttribute changes an attribute of the data element of this node
     * @param predicate the condition to check if this node's element should have its attribute changed
     * @param changeMethod the method to change the attribute
     * @param newData the new data to change the attribute to
     * @param <R> the type of the new data to change
     */
    public <R> void changeAttribute(Predicate<T> predicate, IChangeAttribute<T,R> changeMethod, R newData);

    /**
     * addNode inserts a node at the front of the list.
     * @param element the data element for the node to be created
     */
    public void addNode(T element);

    /**
     * removeNode removes a single node based on a given condition
     * @param predicate the condition test to find the node to be deleted
     */
    public void removeNode(Predicate<T> predicate);

    /**
     * countAll counts this and all following element nodes in the list
     * @return the number of elements in the list
     */
    public int countAll();

    /**
     * countCondition counts this and all following element nodes in the list whose elements meet the condition
     * @param predicate the condition to count
     * @return the number of elements in the list that meet the condition
     */
    public int countCondition(Predicate<T> predicate);

    /**
     * removeAll removes all element nodes in the list
     */
    public void removeAll();

    /**
     * removeCondition removes this and all following nodes in the list whose elements meet the condition
     * @param predicate the condition to meet to be removed
     */
    public void removeCondition(Predicate<T> predicate);

    /**
     * printAll gets a string display of this and all following elements in the list
     * @return a string representation of all elements in the list
     */
    public String printAll();

    /**
     * printCondition gets a string display of this and all following elements in the list that meet a condition
     * @param predicate the condition for an element to meet to be printed
     * @return a string of data elements
     */
    public String printCondition(Predicate<T> predicate);

    /**
     * findElement determines whether a given element is in a list
     * @param data the data to search for of type T
     * @return true if this node contains the data, otherwise the result of continuing to search the next node
     */
    public boolean findElement(T data);
}
