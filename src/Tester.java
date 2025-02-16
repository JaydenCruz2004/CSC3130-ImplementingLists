//resources used for Test:
//https://stackoverflow.com/questions/15302020/how-to-write-a-test-class-to-test-my-code
//https://www.youtube.com/watch?v=vZm0lHciFsQ
//https://jenkov.com/tutorials/java-unit-testing/simple-test.html

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Tester {
    private AList<Song> arrlist;
    private SLList<Song> sllist;
    private DLList<Song> dllist;
    private Song song1, song2, song3, song4;

    @BeforeEach
    public void setUp() {
        arrlist = new AList<>();
        sllist = new SLList<>();
        dllist = new DLList<>();

        song1 = new Song("El Pibe De Mi Barrio", "Dr. Krapula", 2.47);
        song2 = new Song("505", "Arctic Monkeys", 4.14);
        song3 = new Song("NADIE", "Tito Double P", 3.17);
        song4 = new Song("DtMF", "Bad Bunny", 3.57);
    }

    // Test add for AList
    @Test
    public void AListAdd1() {
        arrlist.addy(song1);
        assertTrue(arrlist.toString().contains("El Pibe De Mi Barrio"));
    }

    // Test add for SLList
    @Test
    public void SLListAdd1() {
        sllist.addy(song1);
        assertTrue(sllist.toString().contains("El Pibe De Mi Barrio"));
    }

    // Test add for DLList
    @Test
    public void DLListAdd1() {
        dllist.addy(song1);
        assertTrue(dllist.toString().contains("El Pibe De Mi Barrio"));
    }

    // Test add and remove for AList
    @Test
    public void AListAdd2AndRemove1() {
        arrlist.addy(song1);
        arrlist.addy(song2);
        assertEquals(2, arrlist.toString().split("\n").length);

        arrlist.removy(0);
        assertEquals(1, arrlist.toString().split("\n").length);
    }

    // Test add and remove for SLList
    @Test
    public void SLListAdd2AndRemove1() {
        sllist.addy(song1);
        sllist.addy(song2);
        assertEquals(2, sllist.toString().split("\n").length);

        sllist.removy(0);
        assertEquals(1, sllist.toString().split("\n").length);
    }

    // Test add and remove for DLList
    @Test
    public void DLListAdd2AndRemove1() {
        dllist.addy(song1);
        dllist.addy(song2);
        assertEquals(2, dllist.toString().split("\n").length);

        dllist.removy(1);
        assertEquals(1, dllist.toString().split("\n").length);
    }

}

