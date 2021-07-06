package arraymeth;

public class Main {
    public static void main(String[] args) {
        /*
        int[] arr = {4,2,0,0,2,3,0,1,7};
        ExtractArr ext = new ExtractArr();
        ext.extractor(arr);


        for (int arrEl:ext.extractor(arr)) {
            System.out.print(arrEl+",");
        }
        System.out.println();
        */

        ArrCheck arc = new ArrCheck();

        //int[] arr = {4,2,0,0,2,3,0,1,7};
        int[] arr = {0,2,0,0,2,3,0,0,7};
        System.out.println(arc.Check(arr));
    }

}
