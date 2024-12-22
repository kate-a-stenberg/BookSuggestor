/*
FINAL PROJECT
BookComparer class file
12/7/2023
Kate Stenberg
 */

public class BookComparer implements BookComparerI{

    /**
     * This class represents an engine that will compare two books.
     * It has as its attributes a Protagonist Comparer pc and three ListComparers lcr, lct, and lcc
     * (one each for Races, Creatures, and Tropes)
     * It implements the BookComparerI interface which orders a compareBooks() method.
     */

    private ProtagonistComparerI pc;
    private ListComparerI<Race> lcr;
    private ListComparerI<Trope> lct;
    private ListComparerI<Creature> lcc;

    /**
     * Constructs a BookComparer object with no arguments. sets each attribute to a default.
     */
    public BookComparer() {
        this.pc = new ProtagonistComparer();
        this.lcr = new ListComparer<Race>();
        this.lct = new ListComparer<Trope>();
        this.lcc = new ListComparer<Creature>();
    }

    /**
     * Determines the match value for the authors of two books.
     * helper method.
     * @param b1 the first book whose author is to be compared
     * @param b2 the second book whose author is to be compared
     * @return the author weight if the authors match and 0 otherwise
     */
    protected float authorMatch(Book b1, Book b2) {
        float authorMatch = 0;
        if (b1.getAuthor().equals(b2.getAuthor())) {
            authorMatch = Weights.AUTHOR;
        }
        return authorMatch;
    }

    /**
     * Determines the match value for the genres of two books.
     * helper method.
     * @param b1 the first book whose genre is to be compared
     * @param b2 the second book whose genre is to be compared
     * @return the genre weight if the genres match and 0 otherwise
     */
    protected float genreMatch(Book b1, Book b2) {
        float genreMatch = 0;
        if (b1.getGenre().equals(b2.getGenre())) {
            genreMatch = Weights.GENRE;
        }
        return genreMatch;
    }

    /**
     * Determines the match value for the age ranges of two books.
     * helper method.
     * @param b1 the first book whose age range is to be compared
     * @param b2 the second book whose age range is to be compared
     * @return the age range weight if the age ranges match and 0 otherwise
     */
    protected float ageRangeMatch(Book b1, Book b2) {
        float ageRangeMatch = 0;
        if (b1.getAgeRange().equals(b2.getAgeRange())) {
            ageRangeMatch = Weights.AGERANGE;
        }
        return ageRangeMatch;
    }

    /**
     * Determines the match value for the points of view of two books.
     * helper method.
     * @param b1 the first book whose point of view is to be compared
     * @param b2 the second book whose point of view is to be compared
     * @return the point of view weight if the points of view match and 0 otherwise
     */
    protected float povMatch(Book b1, Book b2) {
        float povMatch = 0;
        if (b1.getPOV().equals(b2.getPOV())) {
            povMatch = Weights.POV;
        }
        return povMatch;
    }

    /**
     * Determines the match value for the time settings of two books.
     * helper method.
     * @param b1 the first book whose time setting is to be compared
     * @param b2 the second book whose time setting is to be compared
     * @return the time period weight if the time settings match and 0 otherwise
     */
    protected float timeMatch(Book b1, Book b2) {
        float timeMatch = 0;
        if (b1.getTimePeriod().equals(b2.getTimePeriod())) {
            timeMatch = Weights.TIMEPERIOD;
        }
        return timeMatch;
    }

    /**
     * Determines the match value for the place settings of two books.
     * helper method.
     * @param b1 the first book whose place setting is to be compared
     * @param b2 the second book whose place setting is to be compared
     * @return the place weight if the place settings match and 0 otherwise
     */
    protected float placeMatch(Book b1, Book b2) {
        float placeMatch = 0;
        if (b1.getPlace().equals(b2.getPlace())) {
            placeMatch = Weights.PLACE;
        }
        return placeMatch;
    }

    /**
     * Determines the match value for the POC presences of two books.
     * helper method.
     * @param b1 the first book whose place setting is to be compared
     * @param b2 the second book whose place setting is to be compared
     * @return the POC presence weight if the POC presences match and 0 otherwise
     */
    protected float pocMatch(Book b1, Book b2) {
        float pocMatch = 0;
        if (b1.getPOCPresence() == b2.getPOCPresence()) {
            pocMatch = Weights.POCPRESENCE;
        }
        return pocMatch;
    }

    /**
     * Determines the match value for the LGBTQ presences of two books.
     * helper method.
     * @param b1 the first book whose LGBTQ presence is to be compared
     * @param b2 the second book whose LGBTQ presence is to be compared
     * @return the LGBTQ presence weight if the LGBTQ presences match and 0 otherwise
     */
    protected float lgbtqMatch(Book b1, Book b2) {
        float lgbtqMatch = 0;
        if (b1.getLGBTQPresence() == b2.getLGBTQPresence()) {
            lgbtqMatch = Weights.LGBTQPRESENCE;
        }
        return lgbtqMatch;
    }

    /**
     * Determines the match value for the protagonists of two books.
     * helper method.
     * @param b1 the first book whose protagonist is to be compared
     * @param b2 the second book whose protagonist is to be compared
     * @return the protagonist match value multiplied by the protagonist weight
     */
    protected float protagMatch(Book b1, Book b2) {
        return pc.compareProtags(b1.getProtagonist(), b2.getProtagonist()) * Weights.PROTAGONIST;
    }

    /**
     * Determines the match value for the fantasy types of two fantasy books.
     * helper method.
     * @param b1 the first fantasy book whose fantasy type is to be compared
     * @param b2 the second fantasy book whose fantasy type is to be compared
     * @return the Fantasy Type weight if the fantasy types match and 0 otherwise
     */
    protected float typeMatch(FantasyBook b1, FantasyBook b2) {
        float typeMatch = 0;
        if (b1.getType().equals(b2.getType())) {
            typeMatch = Weights.FANTASYTYPE;
        }
        return typeMatch;
    }

    /**
     * Determines the match value for the cultures of two fantasy books.
     * helper method.
     * @param b1 the first fantasy book whose culture is to be compared
     * @param b2 the second fantasy book whose culture is to be compared
     * @return the Culture weight if the cultures match and 0 otherwise
     */
    protected float cultureMatch(FantasyBook b1, FantasyBook b2) {
        float cultureMatch = 0;
        if (b1.getCulture().equals(b2.getCulture())) {
            cultureMatch = Weights.CULTURE;
        }
        return cultureMatch;
    }

    /**
     * Determines the match value for the magic presences of two fantasy books.
     * helper method.
     * @param b1 the first fantasy book whose magic presence is to be compared
     * @param b2 the second fantasy book whose magic presence is to be compared
     * @return the Magic weight if the magic presences match and 0 otherwise
     */
    protected float magicMatch(FantasyBook b1, FantasyBook b2) {
        float magicMatch = 0;
        if (b1.getMagic() == b2.getMagic()) {
            magicMatch = Weights.MAGIC;
        }
        return magicMatch;
    }

    /**
     * Determines the match value for the fantasy races present in two fantasy books.
     * helper method.
     * @param b1 the first fantasy book whose fantasy races are to be compared
     * @param b2 the second fantasy book whose fantasy races are to be compared
     * @return the Races weight times the match value of the two Fantasy Races lists
     */
    protected float racesMatch(FantasyBook b1, FantasyBook b2) {
        return lcr.compareLists(b1.getRaces(), b2.getRaces()) * Weights.RACES;
    }

    /**
     * Determines the match value for the fantasy creatures present in two fantasy books.
     * helper method.
     * @param b1 the first fantasy book whose fantasy creatures are to be compared
     * @param b2 the second fantasy book whose fantasy creatures are to be compared
     * @return the Creatures weight times the match value of the two Fantasy Creatures lists
     */
    protected float creaturesMatch(FantasyBook b1, FantasyBook b2) {
        return lcr.compareLists(b1.getRaces(), b2.getRaces()) * Weights.RACES;
    }

    /**
     * Determines the match value for the crimes of two mystery books.
     * helper method.
     * @param b1 the first mystery book whose crime is to be compared
     * @param b2 the second mystery book whose crime is to be compared
     * @return the Crime weight if the crimes match and 0 otherwise
     */
    protected float crimeMatch(MysteryBook b1, MysteryBook b2) {
        float crimeMatch = 0;
        if (b1.getCrime().equals(b2.getCrime())) {
            crimeMatch = Weights.CRIME;
        }
        return crimeMatch;
    }

    /**
     * Determines the match value for the moods of two mystery books.
     * helper method.
     * @param b1 the first mystery book whose mood is to be compared
     * @param b2 the second mystery book whose mood is to be compared
     * @return the mood weight if the moods match and 0 otherwise
     */
    protected float moodMatch(MysteryBook b1, MysteryBook b2) {
        float moodMatch = 0;
        if (b1.getMood().equals(b2.getMood())) {
            moodMatch = Weights.MOOD;
        }
        return moodMatch;
    }

    /**
     * Determines the match value for the pairings of two romance books.
     * helper method.
     * @param b1 the first romance book whose pairing is to be compared
     * @param b2 the second romance book whose pairing is to be compared
     * @return the pairing weight if the moods match and 0 otherwise
     */
    protected float pairMatch(RomanceBook b1, RomanceBook b2) {
        float pairMatch = 0;
        if (b1.getPairing().equals(b2.getPairing())) {
            pairMatch = Weights.PAIRING;
        }
        return pairMatch;
    }

    /**
     * Determines the match value for the subgenres of two romance books.
     * helper method.
     * @param b1 the first romance book whose subgenre is to be compared
     * @param b2 the second romance book whose subgenre is to be compared
     * @return the subgenre weight if the subgenres match and 0 otherwise
     */
    protected float subgenreMatch(RomanceBook b1, RomanceBook b2) {
        float subgenreMatch = 0;
        if (b1.getSubgenre().equals(b2.getSubgenre())) {
            subgenreMatch = Weights.SUBGENRE;
        }
        return subgenreMatch;
    }

    /**
     * Determines the match value for the tropes present in two romance books.
     * helper method.
     * @param b1 the first romance book whose tropes are to be compared
     * @param b2 the second romance book whose tropes are to be compared
     * @return the tropes weight times the match value of the two tropes lists
     */
    protected float tropesMatch(RomanceBook b1, RomanceBook b2) {
        return lct.compareLists(b1.getTropes(), b2.getTropes()) * Weights.TROPES;
    }

    /**
     * Determines the match value for the spices of two romance books.
     * helper method.
     * @param b1 the first romance book whose spice is to be compared
     * @param b2 the second romance book whose spice is to be compared
     * @return the spice weight if the spices match and 0 otherwise
     */
    protected float spiceMatch(RomanceBook b1, RomanceBook b2) {
        float spiceMatch = 0;
        if (b1.getSpice() == b2.getSpice()) {
            spiceMatch = Weights.SPICE;
        }
        return spiceMatch;
    }

    /**
     * Determines the match value for the love interests of two romance books.
     * helper method.
     * @param b1 the first romance book whose love interest is to be compared
     * @param b2 the second romance book whose love interest is to be compared
     * @return the love interest match value multiplied by the love interest weight
     */
    protected float loveInterestMatch(RomanceBook b1, RomanceBook b2) {
        return pc.compareProtags(b1.getLoveInterest(), b2.getLoveInterest()) * Weights.LOVEINTEREST;
    }

    @Override
    public float compareBooks(Book b1, Book b2) {
        float authorMatch = authorMatch(b1, b2);
        float genreMatch = genreMatch(b1, b2);
        float ageRangeMatch = ageRangeMatch(b1, b2);
        float povMatch = povMatch(b1, b2);
        float timeMatch = timeMatch(b1, b2);
        float placeMatch = placeMatch(b1, b2);
        float pocMatch = pocMatch(b1, b2);
        float lgbtqMatch = lgbtqMatch(b1, b2);
        float protagonistMatch = protagMatch(b1, b2);

        if (b1.getGenre() == Genre.FANTASY && b2.getGenre() == Genre.FANTASY) {
            float typeMatch = typeMatch((FantasyBook)b1, (FantasyBook)b2);
            float cultureMatch = cultureMatch((FantasyBook)b1, (FantasyBook)b2);
            float magicMatch = magicMatch((FantasyBook)b1, (FantasyBook)b2);
            float raceMatch = racesMatch((FantasyBook)b1, (FantasyBook)b2);
            float creatureMatch = creaturesMatch((FantasyBook)b1, (FantasyBook)b2);

            // numerator is the actual match values of all the attributes
            float compMatch = authorMatch + genreMatch + ageRangeMatch + povMatch + timeMatch + placeMatch + protagonistMatch + pocMatch + lgbtqMatch + typeMatch + cultureMatch + magicMatch + raceMatch + creatureMatch;
            // denominator is the total possible match values of all the attributes
            float totalMatch = Weights.AUTHOR + Weights.GENRE + Weights.AGERANGE + Weights.POV + Weights.TIMEPERIOD + Weights.PLACE + Weights.PROTAGONIST + Weights.POCPRESENCE + Weights.LGBTQPRESENCE + Weights.FANTASYTYPE + Weights.CULTURE + Weights.MAGIC + Weights.RACES + Weights.CREATURES;

            return compMatch / totalMatch;
        }

        if (b1.getGenre() == Genre.MYSTERY && b2.getGenre() == Genre.MYSTERY) {
            float crimeMatch = crimeMatch((MysteryBook)b1, (MysteryBook)b2);
            float moodMatch = moodMatch((MysteryBook)b1, (MysteryBook)b2);

            // numerator is the actual match values of all the attributes
            float compMatch = authorMatch + genreMatch + ageRangeMatch + povMatch + timeMatch + placeMatch + protagonistMatch + pocMatch + lgbtqMatch + crimeMatch + moodMatch;
            // denominator is the total possible match values of all the attributes
            float totalMatch = Weights.AUTHOR + Weights.GENRE + Weights.AGERANGE + Weights.POV + Weights.TIMEPERIOD + Weights.PLACE + Weights.PROTAGONIST + Weights.POCPRESENCE + Weights.LGBTQPRESENCE + Weights.CRIME + Weights.MOOD;

            return compMatch/totalMatch;
        }

        if (b1.getGenre() == Genre.ROMANCE && b2.getGenre() == Genre.ROMANCE) {
            float pairMatch = pairMatch((RomanceBook)b1, (RomanceBook)b2);
            float subgenreMatch = subgenreMatch((RomanceBook)b1, (RomanceBook)b2);
            float tropeMatch = tropesMatch((RomanceBook)b1, (RomanceBook)b2);
            float loveInterestMatch = loveInterestMatch((RomanceBook)b1, (RomanceBook)b2);
            float spiceMatch = spiceMatch((RomanceBook)b1, (RomanceBook)b2);

            // numerator is the actual match values of all the attributes
            float compMatch = authorMatch + genreMatch + ageRangeMatch + povMatch + timeMatch + placeMatch + protagonistMatch + pocMatch + lgbtqMatch + pairMatch + subgenreMatch + tropeMatch + loveInterestMatch + spiceMatch;
            // denominator is the total possible match values of all the attributes
            float totalMatch = Weights.AUTHOR + Weights.GENRE + Weights.AGERANGE + Weights.POV + Weights.TIMEPERIOD + Weights.PLACE + Weights.PROTAGONIST + Weights.POCPRESENCE + Weights.LGBTQPRESENCE + Weights.PAIRING + Weights.SUBGENRE + Weights.TROPES + Weights.LOVEINTEREST + Weights.SPICE;

            return compMatch/totalMatch;
        }

        // if the genres don't match, compare based on general non-specific attributes only
        float compMatch = authorMatch + genreMatch + ageRangeMatch + povMatch + timeMatch + placeMatch + protagonistMatch + pocMatch + lgbtqMatch;
        float totalMatch = Weights.AUTHOR + Weights.GENRE + Weights.AGERANGE + Weights.POV + Weights.TIMEPERIOD + Weights.PLACE + Weights.PROTAGONIST + Weights.POCPRESENCE + Weights.LGBTQPRESENCE;
        return compMatch/totalMatch;

    }

}
