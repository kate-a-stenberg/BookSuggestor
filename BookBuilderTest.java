import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookBuilderTest {

    ListComparer lc;
    BookBuilder<Genre> genreBuilder;
    BookBuilder<String> authorBuilder;
    BookBuilder<AgeRange> ageRangeBuilder;
    BookBuilder<POV> povBuilder;
    BookBuilder<TimePeriod> timePeriodBuilder;
    BookBuilder<Place> placeBuilder;
    BookBuilder<Boolean> booleanBuilder;
    BookBuilder<LifeStage> lifeStageBuilder;
    BookBuilder<Gender> genderBuilder;
    BookBuilder<LGBTQ> lgbtqBuilder;
    BookBuilder<Ethnicity> ethnicityBuilder;
    BookBuilder<Occupation> occupationBuilder;
    BookBuilder<Pairing> pairingBuilder;
    BookBuilder<RomanceSubgenre> subgenreBuilder;
    BookBuilder<ListADT<Trope>> tropeBuilder;
    BookBuilder<FantasyType> typeBuilder;
    BookBuilder<Culture> cultureBuilder;
    BookBuilder<ListADT<Race>> raceBuilder;
    BookBuilder<ListADT<Creature>> creatureBuilder;
    String inputTitle1;
    String inputTitle2;
    String inputTitle3;
    String inputAuthor1;
    String inputAuthor2;
    String inputAuthor3;
    String inputGenre1;
    String inputGenre2;
    String inputGenre3;
    String inputAgeRange1;
    String inputAgeRange2;
    String inputAgeRange3;
    String inputSeries1;
    String inputSeries2;
    String inputSeries3;
    String inputNumber1;
    String inputNumber2;
    String inputNumber3;
    String inputPOV1;
    String inputPOV2;
    String inputPOV3;
    String inputTime1;
    String inputTime2;
    String inputTime3;
    String inputPlace1;
    String inputPlace2;
    String inputPlace3;
    String inputProtagName1;
    String inputProtagName2;
    String inputProtagName3;
    String inputProtagAge1;
    String inputProtagAge2;
    String inputProtagAge3;
    String inputProtagGender1;
    String inputProtagGender2;
    String inputProtagGender3;
    String inputProtagDisability1;
    String inputProtagDisability2;
    String inputProtagDisability3;
    String inputProtagLGBTQ1;
    String inputProtagLGBTQ2;
    String inputProtagLGBTQ3;
    String inputProtagEthnicity1;
    String inputProtagEthnicity2;
    String inputProtagEthnicity3;
    String inputProtagOccupation1;
    String inputProtagOccupation2;
    String inputProtagOccupation3;
    String inputPOCPresence1;
    String inputPOCPresence2;
    String inputPOCPresence3;
    String inputLGBTQPresence1;
    String inputLGBTQPresence2;
    String inputLGBTQPresence3;
    String inputFantasyType;
    String inputCulture;
    String inputMagic;
    String inputRaces;
    String inputCreatures;
    String inputCrime;
    String inputMood;
    String inputPairing;
    String inputSubgenre;
    String inputTropes;
    String inputLIName;
    String inputLIAge;
    String inputLIGender;
    String inputLIDisability;
    String inputLILGBTQ;
    String inputLIEthnicity;
    String inputLIOccupation;
    String inputSpice;
    Protagonist p1;
    Protagonist p2;
    Protagonist p3;
    Protagonist li;
    ListADT<Race> rl;
    ListADT<Creature> cl;
    Book b1;
    Book b2;
    Book b3;

    @Before
    public void setup() {
        lc = new ListComparer();
        genreBuilder = new BookBuilder<Genre>();
        authorBuilder = new BookBuilder<String>();
        ageRangeBuilder = new BookBuilder<AgeRange>();
        povBuilder = new BookBuilder<POV>();
        timePeriodBuilder = new BookBuilder<TimePeriod>();
        placeBuilder = new BookBuilder<Place>();
        booleanBuilder = new BookBuilder<Boolean>();
        lifeStageBuilder = new BookBuilder<LifeStage>();
        genderBuilder = new BookBuilder<Gender>();
        lgbtqBuilder = new BookBuilder<LGBTQ>();
        ethnicityBuilder = new BookBuilder<Ethnicity>();
        occupationBuilder = new BookBuilder<Occupation>();
        pairingBuilder = new BookBuilder<Pairing>();
        subgenreBuilder = new BookBuilder<RomanceSubgenre>();
        tropeBuilder = new BookBuilder<ListADT<Trope>>();
        typeBuilder = new BookBuilder<FantasyType>();
        cultureBuilder = new BookBuilder<Culture>();
        raceBuilder = new BookBuilder<ListADT<Race>>();
        creatureBuilder = new BookBuilder<ListADT<Creature>>();
        inputTitle1 = "House of Earth and Blood";
        inputAuthor1 = "Sarah J Maas";
        inputGenre1 = "FANTASY";
        inputAgeRange1 = "ADULT";
        inputSeries1 = "Crescent City";
        inputNumber1 = "1";
        inputPOV1 = "THIRD MULTIPLE";
        inputTime1 = "FANTASY";
        inputPlace1 = "CITY";
        inputProtagName1 = "Bryce Quinlan";
        inputProtagAge1 = "YOUNG ADULT";
        inputProtagGender1 = "FEMALE";
        inputProtagDisability1 = "N";
        inputProtagLGBTQ1 = "STRAIGHT";
        inputProtagEthnicity1 = "WHITE";
        inputProtagOccupation1 = "RETAIL";
        inputPOCPresence1 = "N";
        inputLGBTQPresence1 = "N";
        inputFantasyType = "HIGH";
        inputCulture = "EUROPEAN";
        inputMagic = "Y";
        inputRaces = "FAE ANGELS WITCHES MERFOLK";
        inputCreatures = "";
        p1 = new Protagonist("Bryce Quinlan", LifeStage.YOUNGADULT, Gender.FEMALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.RETAIL);
        rl = new ListADT<Race>();
        rl.addNode(Races.race5);
        rl.addNode(Races.race14);
        rl.addNode(Races.race12);
        rl.addNode(Races.race9);
        cl = new ListADT<Creature>();
        b1 = new FantasyBook("House of Earth and Blood", "Sarah J Maas", Genre.FANTASY, AgeRange.ADULT, "Crescent City", 1, POV.THIRDMULTIPLE, TimePeriod.FANTASY, Place.CITY, p1, false, false, FantasyType.HIGH, Culture.EUROPEAN, false, rl, cl);
    }

    @Test
    public void genreTest() {
        assertEquals(Genre.FANTASY, genreBuilder.build(inputGenre1, new GenreBuilder()));
    }

    @Test
    public void ageRangeTest() {
        assertEquals(AgeRange.ADULT, ageRangeBuilder.build(inputAgeRange1, new AgeRangeBuilder()));
    }

    @Test
    public void povTest() {
        assertEquals(POV.THIRDMULTIPLE, povBuilder.build(inputPOV1, new POVBuilder()));
    }

    @Test
    public void timePeriodTest() {
        assertEquals(TimePeriod.FANTASY, timePeriodBuilder.build(inputTime1, new TimePeriodBuilder()));
    }

    @Test
    public void placeTest() {
        assertEquals(Place.CITY, placeBuilder.build(inputPlace1, new PlaceBuilder()));
    }

    @Test
    public void pocTest() {
        assertFalse(booleanBuilder.build(inputPOCPresence1, new BooleanBuilder()));
    }

    @Test
    public void lgbtqTest() {
        assertFalse(booleanBuilder.build(inputLGBTQPresence1, new BooleanBuilder()));
    }

    @Test
    public void lifeStageTest() {
        assertEquals(LifeStage.YOUNGADULT, lifeStageBuilder.build(inputProtagAge1, new LifeStageBuilder()));
    }

    @Test
    public void genderTest() {
        assertEquals(Gender.FEMALE, genderBuilder.build(inputProtagGender1, new GenderBuilder()));
    }

    @Test
    public void disabilityTest() {
        assertFalse(booleanBuilder.build(inputProtagDisability1, new BooleanBuilder()));
    }

    @Test
    public void protagLGBTQTest() {
        assertEquals(LGBTQ.STRAIGHT, lgbtqBuilder.build(inputProtagLGBTQ1, new LGBTQBuilder()));
    }

    @Test
    public void ethnicityTest() {
        assertEquals(Ethnicity.WHITE, ethnicityBuilder.build(inputProtagEthnicity1, new EthnicityBuilder()));
    }

    @Test
    public void occupationTest() {
        assertEquals(Occupation.RETAIL, occupationBuilder.build(inputProtagOccupation1, new OccupationBuilder()));
    }

    @Test
    public void fantasyTypeTest() {
        assertEquals(FantasyType.HIGH, typeBuilder.build(inputFantasyType, new FantasyTypeBuilder()));
    }

    @Test
    public void cultureTest() {
        assertEquals(Culture.EUROPEAN, cultureBuilder.build(inputCulture, new CultureBuilder()));
    }

    @Test
    public void magicTest() {
        assertTrue(booleanBuilder.build(inputMagic, new BooleanBuilder()));
    }

    @Test
    public void raceTest() {
        assertEquals(1.0, lc.compareLists(rl, raceBuilder.build(inputRaces, new RacesBuilder())), 0.1);
    }

    @Test
    public void creatureTest() {
        assertEquals(1.0, lc.compareLists(cl, creatureBuilder.build(inputCreatures, new CreaturesBuilder())), 0.1);
    }

}
