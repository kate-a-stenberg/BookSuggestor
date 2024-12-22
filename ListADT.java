/*
FINAL PROJECT
ListADT class file
12/7/2023
Kate Stenberg
 */

import java.util.function.Predicate;

public class ListADT<T> implements Node<T> {

    /**
     * This class represents a generic Linked List. Its only attribute is the first node in the list.
     */

    private Node<T> node;

    /**
     * Constructs a new ADTList based on an element
     * @param element the element used to create the initial node in the ADTList
     */
    public ListADT(T element) {
        this.node = new ElementNode<T>(element);
    }

    /** Constructs a new ADTList based on a node
     * @param node the node used to create the new ADTList
     */
    public ListADT(Node<T> node) {
        this.node = node;
    }

    /**
     * Constructs a new empty ADTList
     */
    public ListADT() {
        this.node = new EmptyNode<T>();
    }

    /**
     * getNode gets the first node in the ADTList
     * @return the first node in the ADTList
     */
    public Node<T> getNode() {
        return this.node;
    }

    /**
     * getElement gets the data of the first node in the ADTList
     * @return the data for the first node in the ADTList
     */
    public T getElement() {
        return this.node.getElement();
    }

    /**
     * getNextNode gets the second node in the ADTList
     * @return the next node in the list after the initial one
     */
    public Node<T> getNextNode() {
        return this.node.getNextNode();
    }

    /**
     * setNextNode sets the next node in the ADTList following the initial node
     * @param newNode the node to set as the next node
     */
    public void setNextNode(Node<T> newNode) {
        this.node.setNextNode(newNode);
    }

    /**
     * addNode adds a new node to the front of the ADTList based on an element
     * @param element the element used to create the new node
     */
    public void addNode(T element) {
        ElementNode<T> newNode = new ElementNode<T>(element, this.node);
        this.node = newNode;
    }

    /**
     * removeNode removes a single node from the list based on a criteria
     * @param predicate the criteria used to remove the node
     */
    public void removeNode(Predicate<T> predicate) {
        // if this node's element passes the predicate test condition
        if (predicate.test(this.node.getElement())) {
            // then set the initial node to the next node
            this.node = this.getNextNode();
        }
        else {
            // if the next node's task meets the predicate test condition
            if (predicate.test(this.node.getNextNode().getElement())) {
                // the next-next node will be the new next node (bypassing the current next node)
                Node newNextNode = this.node.getNextNode().getNextNode();
                this.node.setNextNode(newNextNode);
            }
            else {
                this.node.getNextNode().removeNode(predicate);
            }
        }
    }

    /**
     * changeAttribute changes an attribute of the element in the node.
     * @param predicate the criteria used to determine whether the node element will have its attribute changed
     * @param changeMethod the method used to change the attribute
     * @param newData the new data to assign to the attribute
     * @param <R> the type of the data to be assigned
     */
    public <R> void changeAttribute(Predicate<T> predicate, IChangeAttribute<T,R> changeMethod, R newData) {
        if (predicate.test(this.node.getElement())) {
            changeMethod.changeThing(this.node, newData);
        }
        else {
            this.node.getNextNode().changeAttribute(predicate, changeMethod, newData);
        }
    }

    /**
     * countAll counts all elements in the ADTList
     * @return the number of elements in the ADTList
     */
    public int countAll() {
        if (this.node instanceof EmptyNode<T>) {
            return 0;
        }
        else {
            return 1 + node.getNextNode().countAll();
        }
    }

    /**
     * countCondition counts the number of elements in the ADTlist that meet a certain condition
     * @param predicate the condition of elements to count
     * @return the number of elements matching the condition
     */
    public int countCondition(Predicate<T> predicate) {
        if (predicate.test(this.node.getElement())) {
            return 1 + this.node.getNextNode().countCondition(predicate);
        }
        else {
            return this.node.getNextNode().countCondition(predicate);
        }
    }

    /**
     * removeAll removes this and all following ElementNodes
     */
    public void removeAll() {
        this.node.getNextNode().removeAll();
        if (this.node.getNextNode().getNextNode() instanceof ElementNode<T>) {
            this.node.getNextNode().getNextNode().removeAll();
        }
        if (this.node.getNextNode() instanceof ElementNode<T>) {
            this.node.getNextNode().removeAll();
        }
        this.node = new EmptyNode<T>();
    }

    /**
     * removeCondition removes any ElementNodes in the ADTList that meet a certain condition
     * @param predicate the condition of elements to remove
     */
    public void removeCondition(Predicate<T> predicate) {
        while (predicate.test(this.node.getElement()) && this.node.getNextNode() instanceof ElementNode<T>) {
            this.node = this.node.getNextNode();
        }
        if (this.node.getNextNode() instanceof ElementNode<T>) {
            this.node.getNextNode().removeCondition(predicate);
        }
        if (this.node.getNextNode() instanceof EmptyNode<T>) {
            if (predicate.test(this.node.getElement())) {
                this.node = this.node.getNextNode();
            }
        }
    }

    /**
     * printAll gets a string of all elements in the ADTList
     * @return a string of the elements in the ADTList
     */
    public String printAll() {
        if (this.node instanceof ElementNode<T>) {
            return node.printAll();
        }
        else {
            return "";
        }
    }

    /**
     * printCondition gets a string of all elements in the ADTList that meet a certain condition
     * @param predicate the condition of elements to be strung
     * @return a string of all elements in the ADTList that meet the condition
     */
    public String printCondition(Predicate<T> predicate) {
        if (predicate.test(getElement())) {
            return this.node.getElement().toString() + node.getNextNode().printCondition(predicate);
        }
        else {
            return node.getNextNode().printCondition(predicate);
        }
    }

    /**
     * finds a given element in the list
     * @param element the data of type T to search for
     * @return the result of findElement on the first node
     */
    public boolean findElement(T element) {
        if (node.getElement() == element) {
            return true;
        }
        else {
            return node.findElement(element);
        }
    }

}
