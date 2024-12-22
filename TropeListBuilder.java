/*
FINAL PROJECT
TropeListBuilder class file
12/7/2023
Kate Stenberg
 */

public class TropeListBuilder implements BuilderI<ListADT<Trope>> {

    /**
     * This class represents a builder to make a ListADT<Trope>.
     * It implements the Builder interface of type ListADT<Trope>.
     */

    public TropeListBuilder() {}

    /**
     * Converts a piece of data from a String to a ListADT<Trope>
     * @param input the data to convert
     * @return a ListADT<Trope>
     */
    @Override
    public ListADT<Trope> build(String input) {
        ListADT<Trope> tropes = new ListADT<Trope>();
        // for each trope, if it is represented in the string, get its associated trope object and add it to the list
        if (input.indexOf("AGE GAP") != -1) {
            tropes.addNode(Tropes.trope1);
        }
        if (input.indexOf("BOSS/EMPLOYEE") != -1) {
            tropes.addNode(Tropes.trope2);
        }
        if (input.indexOf("COWORKERS") != -1) {
            tropes.addNode(Tropes.trope3);
        }
        if (input.indexOf("CLASS DIFFERENCE") != -1) {
            tropes.addNode(Tropes.trope4);
        }
        if (input.indexOf("GRUMPY/SUNSHINE") != -1) {
            tropes.addNode(Tropes.trope5);
        }
        if (input.indexOf("ARRANGED MARRIAGE") != -1) {
            tropes.addNode(Tropes.trope6);
        }
        if (input.indexOf("FAKE RELATIONSHIP") != -1) {
            tropes.addNode(Tropes.trope7);
        }
        if (input.indexOf("FATED MATES") != -1) {
            tropes.addNode(Tropes.trope8);
        }
        if (input.indexOf("FORBIDDEN") != -1) {
            tropes.addNode(Tropes.trope9);
        }
        if (input.indexOf("FORCED PROXIMITY") != -1) {
            tropes.addNode(Tropes.trope10);
        }
        if (input.indexOf("FRIENDS TO LOVERS") != -1) {
            tropes.addNode(Tropes.trope11);
        }
        if (input.indexOf("ENEMIES TO LOVERS") != -1) {
            tropes.addNode(Tropes.trope12);
        }
        if (input.indexOf("FWB") != -1) {
            tropes.addNode(Tropes.trope13);
        }
        if (input.indexOf("INSTALOVE") != -1) {
            tropes.addNode(Tropes.trope14);
        }
        if (input.indexOf("SLOW BURN") != -1) {
            tropes.addNode(Tropes.trope15);
        }
        if (input.indexOf("MARRIAGE OF CONVENIENCE") != -1) {
            tropes.addNode(Tropes.trope16);
        }
        if (input.indexOf("LOVE TRIANGLE") != -1) {
            tropes.addNode(Tropes.trope17);
        }
        if (input.indexOf("SECOND CHANCES") != -1) {
            tropes.addNode(Tropes.trope18);
        }
        if (input.indexOf("SECRET RELATIONSHIP") != -1) {
            tropes.addNode(Tropes.trope19);
        }
        if (input.indexOf("SIBLING'S BEST FRIEND") != -1) {
            tropes.addNode(Tropes.trope20);
        }
        if (input.indexOf("PINING") != -1) {
            tropes.addNode(Tropes.trope21);
        }
        return tropes;
    }

}
