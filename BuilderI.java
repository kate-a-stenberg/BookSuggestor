/*
FINAL PROJECT
BooleanBuilder class file
12/7/2023
Kate Stenberg
 */

/**
 * This interface contains all operations that all Builder classes should support.
 */
public interface BuilderI<T> {

    /**
     * Converts a piece of data from a String to a T type data.
     * @param input the String to convery
     * @return a T object
     */
    T build(String input);

}
