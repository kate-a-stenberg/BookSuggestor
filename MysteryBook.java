/*
FINAL PROJECT
MysteryBook class file
12/7/2023
Kate Stenberg
 */

public class MysteryBook extends Book {

    /**
     * This class represents a FantasyBook. It is a subclass of Book.
     * It has attributes title, author, genre, age range, series, number, point of view, time, place, POC presence,
     * LGBTQ presence, protagonist, crime, and mood.
     */

    private String title;
    private String author;
    private Genre genre;
    private AgeRange ageRange;
    private String series;
    private int number;
    private POV pov;
    private TimePeriod timePeriod;
    private Place place;
    private Protagonist protagonist;
    private boolean pocPresence;
    private boolean lgbtqPresence;
    private Crime crime;
    private Mood mood;

    /**
     * Constructs a MysteryBook with all arguments
     * @param title the title of the book
     * @param author the author of the book
     * @param genre the genre of the book
     * @param ageRange the age group the book is for
     * @param series the book series
     * @param number the number in the series
     * @param pov the narrator's point of view
     * @param timePeriod the time setting
     * @param place the place setting
     * @param protagonist the main character of the book
     * @param pocPresence the presence of POC characters
     * @param lgbtqPresence the presence of LGBTQ characters
     * @param crime the crime in the book
     * @param mood the mood of the book
     */
    public MysteryBook (String title, String author, Genre genre, AgeRange ageRange, String series, int number, POV pov, TimePeriod timePeriod, Place place, Protagonist protagonist, boolean pocPresence, boolean lgbtqPresence, Crime crime, Mood mood) {
        super (title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence);
        this.crime = crime;
        this.mood = mood;
    }

    public String getTitle() {
        return super.getTitle();
    }

    public String getAuthor() {
        return super.getAuthor();
    }

    public Genre getGenre() {
        return super.getGenre();
    }

    public AgeRange getAgeRange() {
        return super.getAgeRange();
    }

    public String getSeries() {
        return super.getSeries();
    }

    public int getNumber() {
        return super.getNumber();
    }

    public POV getPOV() {
        return super.getPOV();
    }

    @Override
    public TimePeriod getTimePeriod() {
        return super.getTimePeriod();
    }

    @Override
    public Place getPlace() {
        return super.getPlace();
    }

    public Protagonist getProtagonist() {
        return super.getProtagonist();
    }

    public boolean getPOCpresence() {
        return super.getPOCPresence();
    }

    public boolean getLGBTQPresence() {
        return super.getLGBTQPresence();
    }

    public Crime getCrime() {
        return this.crime;
    }

    public Mood getMood() {
        return this.mood;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}