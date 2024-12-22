import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import java.util.Arrays;
import java.util.List;

public class ProtagonistComparerTest {

    ProtagonistComparer pc;
    Protagonist p1;
    Protagonist p2;
    Protagonist p3;
    Protagonist p4;
    Protagonist li1;
    Protagonist li2;
    Protagonist li3;

    @Before
    public void setup() {
        pc = new ProtagonistComparer();

        p1 = new Protagonist("Astrid Parker", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.BISEXUAL, Ethnicity.WHITE, Occupation.SMALLBUSINESS);
        li1 = new Protagonist("Jordan", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.LESBIAN, Ethnicity.WHITE, Occupation.TRADE);

        p2 = new Protagonist("Iris Kelly", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.BISEXUAL, Ethnicity.WHITE, Occupation.BOOKS);
        li2 = new Protagonist("Stevie", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.LESBIAN, Ethnicity.WHITE, Occupation.CREATIVE);

        p3 = new Protagonist("Cassie Hanwell", LifeStage.ADULT, Gender.FEMALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.PUBLICSERVICE);
        li3 = new Protagonist("Owen", LifeStage.ADULT, Gender.MALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.PUBLICSERVICE);

        p4 = new Protagonist("Anthony Bridgerton", LifeStage.ADULT, Gender.MALE, false, LGBTQ.STRAIGHT, Ethnicity.WHITE, Occupation.NOBILITY);

    }

    @Test
    public void compTest12() {
        assertEquals(0.785, pc.compareProtags(p1, p2), 0.01);
    }

    @Test
    public void compTest13() {
        assertEquals(0.642, pc.compareProtags(p1, p3), 0.01);
    }

    @Test
    public void compTest14() {
        assertEquals(0.429, pc.compareProtags(p1, p4), 0.01);
    }

    @Test
    public void compTest12a() {
        assertEquals(0.785, pc.compareProtags(li1, li2), 0.01);
    }

    @Test
    public void compTest13a() {
        assertEquals(0.4286, pc.compareProtags(li1, li3), 0.01);
    }

}
