package sorting;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: seung-wongim
 * Date: 2013. 11. 21.
 * Time: 오후 3:24
 * To change this template use File | Settings | File Templates.
 */
public class QuicksortTest {
    @Test
    public void sortTest() {
        List<Integer> array = Arrays.asList(12, 32, 42, 36, 539, 13, 25, 38);
        Quicksort quicksort = new Quicksort(array);

        Assert.assertEquals((Object) 539, quicksort.getLastObject());
    }

    @Test
    public void zeroTest() {
        List<Integer> array = Arrays.asList(0, 0, 0, 0, 0, 0, 0, 0);
        Quicksort quicksort = new Quicksort(array);

        Assert.assertEquals((Object) 0, quicksort.getLastObject());
    }

    @Test
    public void oneElemTest() {
        List<Integer> array = Arrays.asList(0);
        Quicksort quicksort = new Quicksort(array);

        Assert.assertEquals((Object) 0, quicksort.getLastObject());
    }

    @Test
    public void objOfIdxTest() {
        List<Integer> array = Arrays.asList(12, 32, 42, 36, 539, 13, 25, 38);
        Quicksort quicksort = new Quicksort(array);

        Assert.assertEquals((Object) 32, quicksort.getObjectOfIndex(3));
    }

    @Test
    public void indexOfElemTest() {
        List<Integer> array = Arrays.asList(12, 32, 42, 36, 539, 13, 25, 38);
        Quicksort quicksort = new Quicksort(array);

        Assert.assertEquals(7, quicksort.getIndexOfElements(539));
    }
}
