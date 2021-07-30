
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.tracker.oop.Point;

public class PointTest {

    @Test
    public void when000to200then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int z1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z2 = 0;
        double out = Point.main(x1, y1, z1, x2, y2, z2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when200to200then0() {
        double expected1 = 0;
        int x1 = 2;
        int y1 = 0;
        int z1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z2 = 0;
        double out = Point.main(x1, y1, z1, x2, y2, z2);
        Assert.assertEquals(expected1, out, 0.01);
    }

    @Test
    public void when200to000then2() {
        double expected2 = 2;
        int x1 = 2;
        int y1 = 0;
        int z1 = 0;
        int x2 = 0;
        int y2 = 0;
        int z2 = 0;
        double out = Point.main(x1, y1, z1, x2, y2, z2);
        Assert.assertEquals(expected2, out, 0.01);
    }

    @Test
    public void when110to200then141() {
        double expected3 = 1.41;
        int x1 = 1;
        int y1 = 1;
        int z1 = 0;
        int x2 = 2;
        int y2 = 0;
        int z2 = 0;
        double out = Point.main(x1, y1, z1, x2, y2, z2);
        Assert.assertEquals(expected3, out, 0.01);
    }
}