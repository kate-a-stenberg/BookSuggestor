/*
FINAL PROJECT
ElementNode class file
12/7/2023
Kate Stenberg
 */

import java.util.function.Predicate;

public class ElementNode<T> implements Node<T> {

    /**
     * This class represents a generic element node which hold a data element of type T and a pointer to a following node
     */

    private T element;
    private Node<T> nextNode;

    /**
     * Constructs a node given an element of type T and a pointer to an empty node
     * @param element the data for the node to hold
     */
    public ElementNode(T element) {
        this.element = element;
        setNextNode(new EmptyNode<T>());
    }

    /**
     * Constructs a node given an element of type T and another node to point to
     * @param element the data for the node to hold
     * @param nextNode the node to follow this node
     */
    public ElementNode(T element, Node<T> nextNode) {
        this.element = element;
        setNextNode(nextNode);
    }

    /**
     * getElement gets the data element of the node
     * @return the data element of the node
     */
    public T getElement() {
        return this.element;
    }

    /**
     * getNextNode gets the next node that follows this node
     * @return the next node that follows this node
     */
    public Node<T> getNextNode() {
        return this.nextNode;
    }

    /**
     * setNextNode sets the next node in the list following this one
     * @param node the node to follow this one in the list
     */
    public void setNextNode(Node<T> node) {
        this.nextNode = node;
    }

    /**
     * addNode inserts a node at the front of the list.
     * Implementation is empty in ElementNode
     * @param element the data element for the node to be created
     */
    public void addNode(T element) {
    }

    /**
     * removeNode removes a single node based on a given condition
     * @param predicate the condition test to find the node to be deleted
     */
    public void removeNode(Predicate<T> predicate) {
        // if the element of the next node after this one meets the condition
        if (predicate.test(this.nextNode.getElement())) {
            // the next-next node will be the new next node
            Node newNextNode = nextNode.getNextNode();
            setNextNode(newNextNode);
        }
        else {
            nextNode.removeNode(predicate);
        }
    }

    /**
     * changeAttribute changes an attribute of the data element of this node
     * @param predicate the condition to check if this node's element should have its attribute changed
     * @param changeMethod the method to change the attribute
     * @param newData the new data to change the attribute to
     * @param <R> the type of the new data to change
     */
    public <R> void changeAttribute(Predicate<T> predicate, IChangeAttribute<T,R> changeMethod, R newData) {
        // if this node's element meets the conditions for change
        if (predicate.test(this.element)) {
            // use the changeMethod object's changeThing method to change this node's attribute to the new data
            changeMethod.changeThing(this, newData);
        }
        else {
            this.nextNode.changeAttribute(predicate, changeMethod, newData);
        }
    }

    /**
     * countAll counts this and all following element nodes in the list
     * @return the number of elements in the list
     */
    public int countAll() {
        return 1 + nextNode.countAll();
    }

    /**
     * countCondition counts this and all following element nodes in the list whose elements meet the condition
     * @param predicate the condition to count
     * @return the number of elements in the list that meet the condition
     */
    public int countCondition(Predicate<T> predicate) {
        if (predicate.test(this.element)) {
            return 1 + this.nextNode.countCondition(predicate);
        }
        else {
            return this.nextNode.countCondition(predicate);
        }
    }

    /**
     * removeAll removes all element nodes in the list
     */
    public void removeAll() {
    }

    /**
     * removeCondition removes this and all following nodes in the list whose elements meet the condition
     * @param predicate the condition to meet to be removed
     */
    public void removeCondition(Predicate<T> predicate) {
        if (nextNode.getNextNode() instanceof ElementNode<T>) {
            nextNode.removeCondition(predicate);
        }
        if (predicate.test(nextNode.getElement())) {
            this.nextNode = this.nextNode.getNextNode();
        }
    }

    /**
     * printAll gets a string display of this and all following elements in the list
     * @return a string representation of all elements in the list
     */
    public String printAll() {
        return this.element.toString() + nextNode.printAll();
    }

    /**
     * printCondition gets a string display of this and all following elements in the list that meet a condition
     * @param predicate the condition for an element to meet to be printed
     * @return a string of data elements
     */
    public String printCondition(Predicate<T> predicate) {
        if (predicate.test(this.element)) {
            return this.element.toString() + this.nextNode.printCondition(predicate);
        }
        else {
            return this.nextNode.printCondition(predicate);
        }
    }

    /**
     * findElement determines whether a given element is in a list
     * @param data the data to search for of type T
     * @return true if this node contains the data, otherwise the result of continuing to search the next node
     */
    public boolean findElement(T data) {
        if (this.element == data) {
            return true;
        }
        else {
            return nextNode.findElement(data);
        }
    }

}