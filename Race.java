/*
FINAL PROJECT
Race class file
12/7/2023
Kate Stenberg
 */

public class Race {

    /**
     * This class represents a Race object, which has only a RaceType attribute
     */

    private RaceType type;

    /**
     * Constructs a new Race object based on the type
     * @param type the RaceType of the object
     */
    Race (RaceType type) {
        this.type = type;
    }

    public RaceType getRaceType() {
        return this.type;
    }

}
