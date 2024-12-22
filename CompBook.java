/*
FINAL PROJECT
CompBook class file
12/7/2023
Kate Stenberg
 */

public class CompBook extends Book {

    /**
     * This class represents a CompBook object.
     * It extends the Book class.
     * It has attributes title, author, genre, age range, series, number,
     * point of view, time, place, POC presence, LGBTQ presence, protagonist, and a similarity.
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
    private final float similarity;

    /**
     * Constructs a CompBook using a Book and a similarity.
     * @param book the Book object this will extend
     * @param similarity the similarity to another Book object
     */
    public CompBook (Book book, float similarity) {
        super (book.getTitle(), book.getAuthor(), book.getGenre(), book.getAgeRange(), book.getSeries(), book.getNumber(), book.getPOV(), book.getTimePeriod(), book.getPlace(), book.getProtagonist(), book.getPOCPresence(), book.getLGBTQPresence());
        this.similarity = similarity;
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

    public TimePeriod getTimePeriod() {
        return super.getTimePeriod();
    }

    public Place getPlace() {
        return super.getPlace();
    }

    public Protagonist getProtagonist() {
        return super.getProtagonist();
    }

    public boolean getLGBTQPresence() {
        return super.getLGBTQPresence();
    }

    public boolean getPOCPresence() {
        return super.getPOCPresence();
    }

    public float getSimilarity() {
        return this.similarity;
    }

    @Override
    public String toString() {
        return super.toString() + "; " + similarity*100 + "% similar";
    }

}
