/*
FINAL PROJECT
Trope class file
12/7/2023
Kate Stenberg
 */

public class Trope {

    /**
     * This class represents a Trope, which has only a Trope type attribute
     */

    private TropeType type;

    /**
     * Constructs a new Trope object based on the Trope type
     * @param type the type of the trope
     */
    Trope (TropeType type) {
        this.type = type;
    }

    public TropeType getTropeType() {
        return this.type;
    }

}
