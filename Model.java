/*
FINAL PROJECT
Model1 class file
12/7/2023
Kate Stenberg
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Model implements ModelI {

    /**
     * This class represents a Model1 class, which runs all the logical processes in the program.
     * It contains attributes origBook, fileScanner, bookList, results, and bc.
     */

    private Book origBook;
    private ArrayList<Book> bookList;
    private ArrayList<CompBook> results;

    /**
     * Constructs a new Model1 with no arguments
     */
    public Model() {
    }

    /**
     * sets the original book to be used in the model
     * @param origBook the original book to be used in the model
     */
    public void setOrigBook(Book origBook) {
        this.origBook = origBook;
    }

    /**
     * gets the results list of books
     * @return the ArrayList results list of CompBooks
     */
    public ArrayList<CompBook> getResults() {
        return results;
    }

    /**
     * creates a Book object from a String line read in from a csv file
     * a helper method for makeBookList()
     * @param line the String to be used
     * @return a new Book object
     */
    protected Book getBookFromFile(String line) {
        BookBuilder<Genre> genreBuilder = new BookBuilder<Genre>();
        BookBuilder<String> authorBuilder = new BookBuilder<String>();
        BookBuilder<AgeRange> ageRangeBuilder = new BookBuilder<AgeRange>();
        BookBuilder<POV> povBuilder = new BookBuilder<POV>();
        BookBuilder<TimePeriod> timePeriodBuilder = new BookBuilder<TimePeriod>();
        BookBuilder<Place> placeBuilder = new BookBuilder<Place>();
        BookBuilder<Boolean> booleanBuilder = new BookBuilder<Boolean>();
        BookBuilder<LifeStage> lifeStageBuilder = new BookBuilder<LifeStage>();
        BookBuilder<Gender> genderBuilder = new BookBuilder<Gender>();
        BookBuilder<LGBTQ> lgbtqBuilder = new BookBuilder<LGBTQ>();
        BookBuilder<Ethnicity> ethnicityBuilder = new BookBuilder<Ethnicity>();
        BookBuilder<Occupation> occupationBuilder = new BookBuilder<Occupation>();
        BookBuilder<FantasyType> typeBuilder = new BookBuilder<FantasyType>();
        BookBuilder<Culture> cultureBuilder = new BookBuilder<Culture>();
        BookBuilder<ListADT<Race>> raceBuilder = new BookBuilder<ListADT<Race>>();
        BookBuilder<ListADT<Creature>> creatureBuilder = new BookBuilder<ListADT<Creature>>();
        BookBuilder<Crime> crimeBuilder = new BookBuilder<Crime>();
        BookBuilder<Mood> moodBuilder = new BookBuilder<Mood>();
        BookBuilder<Pairing> pairingBuilder = new BookBuilder<Pairing>();
        BookBuilder<RomanceSubgenre> subgenreBuilder = new BookBuilder<RomanceSubgenre>();
        BookBuilder<ListADT<Trope>> tropeListBuilder = new BookBuilder<ListADT<Trope>>();
        String[] tokens = line.split(","); // split up the line by commas into tokens
        if (tokens.length > 0) { // if the line was not empty
            if (tokens[2].equals("FANTASY")) { // if the genre token is Fantasy, make a fantasy book with the correct tokens
                return new FantasyBook(tokens[0], tokens[1], genreBuilder.build(tokens[2], new GenreBuilder()), ageRangeBuilder.build(tokens[3], new AgeRangeBuilder()), tokens[4], Integer.parseInt(tokens[5]), povBuilder.build(tokens[6], new POVBuilder()), timePeriodBuilder.build(tokens[7], new TimePeriodBuilder()), placeBuilder.build(tokens[8], new PlaceBuilder()), new Protagonist(tokens[9], lifeStageBuilder.build(tokens[10], new LifeStageBuilder()), genderBuilder.build(tokens[11], new GenderBuilder()), booleanBuilder.build(tokens[12], new BooleanBuilder()), lgbtqBuilder.build(tokens[13], new LGBTQBuilder()), ethnicityBuilder.build(tokens[14], new EthnicityBuilder()), occupationBuilder.build(tokens[15], new OccupationBuilder())), booleanBuilder.build(tokens[16], new BooleanBuilder()), booleanBuilder.build(tokens[17], new BooleanBuilder()), typeBuilder.build(tokens[18], new FantasyTypeBuilder()), cultureBuilder.build(tokens[19], new CultureBuilder()), booleanBuilder.build(tokens[20], new BooleanBuilder()), raceBuilder.build(tokens[21], new RacesBuilder()), creatureBuilder.build(tokens[22], new CreaturesBuilder()));
            }
            if (tokens[2].equals("MYSTERY")) { // if the genre token is Mystery, make a mystery book with the correct tokens
                return new MysteryBook(tokens[0], tokens[1], genreBuilder.build(tokens[2], new GenreBuilder()), ageRangeBuilder.build(tokens[3], new AgeRangeBuilder()), tokens[4], Integer.parseInt(tokens[5]), povBuilder.build(tokens[6], new POVBuilder()), timePeriodBuilder.build(tokens[7], new TimePeriodBuilder()), placeBuilder.build(tokens[8], new PlaceBuilder()), new Protagonist(tokens[9], lifeStageBuilder.build(tokens[10], new LifeStageBuilder()), genderBuilder.build(tokens[11], new GenderBuilder()), booleanBuilder.build(tokens[12], new BooleanBuilder()), lgbtqBuilder.build(tokens[13], new LGBTQBuilder()), ethnicityBuilder.build(tokens[14], new EthnicityBuilder()), occupationBuilder.build(tokens[15], new OccupationBuilder())), booleanBuilder.build(tokens[16], new BooleanBuilder()), booleanBuilder.build(tokens[17], new BooleanBuilder()), crimeBuilder.build(tokens[23], new CrimeBuilder()), moodBuilder.build(tokens[24], new MoodBuilder()));
            }
            if (tokens[2].equals("ROMANCE")) { // if the genre token is Romance, make a romance book with the correct tokens
                return new RomanceBook(tokens[0], tokens[1], genreBuilder.build(tokens[2], new GenreBuilder()), ageRangeBuilder.build(tokens[3], new AgeRangeBuilder()), tokens[4], Integer.parseInt(tokens[5]), povBuilder.build(tokens[6], new POVBuilder()), timePeriodBuilder.build(tokens[7], new TimePeriodBuilder()), placeBuilder.build(tokens[8], new PlaceBuilder()), new Protagonist(tokens[9], lifeStageBuilder.build(tokens[10], new LifeStageBuilder()), genderBuilder.build(tokens[11], new GenderBuilder()), booleanBuilder.build(tokens[12], new BooleanBuilder()), lgbtqBuilder.build(tokens[13], new LGBTQBuilder()), ethnicityBuilder.build(tokens[14], new EthnicityBuilder()), occupationBuilder.build(tokens[15], new OccupationBuilder())), booleanBuilder.build(tokens[16], new BooleanBuilder()), booleanBuilder.build(tokens[17], new BooleanBuilder()), pairingBuilder.build(tokens[25], new PairingBuilder()), subgenreBuilder.build(tokens[26], new SubgenreBuilder()), tropeListBuilder.build(tokens[27], new TropeListBuilder()), new Protagonist(tokens[28], lifeStageBuilder.build(tokens[29], new LifeStageBuilder()), genderBuilder.build(tokens[30], new GenderBuilder()), booleanBuilder.build(tokens[31], new BooleanBuilder()), lgbtqBuilder.build(tokens[32], new LGBTQBuilder()), ethnicityBuilder.build(tokens[33], new EthnicityBuilder()), occupationBuilder.build(tokens[34], new OccupationBuilder())), Integer.parseInt(tokens[35]));
            } else { // if the genre token is something else, make a general Book object
                return new Book(tokens[0], tokens[1], genreBuilder.build(tokens[2], new GenreBuilder()), ageRangeBuilder.build(tokens[3], new AgeRangeBuilder()), tokens[4], Integer.parseInt(tokens[5]), povBuilder.build(tokens[6], new POVBuilder()), timePeriodBuilder.build(tokens[7], new TimePeriodBuilder()), placeBuilder.build(tokens[8], new PlaceBuilder()), new Protagonist(tokens[9], lifeStageBuilder.build(tokens[10], new LifeStageBuilder()), genderBuilder.build(tokens[11], new GenderBuilder()), booleanBuilder.build(tokens[12], new BooleanBuilder()), lgbtqBuilder.build(tokens[13], new LGBTQBuilder()), ethnicityBuilder.build(tokens[14], new EthnicityBuilder()), occupationBuilder.build(tokens[15], new OccupationBuilder())), booleanBuilder.build(tokens[16], new BooleanBuilder()), booleanBuilder.build(tokens[17], new BooleanBuilder()));
            }
        }
        else { // if the line was empty, return null
            return null;
        }
    }

    /**
     * creates an ArrayList of Books from a csv file
     * @return new ArrayList of Book type
     * @throws FileNotFoundException if the target file is not found
     */
    public ArrayList<Book> makeBookList() throws FileNotFoundException {
        String line; // initialize line
        Book book; // initialize book
        bookList = new ArrayList<Book>(); // define bookList
        File file = new File("BookFile.csv"); // get csv file
        Scanner fileScanner = new Scanner(file); // create a scanner
        fileScanner.nextLine(); // skip the first line of the csv file
        while (fileScanner.hasNext()) { // while there is at least one remaining line
            line = fileScanner.nextLine(); // get a line in the file
            book = getBookFromFile(line); // convert the line to a book object
            bookList.add(book); // add the book to the bookList
        }
        return bookList;
    }

    /**
     * gets the bookList of books
     * @return the ArrayList bookList of Books
     */
    public ArrayList<Book> getBookList() {
        return this.bookList;
    }

    /**
     * Creates the results list of books by similarity
     * @return a new ArrayList of CompBook type
     */
    public ArrayList<CompBook> makeResultsList() {
        BookComparerI bc = new BookComparer(); // create a new BookComparer to use
        results = new ArrayList<CompBook>(bookList.size()); // create results list to be same size as bookList
        // compare origBook to each Book in bookList, make new CompBook with similarity value and add to results list
        bookList.forEach((b)->results.add(new CompBook(b, bc.compareBooks(b, origBook))));
        return results;
    }

    /**
     * Sorts the objects in the results list using a CompBookComparator
     */
    public void sortResults() {
        results.sort(new CompBookComparator());
    }

    /**
     * Filters the objects in the results list
     */
    public void filterResults() {
        results.removeIf(b->b.getSimilarity()<.50); // removes any results that are less than 50% similar
        results.removeIf(b->b.getNumber()>1); // removes any results that are sequels
        results.removeIf(b->!b.getGenre().equals(origBook.getGenre())); // removes any results of a different genre
    }

}
