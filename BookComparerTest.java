import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookComparerTest {

    BookComparer bc;
    ListComparerI<Trope> lc;
    ProtagonistComparerI pc;
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
    Book b1;
    Book b2;
    RomanceBook b3;
    Book b4;
    Book b5;
    RomanceBook b6;
    ListADT<Trope> t1;
    ListADT<Trope> t2;
    ListADT<Trope> t3;
    ListADT<Trope> t4;
    ListADT<Trope> t5;
    ListADT<Trope> t6;
    Protagonist p1;
    Protagonist p2;
    Protagonist p3;
    Protagonist p4;
    Protagonist p5;
    Protagonist p6;
    Protagonist li1;
    Protagonist li2;
    Protagonist li3;
    Protagonist li4;
    Protagonist li5;
    Protagonist li6;


    @Before
    public void setup() {
        bc = new BookComparer();
        lc = new ListComparer<Trope>();
        pc = new ProtagonistComparer();
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

        p1 = new Protagonist("Astrid Parker", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.BISEXUAL, Ethnicity.WHITE, Occupation.SMALLBUSINESS);
        li1 = new Protagonist("Jordan", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.LESBIAN, Ethnicity.WHITE, Occupation.TRADE);
        t1 = tropeBuilder.build("COWORKERS, SECRET RELATIONSHIP, ENEMIES TO LOVERS", new TropeListBuilder());
        b1 = new RomanceBook("Astrid Parker Doesn't Fail", "Ashley Herring Blake", Genre.ROMANCE, AgeRange.ADULT, "Bright Falls", 2, POV.THIRDMULTIPLE, TimePeriod.MODERN, Place.TOWN, p1, false, true, Pairing.FF, RomanceSubgenre.ROMCOM, t1, li1, 4);

        p2 = new Protagonist("Iris Kelly", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.BISEXUAL, Ethnicity.WHITE, Occupation.BOOKS);
        li2 = new Protagonist("Stevie", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.LESBIAN, Ethnicity.WHITE, Occupation.CREATIVE);
        t2 = tropeBuilder.build("FAKE RELATIONSHIP", new TropeListBuilder());
        b2 = new RomanceBook("Iris Kelly Doesn't Date", "Ashley Herring Blake", Genre.ROMANCE, AgeRange.ADULT, "Bright Falls", 3, POV.THIRDMULTIPLE, TimePeriod.MODERN, Place.TOWN, p2, false, true, Pairing.FF, RomanceSubgenre.ROMCOM, t2, li2, 4);

        p3 = new Protagonist("Cassie Hanwell", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.PUBLICSERVICE);
        li3 = new Protagonist("Owen", LifeStage.ADULT, Gender.MALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.PUBLICSERVICE);
        t3 = tropeBuilder.build("COWORKERS, FRIENDS TO LOVERS, FORBIDDEN", new TropeListBuilder());
        b3 = new RomanceBook("Things You Save In A Fire", "Katherine Center", Genre.ROMANCE, AgeRange.ADULT, "STANDALONE", 0, POV.FIRST, TimePeriod.MODERN, Place.CITY, p3, false, false, Pairing.MF, RomanceSubgenre.CONTEMP, t3, li3, 2);

        p4 = new Protagonist("Elsie Hannaway", lifeStageBuilder.build("ADULT", new LifeStageBuilder()), genderBuilder.build("FEMALE", new GenderBuilder()), booleanBuilder.build("N", new BooleanBuilder()), lgbtqBuilder.build("STRAIGHT", new LGBTQBuilder()), ethnicityBuilder.build("WHITE", new EthnicityBuilder()), occupationBuilder.build("ACADEMIC", new OccupationBuilder()));
        li4 = new Protagonist("Jack", LifeStage.ADULT, Gender.MALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.ACADEMIC);
        t4 = tropeBuilder.build("ENEMIES TO LOVERS, PINING, CLASS DIFFERENCE", new TropeListBuilder());
        b4 = new RomanceBook("Love Theoretically", "Ali Hazelwood", Genre.ROMANCE, AgeRange.ADULT, "STANDALONE", 0, POV.FIRST, TimePeriod.MODERN, Place.CITY, p4, false, false, Pairing.MF, RomanceSubgenre.ROMCOM, t4, li4, 4);

        p5 = new Protagonist("Bee Konigswasser", LifeStage.YOUNGADULT, Gender.FEMALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.SCIENCE);
        li5 = new Protagonist("Levi", LifeStage.ADULT, Gender.MALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.SCIENCE);
        t5 = tropeBuilder.build("COWORKERS, ENEMIES TO LOVERS, PINING, BOSS/EMPLOYEE, FWB", new TropeListBuilder());
        b5 = new RomanceBook("Love On The Brain", "Ali Hazelwood", Genre.ROMANCE, AgeRange.ADULT, "STANDALONE", 0, POV.FIRST, TimePeriod.MODERN, Place.CITY, p5, false, false, Pairing.MF, RomanceSubgenre.ROMCOM, t5, li5, 4);

        p6 = new Protagonist("Helen Carpenter", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.EDUCATION);
        li6 = new Protagonist("Jake", LifeStage.YOUNGADULT, Gender.MALE, true, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.OTHER);
        t6 = tropeBuilder.build("PINING, FORCED PROXIMITY, SIBLING'S BEST FRIEND, AGE GAP", new TropeListBuilder());
        b6 = new RomanceBook("Happiness For Beginners", "Katherine Center", Genre.ROMANCE, AgeRange.ADULT, "STANDALONE", 0, POV.FIRST, TimePeriod.MODERN, Place.MULTIPLE, p6, false, false, Pairing.MF, RomanceSubgenre.CONTEMP, t6, li6, 2);

    }

    @Test
    public void compTest12() {
        assertEquals(0.86818182, bc.compareBooks(b1, b2), 0.01);
    }

    @Test
    public void compTest11() {
        assertEquals(1.0, bc.compareBooks(b1, b1), 0.01);
    }

    @Test
    public void compTest45() {
        assertEquals(0.9274, bc.compareBooks(b4, b5), 0.01);
    }

    @Test
    public void authorCompTest() {
        assertEquals(4, bc.authorMatch(b3, b6), 0.001);
    }

    @Test
    public void genreCompTest() {
        assertEquals(5, bc.genreMatch(b3, b6), 0.001);
    }

    @Test
    public void ageRangeCompTest() {
        assertEquals(4, bc.ageRangeMatch(b3, b6), 0.001);
    }

    @Test
    public void povCompTest() {
        assertEquals(2, bc.povMatch(b3, b6), 0.001);
    }

    @Test
    public void timeCompTest() {
        assertEquals(3, bc.timeMatch(b3, b6), 0.001);
    }

    @Test
    public void placeCompTest() {
        assertEquals(0, bc.placeMatch(b3, b6), 0.001);
    }

    @Test
    public void pocCompTest() {
        assertEquals(1, bc.pocMatch(b3, b6), 0.001);
    }

    @Test
    public void lgbtqCompTest() {
        assertEquals(1, bc.lgbtqMatch(b3, b6), 0.001);
    }

    @Test
    public void protagCompTest() {
        assertEquals(1.57143, bc.protagMatch(b3, b6), 0.001);
    }

    @Test
    public void pairCompTest() {
        assertEquals(4, bc.pairMatch(b3, b6), 0.001);
    }

    @Test
    public void subgenreCompTest() {
        assertEquals(5, bc.subgenreMatch(b3, b6), 0.001);
    }

    @Test
    public void tropeCompTest() {
        assertEquals(0, bc.tropesMatch(b3, b6), 0.001);
    }

    @Test
    public void spiceCompTest() {
        assertEquals(3, bc.spiceMatch(b3, b6), 0.001);
    }

    @Test
    public void loveInterestCompTest() {
        assertEquals(1, bc.loveInterestMatch(b3, b6), 0.001);
    }

    @Test
    public void bookCompTest() {
        assertEquals(0.78568, bc.compareBooks(b3, b6), 0.001);
    }

}
