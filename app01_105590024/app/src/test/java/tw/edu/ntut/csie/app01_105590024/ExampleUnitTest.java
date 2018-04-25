package tw.edu.ntut.csie.app01_105590024;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);

        letterGrade grade = new letterGrade();

        String G = grade.grade(101);
        assertEquals(G, "輸入分數應該介於[0..100]");

        G = grade.grade(95);
        assertEquals(G, "A");

        G = grade.grade(85);
        assertEquals(G, "B");

        G = grade.grade(75);
        assertEquals(G, "C");

        G = grade.grade(65);
        assertEquals(G, "D");

        G = grade.grade(55);
        assertEquals(G, "F");

        G = grade.grade(-5);
        assertEquals(G, "輸入分數應該介於[0..100]");
    }
}