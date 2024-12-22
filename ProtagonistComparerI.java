/*
FINAL PROJECT
ProtagonistComparerI interface file
12/7/2023
Kate Stenberg
 */

/**
 * This interface contains all operations that all ProtagonistCompararI classes must support.
 */
public interface ProtagonistComparerI {

    /**
     * Compares two protagonists based on their common attributes
     * @param p1 the first Protagonist to be compared
     * @param p2 the second Protagonist to be compared
     * @return a decimal number reflecting how similar the Protagonists are
     */
    float compareProtags(Protagonist p1, Protagonist p2);

}
