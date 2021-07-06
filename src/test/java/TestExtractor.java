import arraymeth.ExtractArr;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestExtractor {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1,2,4,4,2,3,4,1,7},new int[]{1,7}},
                {new int[]{1,2,4,4,2,3,0,1,7},new int[]{2,3,0,1,7}},
                {new int[]{1,2,4,4,2,3,4,1,7},new int[]{0,7,7,7}},
                {new int[]{4,2,0,0,2,3,0,1,7},new int[]{2,0,0,2,3,0,1,7}},
                {new int[]{1,2,0,0,2,3,0,1,7},new int[]{2,0,0,2,3,0,1,7}},
                {new int[]{1,2,4,0,2,3,0,1,7},new int[]{0,2,3,0,1,7}},
        });
    }

    private ExtractArr ext;
    private int[] a;
    private int[] b;

    public TestExtractor(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Before
    public void init() {
        ext = new ExtractArr();
    }

    @Test
    public void massTestAdd() {
        Assert.assertTrue("Arrays are not equals", Arrays.equals(b, ext.extractor(a)));
    }

}
