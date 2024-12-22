/*
FINAL PROJECT
LifeStageBuilder class file
12/7/2023
Kate Stenberg
 */

public class LifeStageBuilder implements BuilderI<LifeStage> {

    /**
     * This class represents a builder to make a LifeStage enum.
     * It implements the Builder interface of type LifeStage.
     */

    public LifeStageBuilder() {}

    /**
     * Converts a piece of data from a String to a LifeStage enum
     * @param input the data to convert
     * @return a LifeStage enum type
     */
    @Override
    public LifeStage build(String input) {
        LifeStage protagLifeStage;
        if (input.equalsIgnoreCase("CHILD")) {
            protagLifeStage = LifeStage.CHILD;
        }
        else if (input.equalsIgnoreCase("PRETEEN")) {
            protagLifeStage = LifeStage.PRETEEN;
        }
        else if (input.equalsIgnoreCase("TEEN")) {
            protagLifeStage = LifeStage.TEEN;
        }
        else if (input.equalsIgnoreCase("YOUNG ADULT")) {
            protagLifeStage = LifeStage.YOUNGADULT;
        }
        else if (input.equalsIgnoreCase("ADULT")) {
            protagLifeStage = LifeStage.ADULT;
        }
        else if (input.equalsIgnoreCase("MIDDLE AGED")) {
            protagLifeStage = LifeStage.MIDDLEAGED;
        }
        else if (input.equalsIgnoreCase("OLD ADULT")) {
            protagLifeStage = LifeStage.OLDADULT;
        }
        else if (input.equalsIgnoreCase("IMMORTAL")) {
            protagLifeStage = LifeStage.IMMORTAL;
        }
        else if (input.equalsIgnoreCase("MULTIPLE")) {
            protagLifeStage = LifeStage.MULTIPLE;
        }
        else {
            protagLifeStage = null;
        }
        return protagLifeStage;
    }

}
