/*
FINAL PROJECT
BookBuilder class file
12/7/2023
Kate Stenberg
 */

public class BookBuilder<T> {

    /**
     * This class represents a builder that will create an attribute of a book based on the given type T.
     */

    /**
     * Constructs an attribute of a Book object
     * @param input the String input
     * @param builder the builder to use based on the type T desired as output
     * @return the data returned from the build() method of the selected builder
     */
    public T build(String input, BuilderI<T> builder) {
        return builder.build(input);
    }
}