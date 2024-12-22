/*
FINAL PROJECT
Book class file
12/7/2023
Kate Stenberg
 */

public class Book {

    /**
     * This class represents a Book. It has attributes title, author, genre, age range, series, number,
     * point of view, time, place, POC presence, LGBTQ presence, and protagonist.
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

    /**
     * Constructs a Book object with all arguments.
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
     */
    public Book (String title, String author, Genre genre, AgeRange ageRange, String series, int number, POV pov, TimePeriod timePeriod, Place place, Protagonist protagonist, boolean pocPresence, boolean lgbtqPresence) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.ageRange = ageRange;
        this.series = series;
        this.number = number;
        this.pov = pov;
        this.timePeriod = timePeriod;
        this.place = place;
        this.protagonist = protagonist;
        this.pocPresence = false;
        this.lgbtqPresence = false;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Genre getGenre() {
        return this.genre;
    }

    public AgeRange getAgeRange() {
        return this.ageRange;
    }

    public String getSeries() {
        return this.series;
    }

    public int getNumber() {
        return this.number;
    }

    public POV getPOV() {
        return this.pov;
    }

    public TimePeriod getTimePeriod() {
        return this.timePeriod;
    }

    public Place getPlace() {
        return this.place;
    }

    public Protagonist getProtagonist() {
        return this.protagonist;
    }

    public boolean getPOCPresence() {
        return this.pocPresence;
    }

    public boolean getLGBTQPresence() {
        return this.lgbtqPresence;
    }

    public void setPOV(POV pov) {
        this.pov = pov;
    }

    public void setTimePeriod(TimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public void setPlace(Place place) {
        this.place = place;
    }

    public void setProtagonist(Protagonist protagonist) {
        this.protagonist = protagonist;
    }

    public void setPOCPresenceTrue () {
        this.pocPresence = true;
    }

    public void setLGBTQPresenceTrue() {
        this.lgbtqPresence = true;
    }

    @Override
    public String toString() {
        if (number == 0) {
            return "'" + this.title + "' by " + this.author;
        }
        else {
            return "'" + this.title + "' by " + this.author + " (" + this.series + " #" + this.number + ")";
        }
    }

}
