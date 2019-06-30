import arraymeth.ExtractArr;
import org.junit.Test;

public class TestClass {

    @Test
    public void testExtractArr0(){
        ExtractArr ext = new ExtractArr();
        int[] inp = {1,2,4,4,2,3,4,1,7};
        ext.extractor(inp);
    }

    @Test(expected = RuntimeException.class)
    public void testExtractArr1(){
        ExtractArr ext = new ExtractArr();
        int[] inp = {1,2,0,0,2,3,0,1,7};
        ext.extractor(inp);
    }
}
