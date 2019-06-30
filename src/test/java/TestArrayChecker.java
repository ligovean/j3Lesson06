import arraymeth.ArrCheck;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArrayChecker {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,2,4,4,2,3,4,1,7}},
                {new int[]{0,1,0,0,2,3,0,1,0}},
                {new int[]{0,1,4,4,2,3,4,1,0}},
                {new int[]{0,2,0,0,2,3,0,0,7}},
                {new int[]{0,2,4,0,2,3,0,1,0}},
                {new int[]{0,0,0,0,2,3,0,0,7}},
        });
    }

    private ArrCheck arrChk;
    private int[] a;

    public TestArrayChecker(int[] a) {
        this.a = a;
    }

    @Before
    public void init() {
        arrChk = new ArrCheck();
    }

    @Test
    public void massTestAdd() {
        Assert.assertTrue("There's not a one or four!", arrChk.Check(a));
    }
}
