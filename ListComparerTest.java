import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ListComparerTest {

    ListComparer lc;
    ListADT<Trope> tl1;
    ListADT<Trope> tl2;
    ListADT<Trope> tl3;
    ListADT<Trope> tl4;
    Trope t1;
    Trope t2;
    Trope t3;
    Trope t4;
    Trope t5;
    Trope t6;
    ListADT<Trope> l1;
    ListADT<Trope> l2;
    BookBuilder<ListADT<Trope>> tropeBuilder;

    @Before
    public void setup() {
        lc = new ListComparer();
        tropeBuilder = new BookBuilder<ListADT<Trope>>();

        t1 = new Trope(TropeType.COWORKERS);
        t2 = new Trope(TropeType.SECRETRELATIONSHIP);
        t3 = new Trope(TropeType.ENEMIESTOLOVERS);
        t4 = new Trope(TropeType.FAKERELATIONSHIP);
        t5 = new Trope(TropeType.FRIENDSTOLOVERS);
        t6 = new Trope(TropeType.FORBIDDEN);

        tl1 = new ListADT<Trope>(t1);
        tl1.addNode(t2);
        tl1.addNode(t3);

        tl2 = new ListADT<Trope>(t4);

        tl3 = new ListADT<Trope>(t1);
        tl3.addNode(t5);
        tl3.addNode(t6);

        tl4 = new ListADT<Trope>(t3);
        tl4.addNode(new Trope(TropeType.FORCEDPROXIMITY));
        tl4.addNode(new Trope(TropeType.CLASSDIFFERENCE));
        tl4.addNode(new Trope(TropeType.ARRANGEDMARRIAGE));
        tl4.addNode(new Trope(TropeType.INSTALOVE));
        tl4.addNode(new Trope(TropeType.LOVETRIANGLE));

        l1 = tropeBuilder.build("ENEMIES TO LOVERS, PINING, CLASS DIFFERENCE", new TropeListBuilder());
        l2 = tropeBuilder.build("COWORKERS, ENEMIES TO LOVERS, PINING, BOSS/EMPLOYEE, FWB", new TropeListBuilder());

    }

    @Test
    public void compTest12() {
        assertEquals(0.0, lc.compareLists(tl1, tl2), 0.001);
    }

    @Test
    public void compTest13() {
        assertEquals(0.333, lc.compareLists(tl1, tl3), 0.001);
    }

    @Test
    public void compTest14(){
        assertEquals(0.24998, lc.compareLists(tl1, tl4), 0.001);
    }

    @Test
    public void compTest12a() {
        assertEquals(0.5333, lc.compareLists(l1, l2), 0.001);
    }

}
