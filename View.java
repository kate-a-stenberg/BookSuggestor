/*
FINAL PROJECT
View1 class file
12/7/2023
Kate Stenberg
 */

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class View implements ViewI {

    /**
     * This class represents a View1 class, which runs all the user interaction operations in this application.
     * It has as attributes a scanner and a number of builders.
     */

    Scanner scanner;
    BookBuilder<Genre> genreBuilder = new BookBuilder<Genre>();
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

    /**
     * Constructs a new View1 object with no arguments.
     */
    public View() {
        this.scanner = new Scanner(System.in);
    }

    /**
     * gets the book title from the user via the scanner.
     * helper function
     * @return the title
     */
    private String getTitle() {
        String inputTitle = "";
        // get the title from the user via the scanner
        System.out.println("Please enter the title of the book:");
        try {
            inputTitle = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        return inputTitle;
    }

    /**
     * gets the book author from the user via the scanner.
     * helper function
     * @return the author
     */
    private String getAuthor() {
        String inputAuthor = "";
        // get the author from the user via the scanner
        System.out.println("Please enter the author of the book:");
        try {
            inputAuthor = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        return inputAuthor;
    }

    /**
     * gets the book genre from the user via the scanner.
     * helper function
     * @return the genre
     */
    private Genre getGenre() {
        String inputGenre = "";
        // get the genre from the user via the scanner
        System.out.println("Please enter the genre of the book (FANTASY, MYSTERY, or ROMANCE):");
        try {
            inputGenre = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
            scanner.next();
        }
        // convert the string to a Genre
        return genreBuilder.build(inputGenre, new GenreBuilder());
    }

    /**
     * gets the book age range from the user via the scanner.
     * helper function
     * @return the age range
     */
    private AgeRange getAgeRange() {
        String inputAgeRange = "";
        // get the age range from the user via the scanner
        System.out.println("Please enter the age range of the book (MIDDLE GRADE, YA, NA, or ADULT):");
        try {
            inputAgeRange = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // conver the string to a Genre
        return ageRangeBuilder.build(inputAgeRange, new AgeRangeBuilder());
    }

    /**
     * gets the book series from the user via the scanner.
     * helper function
     * @return the series name
     */
    private String getSeries() {
        String inputSeries = "";
        // get the series from the user via the scanner
        System.out.println("Please enter the book series (if it is not in a series, type STANDALONE):");
        try {
            inputSeries = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        return inputSeries;
    }

    /**
     * gets the book series number from the user via the scanner.
     * helper function
     * @return the series number
     */
    private int getNumber() {
        String inputNumber = "";
        // get the series number from the user via the scanner
        System.out.println("Please enter the number of the book in the series (if it is not in a series, enter 0):");
        try {
            inputNumber = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a number!");
        }
        // convert the string to an integer
        return Integer.parseInt(inputNumber);
    }

    /**
     * gets the book narration point of view from the user via the scanner.
     * helper function
     * @return the POV
     */
    private POV getPOV() {
        String inputPOV = "";
        // get the POV from the user via the scanner
        System.out.println("Please enter the narration point of view of the book (FIRST, FIRST MULTIPLE, THIRD, THIRD MULTIPLE, or MIXED): ");
        try {
            inputPOV = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a POV
        return povBuilder.build(inputPOV, new POVBuilder());
    }

    /**
     * gets the book time setting from the user via the scanner.
     * helper function
     * @return the time period
     */
    private TimePeriod getTimePeriod() {
        String inputTimePeriod = "";
        // get the time setting from the user via the scanner
        System.out.println("Please enter the time period of the book (MODERN, FUTURE, FANTASY, ANCIENT, MEDIEVAL, COLONIAL, 19TH CENTURE, 20TH CENTURY, or MULTIPLE): ");
        try {
            inputTimePeriod = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a TimePeriod
        return timePeriodBuilder.build(inputTimePeriod, new TimePeriodBuilder());
    }

    /**
     * gets the book place setting from the user via the scanner.
     * helper function
     * @return the book Place
     */
    private Place getPlace() {
        String inputPlace = "";
        // get the place setting from the user via the scanner
        System.out.println("Please enter the place of the book (CITY, TOWN, VILLAGE, SUBURB, COUNTRY, WILDERNESS, SCHOOL/COLLEGE, SPACE, COURT, or MULTIPLE): ");
        try {
            inputPlace = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a Place
        return placeBuilder.build(inputPlace, new PlaceBuilder());
    }

    /**
     * gets the book POC presence from the user via the scanner.
     * helper function
     * @return the POC presence
     */
    private boolean getPOCPresence() {
        String inputPOC = "";
        // gets the POC presence from the user via the scanner
        System.out.println("Is there a strong POC presence in this book? (Y for yes, N for no):");
        try {
            inputPOC = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // converts the string to a boolean
        return booleanBuilder.build(inputPOC, new BooleanBuilder());
    }

    /**
     * gets the book LGBTQ presence from the user via the scanner.
     * helper function
     * @return the LGBTQ presence
     */
    private boolean getLGBTQPresence() {
        String inputLGBTQ = "";
        // get the LGBTQ presence from the user via the scanner
        System.out.println("Is there a strong LGBTQ presence in this book? (Y for yes, N for no):");
        try {
            inputLGBTQ = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // converts the string to a boolean
        return booleanBuilder.build(inputLGBTQ, new BooleanBuilder());
    }

    /**
     * gets the protagonist name from the user via the scanner.
     * helper function
     * @return the protagonist name
     */
    private String getProtagName() {
        String inputProtagName = "";
        // get the protagonist name from the user via the scanner
        System.out.println("Enter the protagonist's name:");
        try {
            inputProtagName = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        return inputProtagName;
    }

    /**
     * gets the protagonist life stage from the user via the scanner.
     * helper function
     * @return the protagonist's LifeStage
     */
    private LifeStage getProtagLifeStage() {
        String inputProtagLifeStage = "";
        // get the protagonist's life stage from the user via the scanner
        System.out.println("Enter the protagonist's age (CHILD, PRETEEN, TEEN, YOUNG ADULT, ADULT, MIDDLE AGED, OLD ADULT, IMMORTAL, or MULTIPLE):");
        try {
            inputProtagLifeStage = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a LifeStage
        return lifeStageBuilder.build(inputProtagLifeStage, new LifeStageBuilder());
    }

    /**
     * gets the protagonist gender from the user via the scanner.
     * helper function
     * @return the protagonist's Gender
     */
    private Gender getProtagGender() {
        String inputProtagGender = "";
        // get the gender from the user via the scanner
        System.out.println("Enter the protagonist's gender (MALE, FEMALE, or NONBINARY):");
        try {
            inputProtagGender = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a Gender
        return genderBuilder.build(inputProtagGender, new GenderBuilder());
    }

    /**
     * gets the protagonist disability status from the user via the scanner.
     * helper function
     * @return the protagonist's disability status (a boolean)
     */
    private boolean getProtagDisability() {
        String inputProtagDisability = "";
        // get the disability status from the user via the scanner
        System.out.println("Is the protagonist disabled? (Y for yes, N for no):");
        try {
            inputProtagDisability = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a boolean
        return booleanBuilder.build(inputProtagDisability, new BooleanBuilder());
    }

    /**
     * gets the protagonist LGBTQ status from the user via the scanner.
     * helper function
     * @return the protagonist's LGBTQ
     */
    private LGBTQ getProtagLGBTQ() {
        String inputProtagLGBTQ = "";
        // get the LGBTQ status from the user via the scanner
        System.out.println("Enter the protagonist's LGBTQ identity (STRAIGHT, LESBIAN, GAY, BISEXUAL, TRANS, or QUEER):");
        try {
            inputProtagLGBTQ = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a LGBTQ
        return lgbtqBuilder.build(inputProtagLGBTQ, new LGBTQBuilder());
    }

    /**
     * gets the protagonist ethnicity from the user via the scanner.
     * helper function
     * @return the protagonist's Ethnicity
     */
    private Ethnicity getProtagEthnicity() {
        String inputProtagEthnicity = "";
        // get the protagonist's ethnicity from the user via the scanner
        System.out.println("Enter the protagonist's ethnicity (WHITE, BLACK, ASIAN, INDIAN, MIDDLE EASTERN, MIXED RACE, INDIGENOUS, or HISPANIC):");
        try {
            inputProtagEthnicity = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to an Ethnicity
        return ethnicityBuilder.build(inputProtagEthnicity, new EthnicityBuilder());
    }

    /**
     * gets the protagonist occupation from the user via the scanner.
     * helper function
     * @return the protagonist's Occupation
     */
    private Occupation getProtagOccupation() {
        String inputProtagOccupation = "";
        // get the occupation from the user via the scanner
        System.out.println("Enter the protagonist's occupation (ACADEMIC, ATHLETE, BOOKS, CELEBRITY, CHEF, CHILD, CORPORATE, COVERT, CREATIVE, CRIME, EDUCATION, FINANCE, HEALTH CARE, HOSPITALITY, HUNTER, IDLE, JOURNALIST, LABOR, LAW, MAGE, MULTIPLE, NOBILITY, OFFICE, OTHER, PARENT/GUARDIAN, PIRATE, POLICE, POLITICS, PUBLIC SERVICE, RETAIL, ROYAL, SCIENCE, SERVANT, SMALL BUSINESS, SOCIALITE, STUDENT, TELEVISION, TRADE, or WAR):");
        try {
            inputProtagOccupation = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to an Occupation
        return occupationBuilder.build(inputProtagOccupation, new OccupationBuilder());
    }

    /**
     * creates a new Protagonist based on the attributes collected from the user
     * helper function
     * @return a new Protagonist
     */
    private Protagonist getProtagonist() {
        return new Protagonist(getProtagName(), getProtagLifeStage(), getProtagGender(), getProtagDisability(), getProtagLGBTQ(), getProtagEthnicity(), getProtagOccupation());
    }

    /**
     * gets the fantasy type from the user via the scanner.
     * helper function
     * @return the FantasyType
     */
    private FantasyType getType() {
        String inputType = "";
        // get the fantasy type from the user via the scanner
        System.out.println("Enter the fantasy type (HIGH or LOW):");
        try {
            inputType = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a FantasyType
        return typeBuilder.build(inputType, new FantasyTypeBuilder());
    }

    /**
     * gets the fantasy culture from the user via the scanner.
     * helper function
     * @return the Culture
     */
    private Culture getCulture() {
        String inputCulture = "";
        // get the culture from the user via the scanner
        System.out.println("Enter the fantasy culture (NORTH AMERICAN, MESOAMERICAN, EUROPEAN, SLAVIC, EAST ASIAN, INDIAN, MIDDLE EASTERN, AFRICAN, AUSTRONESIAN, CELTIC, POLYNESIAN, or SCANDINAVIAN):");
        try {
            inputCulture = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a Culture
        return cultureBuilder.build(inputCulture, new CultureBuilder());
    }

    /**
     * gets the magic presence from the user via the scanner.
     * helper function
     * @return the presence of magic in the book (a boolean)
     */
    private boolean getMagic() {
        String inputMagic = "";
        // get the magic presence from the user via the scanner
        System.out.println("Is there magic in this book? (Y for yes, N for no):");
        try {
            inputMagic = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a boolean
        return booleanBuilder.build(inputMagic, new BooleanBuilder());
    }

    /**
     * gets the fantasy races from the user via the scanner.
     * helper function
     * @return ListADT<Race> - a list of the fantasy races in the book
     */
    private ListADT<Race> getRaces() {
        String inputRaces = "";
        // get the fantasy races from the user via the scanner
        System.out.println("Enter the fantasy races in this book, separated by semicolons (;) (ELVES, DWARVES, GOBLINS, ORCS, FAE, HOBBITS, VAMPIRES, GODS, WEREWOLVES, MERFOLK, SHAPESHIFTERS, DEMIGODS, WITCHES, and MAGES):");
        try {
            inputRaces = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a ListADT of type Race
        return raceBuilder.build(inputRaces, new RacesBuilder());
    }

    /**
     * gets the fantasy creatures from the user via the scanner.
     * helper function
     * @return ListADT<Creature> - a list of the fantasy creatures in the book
     */
    private ListADT<Creature> getCreatures() {
        String inputCreatures = "";
        // get the fantasy creatures from the user via the scanner
        System.out.println("Enter the fantasy creatures in this book, separated by semicolons (;) (DRAGON, UNICORN, WYVERN, DEMON, UNDEAD, GHOST, CENTAUR, MINOTAUR, DJINN, and IFRIT):");
        try {
            inputCreatures = scanner.nextLine();
        } catch (InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a ListADT of type Creature
        return creatureBuilder.build(inputCreatures, new CreaturesBuilder());
    }

    /**
     * gets the crime from the user.
     * helper function
     * @return the Crime
     */
    private Crime getCrime() {
        String inputCrime = "";
        // get the crime from the user via the scanner
        System.out.println("Enter the crime in this book (ABDUCTION, SINGLE MURDER, MULTIPLE MURDERS, ARSON, THEFT, STALKING, or TERRORISM):");
        try {
            inputCrime = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the string to a Crime
        return crimeBuilder.build(inputCrime, new CrimeBuilder());
    }

    /**
     * gets the mood from the user.
     * helper function
     * @return the Mood
     */
    private Mood getMood() {
        String inputMood = "";
        // get the mood from the user via the scanner
        System.out.println("Enter the mood of this book (COZY, FUNNY, THRILLING, or SPOOKY):");
        try {
            inputMood = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a Mood
        return moodBuilder.build(inputMood, new MoodBuilder());
    }

    /**
     * gets the pairing from the user.
     * helper function
     * @return the Pairing
     */
    private Pairing getPairing() {
        String inputPairing = "";
        // get the pairing from the user via the scanner
        System.out.println("Enter the pairing in this book (M/F, M/M, F/F, F/NB, M/NB, NB/NB):");
        try {
            inputPairing = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a Pairing
        return pairingBuilder.build(inputPairing, new PairingBuilder());
    }

    /**
     * gets the romance subgenre from the user.
     * helper function
     * @return the RomanceSubgenre
     */
    private RomanceSubgenre getSubgenre() {
        String inputSubgenre = "";
        // get the subgenre from the user via the scanner
        System.out.println("Enter the subgenre of this book (CONTEMPORARY, HISTORICAL, PARANORMAL, FANTASY, SCIFI, ROMCOM):");
        try {
            inputSubgenre = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a RomanceSubgenre
        return subgenreBuilder.build(inputSubgenre, new SubgenreBuilder());
    }

    /**
     * Gets the tropes from the user.
     * Helper function to getBook()
     * @return the tropesList of this book (ListADT<Trope>)
     */
    private ListADT<Trope> getTropes() {
        String inputTropes = "";
        // get the tropes from the user via the scanner
        System.out.println("Enter the tropes in this book, separated by semicolons (;) (AGE GAP, BOSS/EMPLOYEE, COWORKERS, CLASS DIFFERENCE, GRUMPY/SUNSHINE, ARRANGED MARRIAGE, FAKE RELATIONSHIP, FATED MATES, FORBIDDEN, FORCED PROXIMITY, FRIENDS TO LOVERS, ENEMIES TO LOVERS, FWB, INSTALOVE, SLOW BURN, MARRIAGE OF CONVENIENCE, LOVE TRIANGLE, SECOND CHANCES, SECRET RELATIONSHIP, SIBLING'S BEST FRIEND, and PINING):");
        try {
            inputTropes = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a ListADT<Trope>
        return tropeListBuilder.build(inputTropes, new TropeListBuilder());
    }

    /**
     * Gets the spice level from the user.
     * Helper function to getBook()
     * @return the spice of this book (int)
     */
    private int getSpice() {
        String inputSpice = "";
        // get the spice level from the user via the scanner
        System.out.println("Enter the spice level from 1 to 5:");
        try {
            inputSpice = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a number!");
        }
        // convert the String to an int
        return Integer.parseInt(inputSpice);
    }

    /**
     * Gets the love interest's name from the user.
     * Helper function to getLoveInterest()
     * @return the name of the love interest (String)
     */
    private String getLIName() {
        String inputLIName = "";
        // get the name from the user via the scanner
        System.out.println("Enter the love interest's name:");
        inputLIName = scanner.nextLine();
        return inputLIName;
    }

    /**
     * Gets the love interest's life stage from the user.
     * Helper function to getLoveInterest()
     * @return the LifeStage of the love interest
     */
    private LifeStage getLILifeStage() {
        String inputLIAge = "";
        // get the life stage from the user via the scanner
        System.out.println("Enter the love interest's age (CHILD, PRETEEN, TEEN, YOUNG ADULT, ADULT, MIDDLE AGED, OLD ADULT, IMMORTAL, or MULTIPLE):");
        try {
            inputLIAge = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a LifeStage
        return lifeStageBuilder.build(inputLIAge, new LifeStageBuilder());
    }

    /**
     * Gets the love interest's gender from the user.
     * Helper function to getLoveInterest()
     * @return the Gender of the love interest
     */
    private Gender getLIGender() {
        String inputLIGender = "";
        // get the gender from the user via the scanner
        System.out.println("Enter the love interest's gender (MALE, FEMALE, NONBINARY):");
        try {
            inputLIGender = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a Gender
        return genderBuilder.build(inputLIGender, new GenderBuilder());
    }

    /**
     * Gets the love interest's disability status from the user.
     * Helper function to getLoveInterest()
     * @return the disability status of the love interest (boolean)
     */
    private boolean getLIDisability() {
        String inputLIDisability = "";
        // get the disability status from the user via the scanner
        System.out.println("Is the love interest disabled? (Y for yes, N for no):");
        try {
            inputLIDisability = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a boolean
        return booleanBuilder.build(inputLIDisability, new BooleanBuilder());
    }

    /**
     * Gets the love interest's LGBTQ identity from the user.
     * Helper function to getLoveInterest()
     * @return the LGBTQ of the love interest
     */
    private LGBTQ getLILGBTQ() {
        String inputLILGBTQ = "";
        // get the lgbtq status from the user via the scanner
        System.out.println("Enter the love interest's LGBTQ identity (STRAIGHT, LESBIAN, GAY, BISEXUAL, TRANS, QUEER):");
        try {
            inputLILGBTQ = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to a LGBTQ
        return lgbtqBuilder.build(inputLILGBTQ, new LGBTQBuilder());
    }

    /**
     * Gets the love interest's ethnicity from the user.
     * Helper function to getLoveInterest()
     * @return the Ethnicity of the love interest
     */
    private Ethnicity getLIEthnicity() {
        String inputLIEthnicity = "";
        // get the ethnicity from the user via the scanner
        System.out.println("Enter the love interest's ethnicity (WHITE, BLACK, ASIAN, INDIAN, MIDDLEEASTERN, MIXED, INDIGENOUS, or HISPANIC):");
        try {
            inputLIEthnicity = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to an Ethnicity
        return ethnicityBuilder.build(inputLIEthnicity, new EthnicityBuilder());
    }

    /**
     * Gets the love interest's occupation from the user.
     * Helper function to getLoveInterest()
     * @return the Occupation of the love interest
     */
    private Occupation getLIOccupation() {
        String inputLIOccupation = "";
        // get the occupation from the user via the scanner
        System.out.println("Enter the love interest's occupation: (ACADEMIC, ATHLETE, BOOKS, CELEBRITY, CHEF, CHILD, CORPORATE, COVERT, CREATIVE, CRIME, EDUCATION, FINANCE, HEALTH CARE, HOSPITALITY, HUNTER, IDLE, JOURNALIST, LABOR, LAW, MAGE, MULTIPLE, NOBILITY, OFFICE, OTHER, PARENT/GUARDIAN, PIRATE, POLICE, POLITICS, PUBLIC SERVICE, RETAIL, ROYAL, SCIENCE, SERVANT, SMALL BUSINESS, SOCIALITE, STUDENT, TELEVISION, TRADE, or WAR):");
        try {
            inputLIOccupation = scanner.nextLine();
        } catch(InputMismatchException e) {
            System.out.println("This is not a string!");
        }
        // convert the String to an Occupation
        return occupationBuilder.build(inputLIOccupation, new OccupationBuilder());
    }

    /**
     * Create a love interest.
     * Helper function to getBook()
     * @return a new Protagonist
     */
    private Protagonist getLoveInterest() {
        return new Protagonist(getLIName(), getLILifeStage(), getLIGender(), getLIDisability(), getLILGBTQ(), getLIEthnicity(), getLIOccupation());
    }

    /**
     * Creates a new book based on the appropriate attributes
     * @return a new Book object
     */
    public Book getBook() {
        Book origBook;
        // get all the nonspecific attributes
        String title = getTitle();
        String author = getAuthor();
        Genre genre = getGenre();
        AgeRange ageRange = getAgeRange();
        String series = getSeries();
        int number = getNumber();
        POV pov = getPOV();
        TimePeriod timePeriod = getTimePeriod();
        Place place = getPlace();
        boolean pocPresence = getPOCPresence();
        boolean lgbtqPresence = getLGBTQPresence();
        Protagonist protagonist = getProtagonist();

        if (genre == Genre.FANTASY) { // if the book's genre is fantasy
            // get all the fantasy-specific attributes
            FantasyType type = getType();
            Culture culture = getCulture();
            boolean magic = getMagic();
            ListADT<Race> races = getRaces();
            ListADT<Creature> creatures = getCreatures();
            // create the new FantasyBook based on the collected attributes
            origBook = new FantasyBook(title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence, type, culture, magic, races, creatures);
        }
        else if (genre == Genre.MYSTERY) { // if the book's genre is Mystery
            // get all the mystery-specific attributes
            Crime crime = getCrime();
            Mood mood = getMood();
            // create the new MysteryBook based on the collected attributes
            origBook = new MysteryBook(title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence, crime, mood);
        }
        else if (genre == Genre.ROMANCE) { // if the book's genre is Romance
            // get all the romance-specific attributes
            Pairing pairing = getPairing();
            RomanceSubgenre subgenre = getSubgenre();
            ListADT<Trope> tropes = getTropes();
            int spice = getSpice();
            Protagonist loveInterest = getLoveInterest();
            // create the new RomanceBook based on the collected attributes
            origBook = new RomanceBook(title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence, pairing, subgenre, tropes, loveInterest, spice);
        }
        else { // if the genre is not one of these three
            // create a new Book based on the nonspecific attributes
            origBook = new Book(title, author, genre, ageRange, series, number, pov, timePeriod, place, protagonist, pocPresence, lgbtqPresence);
        }
        return origBook;
    }

    /**
     * displays a list of results
     * @param results the ArrayList<CompBook> to be displayed
     */
    public void showResults(ArrayList<CompBook> results) {
        System.out.println("Based on the book you read, you may enjoy the following " + results.size() + " similar books:");
        // print out each item in the results list
        results.forEach((b)->System.out.println(b.toString()));
        System.out.println("Happy reading!");
    }

}
