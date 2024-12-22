/*
FINAL PROJECT
EmptyNode class file
12/7/2023
Kate Stenberg
 */

import java.util.function.Predicate;

public class EmptyNode<T> implements Node<T>{

    /**
     * This class represents an empty node in a linked list. An empty node has no data and no following node.
     */

    /**
     * Constructs a new empty node.
     */
    public EmptyNode () {}

    /**
     * getElement gets the data element of the node, which is null, since an empty node has no data element
     * @return null
     */
    public T getElement() {
        return null;
    }

    /**
     * getNextNode gets the next node following this node, which is null, since an empty node has no next node.
     * @return null
     */
    public Node<T> getNextNode() {
        return null;
    }

    /**
     * setNextNode sets the next node following this one in the list.
     * Implementation is empty in EmptyNode.
     * @param node the node to be set
     */
    public void setNextNode(Node<T> node){}

    /**
     * changeAttribute changes an attribute of the data element of this node
     * Implementation is empty in EmptyNode.
     * @param predicate the condition to check if this node's element should have its attribute changed
     * @param changeMethod the method to change the attribute
     * @param newData the new data to change the attribute to
     * @param <R> the type of the new data to change
     */
    public <R> void changeAttribute(Predicate<T> predicate, IChangeAttribute<T,R> changeMethod, R newData) {}

    /**
     * addNode inserts a node at the front of the list.
     * Implementation is empty in EmptyNode
     * @param element the data element for the node to be created
     */
    public void addNode(T element) {}

    /**
     * removeNode removes a single node based on a given condition
     * Implementation is empty in EmptyNode
     * @param predicate the condition test to find the node to be deleted
     */
    public void removeNode(Predicate<T> predicate) {}

    /**
     * countAll counts this and all following element nodes in the list, which is 0 because there are no elements hereafter
     * @return 0
     */
    public int countAll() {
        return 0;
    }

    /**
     * countCondition counts this and all following element nodes in the list whose elements meet the condition
     * @param predicate the condition to count
     * @return 0
     */
    public int countCondition(Predicate<T> predicate) {return 0;}

    /**
     * removeAll removes all element nodes in the list
     * Implementation is empty in EmptyNode
     */
    public void removeAll() {}

    /**
     * removeCondition removes this and all following nodes in the list whose elements meet the condition
     * Implementation is empty in EmptyNode
     * @param predicate the condition to meet to be removed
     */
    public void removeCondition(Predicate<T> predicate) {}

    /**
     * printAll gets a string display of this and all following elements in the list
     * @return an empty string
     */
    public String printAll() {
        return "";
    }

    /**
     * printCondition gets a string display of this an all following elements in the list that meet a condition
     * @param predicate the condition for an element to meet to be printed
     * @return an empty string
     */
    public String printCondition(Predicate<T> predicate) {return "";}

    /**
     * findElement determines whether a given element is in a list
     * @param data the data to search for of type T
     * @return false
     */
    public boolean findElement(T data) {
        return false;
    }

}
