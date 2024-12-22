/*
FINAL PROJECT
ControllerI interface file
12/7/2023
Kate Stenberg
 */

public class Creature {

    /**
     * This class represents a Creature
     * A Creature has a creature type.
     */

    private final CreatureType type;

    /**
     * Constructs a creature based on the creature type
     * @param type the type of the creature to be created
     */
    Creature (CreatureType type) {
        this.type = type;
    }

}
