/*
FINAL PROJECT
RacesBuilder class file
12/7/2023
Kate Stenberg
 */

public class RacesBuilder implements BuilderI<ListADT<Race>> {

    /**
     * This class represents a builder to make a ListADT<Race>.
     * It implements the Builder interface of type ListADT<Race>.
     */

    public RacesBuilder() {}

    /**
     * Converts a piece of data from a String to a ListADT<Race>
     * @param input the data to convert
     * @return a ListADT<Race>
     */
    @Override
    public ListADT<Race> build(String input) {
        ListADT<Race> races = new ListADT<Race>();
        // for each race, if the race is in the string, get the Race object and add it to the list
        if (input.indexOf("ELVES") != -1) {
            races.addNode(Races.race1);
        }
        if (input.indexOf("DWARVES") != -1) {
            races.addNode(Races.race2);
        }
        if (input.indexOf("GOBLINS") != -1) {
            races.addNode(Races.race3);
        }
        if (input.indexOf("ORCS") != -1) {
            races.addNode(Races.race4);
        }
        if (input.indexOf("FAE") != -1) {
            races.addNode(Races.race5);
        }
        if (input.indexOf("VAMPIRES") != -1) {
            races.addNode(Races.race6);
        }
        if (input.indexOf("GODS") != -1) {
            races.addNode(Races.race7);
        }
        if (input.indexOf("WEREWOLVES") != -1) {
            races.addNode(Races.race8);
        }
        if (input.indexOf("MERFOLK") != -1) {
            races.addNode(Races.race9);
        }
        if (input.indexOf("SHAPESHIFTERS") != -1) {
            races.addNode(Races.race10);
        }
        if (input.indexOf("DEMIGODS") != -1) {
            races.addNode(Races.race11);
        }
        if (input.indexOf("WITCHES") != -1) {
            races.addNode(Races.race12);
        }
        if (input.indexOf("MAGES") != -1) {
            races.addNode(Races.race13);
        }
        if (input.indexOf("ANGELS") != -1) {
            races.addNode(Races.race14);
        }
        return races;
    }

}
