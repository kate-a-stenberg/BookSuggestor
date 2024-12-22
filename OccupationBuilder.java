/*
FINAL PROJECT
OccupationBuilder class file
12/7/2023
Kate Stenberg
 */

public class OccupationBuilder implements BuilderI<Occupation> {

    /**
     * This class represents a builder to make an Occupation enum.
     * It implements the Builder interface of type Occupation.
     */

    public OccupationBuilder() {}

    /**
     * Converts a piece of data from a String to an Occupation enum
     * @param input the data to convert
     * @return an Occupation enum type
     */
    @Override
    public Occupation build(String input) {
        Occupation protagOccupation;
        if (input.equalsIgnoreCase("TELEVISION")) {
            protagOccupation = Occupation.TELEVISION;
        }
        else if (input.equalsIgnoreCase("NOBILITY")) {
            protagOccupation = Occupation.NOBILITY;
        }
        else if (input.equalsIgnoreCase("SCIENCE")) {
            protagOccupation = Occupation.SCIENCE;
        }
        else if (input.equalsIgnoreCase("CELEBRITY")) {
            protagOccupation = Occupation.CELEBRITY;
        }
        else if (input.equalsIgnoreCase("JOURNALIST")) {
            protagOccupation = Occupation.JOURNALIST;
        }
        else if (input.equalsIgnoreCase("CHEF")) {
            protagOccupation = Occupation.CHEF;
        }
        else if (input.equalsIgnoreCase("CORPORATE")) {
            protagOccupation = Occupation.CORPORATE;
        }
        else if (input.equalsIgnoreCase("STUDENT")) {
            protagOccupation = Occupation.STUDENT;
        }
        else if (input.equalsIgnoreCase("PARENT/GUARDIAN")) {
            protagOccupation = Occupation.PARENTGUARDIAN;
        }
        else if (input.equalsIgnoreCase("OFFICE")) {
            protagOccupation = Occupation.OFFICE;
        }
        else if (input.equalsIgnoreCase("TRADE")) {
            protagOccupation = Occupation.TRADE;
        }
        else if (input.equalsIgnoreCase("SMALL BUSINESS")) {
            protagOccupation = Occupation.SMALLBUSINESS;
        }
        else if (input.equalsIgnoreCase("HEALTH CARE")) {
            protagOccupation = Occupation.HEALTHCARE;
        }
        else if (input.equalsIgnoreCase("MAGE")) {
            protagOccupation = Occupation.MAGE;
        }
        else if (input.equalsIgnoreCase("CHILD")) {
            protagOccupation = Occupation.CHILD;
        }
        else if (input.equalsIgnoreCase("IDLE")) {
            protagOccupation = Occupation.IDLE;
        }
        else if (input.equalsIgnoreCase("SOCIALITE")) {
            protagOccupation = Occupation.SOCIALITE;
        }
        else if (input.equalsIgnoreCase("WAR")) {
            protagOccupation = Occupation.WAR;
        }
        else if (input.equalsIgnoreCase("POLITICS")) {
            protagOccupation = Occupation.POLITICS;
        }
        else if (input.equalsIgnoreCase("LABOR")) {
            protagOccupation = Occupation.LABOR;
        }
        else if (input.equalsIgnoreCase("HOSPITALITY")) {
            protagOccupation = Occupation.HOSPITALITY;
        }
        else if (input.equalsIgnoreCase("COVERT")) {
            protagOccupation = Occupation.COVERT;
        }
        else if (input.equalsIgnoreCase("PUBLIC SERVICE")) {
            protagOccupation = Occupation.PUBLICSERVICE;
        }
        else if (input.equalsIgnoreCase("LAW")) {
            protagOccupation = Occupation.LAW;
        }
        else if (input.equalsIgnoreCase("ACADEMIC")) {
            protagOccupation = Occupation.ACADEMIC;
        }
        else if (input.equalsIgnoreCase("CREATIVE")) {
            protagOccupation = Occupation.CREATIVE;
        }
        else if (input.equalsIgnoreCase("OTHER")) {
            protagOccupation = Occupation.OTHER;
        }
        else if (input.equalsIgnoreCase("EDUCATION")) {
            protagOccupation = Occupation.EDUCATION;
        }
        else if (input.equalsIgnoreCase("ROYAL")) {
            protagOccupation = Occupation.ROYAL;
        }
        else if (input.equalsIgnoreCase("ATHLETE")) {
            protagOccupation = Occupation.ATHLETE;
        }
        else if (input.equalsIgnoreCase("POLICE")) {
            protagOccupation = Occupation.POLICE;
        }
        else if (input.equalsIgnoreCase("SERVANT")) {
            protagOccupation = Occupation.SERVANT;
        }
        else if (input.equalsIgnoreCase("CRIME")) {
            protagOccupation = Occupation.CRIME;
        }
        else if (input.equalsIgnoreCase("PIRATE")) {
            protagOccupation = Occupation.PIRATE;
        }
        else if (input.equalsIgnoreCase("HUNTER")) {
            protagOccupation = Occupation.HUNTER;
        }
        else if (input.equalsIgnoreCase("RETAIL")) {
            protagOccupation = Occupation.RETAIL;
        }
        else if (input.equalsIgnoreCase("FINANCE")) {
            protagOccupation = Occupation.FINANCE;
        }
        else if (input.equalsIgnoreCase("BOOKS")) {
            protagOccupation = Occupation.BOOKS;
        }
        else if (input.equalsIgnoreCase("MULTIPLE")) {
            protagOccupation = Occupation.MULTIPLE;
        }
        else {
            protagOccupation = null;
        }
        return protagOccupation;
    }

}
