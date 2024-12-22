/*
FINAL PROJECT
FantasyBook class file
12/7/2023
Kate Stenberg
 */

public class FantasyBook extends Book {

    /**
     * This class represents a FantasyBook. It is a subclass of Book.
     * It has attributes title, author, genre, age range, series, number, point of view, time, place, POC presence,
     * LGBTQ presence, protagonist, fantasy type, culture, magic, races, and creatures.
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
    private FantasyType type;
    private Culture culture;
    private boolean magic;
    private ListADT<Race> races;
    private ListADT<Creature> creatures;

    /**
     * Constructs a FantasyBook object with all arguments.
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
     * @param type the Fantasy Type of the book
     * @param culture the culture the world of the book is based on
     * @param magic the presence of magic in the book
     * @param races the fantasy races present in the book
     * @param creatures the fantasy creatures present in the book
     */
    public FantasyBook (String title, String author, Genre genre, AgeRange ageRange, String series, int number, POV pov, TimePeriod timePeriod, Place place, Protagonist protagonist, boolean pocPresence, boolean lgbtqPresence, FantasyType type, Culture culture, boolean magic, ListADT<Race> races, ListADT<Creature> creatures) {
        super (title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence);
        this.genre = Genre.FANTASY;
        this.type = type;
        this.culture = culture;
        this.magic = magic;
        this.races = races;
        this.creatures = creatures;
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

    public FantasyType getType() {
        return this.type;
    }

    public Culture getCulture() {
        return this.culture;
    }

    public boolean getMagic() {
        return this.magic;
    }

    public ListADT<Race> getRaces() {
        return this.races;
    }

    public ListADT<Creature> getCreatures() {
        return this.creatures;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}