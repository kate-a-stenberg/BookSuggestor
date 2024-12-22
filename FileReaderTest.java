import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderTest {

    Model m;
    File file;
    Scanner scanner;
    Book b1;
    Book b2;
    Book b3;
    Book b4;
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
    BookBuilder<FantasyType> typeBuilder;
    BookBuilder<Culture> cultureBuilder;
    BookBuilder<ListADT<Race>> raceBuilder;
    BookBuilder<ListADT<Creature>> creatureBuilder;
    BookBuilder<Crime> crimeBuilder;
    BookBuilder<Mood> moodBuilder;
    BookBuilder<Pairing> pairingBuilder;
    BookBuilder<RomanceSubgenre> subgenreBuilder;
    BookBuilder<ListADT<Trope>> tropeListBuilder;
    String[] tokens;

    @Before
    public void setup() throws FileNotFoundException {
        m = new Model();
        file = new File("BookFile.csv");
        scanner = new Scanner(file);
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
        typeBuilder = new BookBuilder<FantasyType>();
        cultureBuilder = new BookBuilder<Culture>();
        raceBuilder = new BookBuilder<ListADT<Race>>();
        creatureBuilder = new BookBuilder<ListADT<Creature>>();
        crimeBuilder = new BookBuilder<Crime>();
        moodBuilder = new BookBuilder<Mood>();
        pairingBuilder = new BookBuilder<Pairing>();
        subgenreBuilder = new BookBuilder<RomanceSubgenre>();
        tropeListBuilder = new BookBuilder<ListADT<Trope>>();

        scanner.nextLine();

        String line1 = scanner.nextLine();
        b1 = m.getBookFromFile(line1);

        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();

        String line6 = scanner.nextLine();
        b2 = m.getBookFromFile(line6);

        scanner.nextLine();

        String line8 = scanner.nextLine();
        b3 = m.getBookFromFile(line8);

        String line163 = "Forever Never,Lucy Score,ROMANCE,ADULT,STANDALONE,0,THIRD MULTIPLE,MODERN,TOWN,Brick Callan,ADULT,MALE,N,STRAIGHT,WHITE,POLICE,N,N,,,,,,,,M/F,ROMCOM,PINING; FORCED PROXIMITY; GRUMPY/SUNSHINE; FRIENDS TO LOVERS; AGE GAP; FWB,Remy,YOUNG ADULT,FEMALE,Y,STRAIGHT,WHITE,SOCIALITE,4";
        tokens = line163.split(",");
        // b4 = m.getBookFromFile(line163);

    }

    @Test
    public void authorTest() {
        assertEquals("Ben Aaronovitch", b1.getAuthor());
        assertEquals("Melissa Albert", b2.getAuthor());
        assertEquals("Katherine Arden", b3.getAuthor());
    }

    @Test
    public void genreTest() {
        assertEquals(Genre.FANTASY, b1.getGenre());
        assertEquals(Genre.FANTASY, b2.getGenre());
        assertEquals(Genre.FANTASY, b3.getGenre());
    }

    @Test
    public void ageRangeTest() {
        assertEquals(AgeRange.ADULT, b1.getAgeRange());
        assertEquals(AgeRange.YA, b2.getAgeRange());
        assertEquals(AgeRange.ADULT, b3.getAgeRange());
    }

    @Test
    public void povTest() {
        assertEquals(POV.FIRST, b1.getPOV());
        assertEquals(POV.FIRST, b2.getPOV());
        assertEquals(POV.THIRDMULTIPLE, b3.getPOV());
    }

    @Test
    public void timePeriodTest() {
        assertEquals(TimePeriod.MODERN, b1.getTimePeriod());
        assertEquals(TimePeriod.MODERN, b2.getTimePeriod());
        assertEquals(TimePeriod.MEDIEVAL, b3.getTimePeriod());
    }

    @Test
    public void placeTest() {
        assertEquals(Place.CITY, b1.getPlace());
        assertEquals(Place.MULTIPLE, b2.getPlace());
        assertEquals(Place.COUNTRY, b3.getPlace());
    }

    @Test
    public void protagDisabilityTest() {
        assertFalse(b1.getProtagonist().getDisability());
    }

    @Test
    public void spiceTest() {
        assertEquals(4, ((RomanceBook)b4).getSpice());
    }

    @Test
    public void testRomanceTokens() {
        assertEquals("Forever Never", tokens[0]);
        assertEquals("Lucy Score", tokens[1]);
        assertEquals("ROMANCE", tokens[2]);
        assertEquals("ADULT", tokens[3]);
        assertEquals("STANDALONE", tokens[4]);
        assertEquals("0", tokens[5]);
        assertEquals("THIRD MULTIPLE", tokens[6]);
        assertEquals("MODERN", tokens[7]);
        assertEquals("TOWN", tokens[8]);
        assertEquals("Brick Callan", tokens[9]);
        assertEquals("ADULT", tokens[10]);
        assertEquals("MALE", tokens[11]);
        assertEquals("N", tokens[12]);
        assertEquals("STRAIGHT", tokens[13]);
        assertEquals("WHITE", tokens[14]);
        assertEquals("POLICE", tokens[15]);
        assertEquals("N", tokens[16]);
        assertEquals("N", tokens[17]);
        assertEquals("", tokens[18]);
        assertEquals("", tokens[19]);
        assertEquals("", tokens[20]);
        assertEquals("", tokens[21]);
        assertEquals("", tokens[22]);
        assertEquals("", tokens[23]);
        assertEquals("", tokens[24]);
        assertEquals("M/F", tokens[25]);
        assertEquals("ROMCOM", tokens[26]);
        assertEquals("PINING; FORCED PROXIMITY; GRUMPY/SUNSHINE; FRIENDS TO LOVERS; AGE GAP; FWB", tokens[27]);
        assertEquals("Remy", tokens[28]);
        assertEquals("YOUNG ADULT", tokens[29]);
        assertEquals("FEMALE", tokens[30]);
        assertEquals("Y", tokens[31]);
        assertEquals("STRAIGHT", tokens[32]);
        assertEquals("WHITE", tokens[33]);
        assertEquals("SOCIALITE", tokens[34]);
        assertEquals("4", tokens[35]);
    }

}
