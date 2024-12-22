/*
FINAL PROJECT
ProtagonistComparer class file
12/7/2023
Kate Stenberg
 */

/**
 * This class represents a ProtagonistComparer.
 */
public class ProtagonistComparer implements ProtagonistComparerI {

    /**
     * Constructs a new ProtagonistComparer with no arguments
     */
    public ProtagonistComparer() {}

    /**
     * Compares two protagonists based on their common attributes
     * @param p1 the first Protagonist to be compared
     * @param p2 the second Protagonist to be compared
     * @return a decimal number reflecting how similar the Protagonists are
     */
    public float compareProtags(Protagonist p1, Protagonist p2) {
        // for each attribute:
        // if the attributes match between protagonist, return the assigned point value for that attribute
        // if the attributes don't match, return a zero for that attribute
        float ageMatch = 0;
        if (p1.getLifeStage() == p2.getLifeStage()) {
            ageMatch = Weights.LIFESTAGE;
        }
        float genderMatch = 0;
        if (p1.getGender() == p2.getGender()) {
            genderMatch = Weights.GENDER;
        }
        float disabilityMatch = 0;
        if (p1.getDisability() == p2.getDisability()) {
            disabilityMatch = Weights.DISABILITY;
        }
        float lgbtqMatch = 0;
        if (p1.getLgbtq() == p2.getLgbtq()) {
            lgbtqMatch = Weights.LGBTQ;
        }
        float ethMatch = 0;
        if (p1.getEthnicity() == p2.getEthnicity()) {
            ethMatch = Weights.ETHNICITY;
        }
        float occMatch = 0;
        if (p1.getOccupation() == p2.getOccupation()) {
            occMatch = Weights.OCCUPATION;
        }

        // numerator is the actual match values of all the attributes
        float totalMatch = Weights.LIFESTAGE + Weights.GENDER + Weights.DISABILITY + Weights.LGBTQ + Weights.ETHNICITY + Weights.OCCUPATION;
        // denominator is the total possible match values of all the attributes
        float combMatch = ageMatch + genderMatch + disabilityMatch + lgbtqMatch + ethMatch + occMatch;
        return combMatch/totalMatch;
    }

}
