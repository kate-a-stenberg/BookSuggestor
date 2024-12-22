/*
FINAL PROJECT
RomanceBook class file
12/7/2023
Kate Stenberg
 */

public class RomanceBook extends Book {

    /**
     * This class represents a FantasyBook. It is a subclass of Book.
     * It has attributes title, author, genre, age range, series, number, point of view, time, place, POC presence,
     * LGBTQ presence, protagonist, pairing, subgenre, tropes list, love interest, and spice level.
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
    private Pairing pairing;
    private RomanceSubgenre subgenre;
    private ListADT<Trope> tropes;
    private Protagonist loveInterest;
    private int spice;

    /**
     * Constructs a new RomanceBook with all attributes
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
     * @param pairing the romantic pairing type
     * @param subgenre the subgenre of the book
     * @param tropes a list of tropes in the book
     * @param loveInterest the love interest
     * @param spice the spice level of the book
     */
    public RomanceBook (String title, String author, Genre genre, AgeRange ageRange, String series, int number, POV pov, TimePeriod timePeriod, Place place, Protagonist protagonist, boolean pocPresence, boolean lgbtqPresence, Pairing pairing, RomanceSubgenre subgenre, ListADT<Trope> tropes, Protagonist loveInterest, int spice) {
        super (title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence);
        this.pairing = pairing;
        this.subgenre = subgenre;
        this.tropes = tropes;
        this.loveInterest = loveInterest;
        this.spice = spice;
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

    public Pairing getPairing() {
        return this.pairing;
    }

    public RomanceSubgenre getSubgenre() {
        return this.subgenre;
    }

    public ListADT<Trope> getTropes() {
        return this.tropes;
    }

    public Protagonist getLoveInterest() {
        return this.loveInterest;
    }

    public int getSpice() {
        return this.spice;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}