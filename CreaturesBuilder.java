/*
FINAL PROJECT
CreaturesBuilder class file
12/7/2023
Kate Stenberg
 */

public class CreaturesBuilder implements BuilderI<ListADT<Creature>> {

    /**
     * This class represents a CreaturesBuilder object, whose purpose is to create a Creatures list.
     * It implements the Builder interface of type ListADT<Creature>
     */

    /**
     * Constructs a CreaturesBuilder object
     */
    public CreaturesBuilder() {}

    /**
     * Converts a piece of data from a String to a ListADT<Creature>
     * @param input the String to convert
     * @return a ListADT of Creatures
     */
    @Override
    public ListADT<Creature> build(String input) {
        ListADT<Creature> creatures = new ListADT<Creature>();
        if (input.indexOf("DRAGON") != -1) {
            creatures.addNode(Creatures.creature1);
        }
        if (input.indexOf("UNICORN") != -1) {
            creatures.addNode(Creatures.creature2);
        }
        if (input.indexOf("WYVERN") != -1) {
            creatures.addNode(Creatures.creature3);
        }
        if (input.indexOf("DEMON") != -1) {
            creatures.addNode(Creatures.creature4);
        }
        if (input.indexOf("UNDEAD") != -1) {
            creatures.addNode(Creatures.creature5);
        }
        if (input.indexOf("GHOST") != -1) {
            creatures.addNode(Creatures.creature6);
        }
        if (input.indexOf("CENTAUR") != -1) {
            creatures.addNode(Creatures.creature7);
        }
        if (input.indexOf("MINOTAUR") != -1) {
            creatures.addNode(Creatures.creature8);
        }
        if (input.indexOf("DJINN") != -1) {
            creatures.addNode(Creatures.creature9);
        }
        if (input.indexOf("IFRIT") != -1) {
            creatures.addNode(Creatures.creature10);
        }
        return creatures;
    }

}
