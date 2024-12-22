/*
FINAL PROJECT
Protagonist class file
12/7/2023
Kate Stenberg
 */

public class Protagonist {

    /**
     * This class represents a Protagonist or book character.
     It has as attributes a name, lifeStage, gender, disability, lgbtq, ethnicity, and occupation.
     */

    private String name;
    private LifeStage lifeStage;
    private Gender gender;
    private boolean disability;
    private LGBTQ lgbtq;
    private Ethnicity ethnicity;
    private Occupation occupation;

    /**
     * Constructs a new Protagonist object with all arguments
     * @param name the name of the protagonist
     * @param lifeStage what life stage they are in
     * @param gender their gender
     * @param disability whether they are disabled or not
     * @param lgbtq their lgbtq status
     * @param ethnicity their ethnicity
     * @param occupation their occupation
     */
    Protagonist (String name, LifeStage lifeStage, Gender gender, boolean disability, LGBTQ lgbtq, Ethnicity ethnicity, Occupation occupation) {
        this.name = name;
        this.lifeStage = lifeStage;
        this.gender = gender;
        this.disability = disability;
        this.lgbtq = lgbtq;
        this.ethnicity = ethnicity;
        this.occupation = occupation;
    }

    public String getName() {
        return this.name;
    }

    public LifeStage getLifeStage() {
        return this.lifeStage;
    }

    public Gender getGender() {
        return this.gender;
    }

    public boolean getDisability() {
        return this.disability;
    }

    public LGBTQ getLgbtq() {
        return this.lgbtq;
    }

    public Ethnicity getEthnicity() {
        return this.ethnicity;
    }

    public Occupation getOccupation() {
        return this.occupation;
    }

}
