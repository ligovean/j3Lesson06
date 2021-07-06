package arraymeth;

public class ExtractArr {

    public int[] extractor (int[] arrEnt){
        int[] intArrRes;
        int posFour=0;
        boolean err=true;
        int intArrTmp;
        //Позиция последней четверки
        for (int i = 0; i < arrEnt.length; i++) {
            if (arrEnt[i]==4){
                err = false;
                posFour = i;}
        }

        if (!err) {
            intArrRes = new int[arrEnt.length - posFour - 1];

            for (int i = posFour+1; i < arrEnt.length; i++) {
                intArrRes[i-posFour-1] = arrEnt[i];
            }
            return intArrRes;
        } else{
            throw new RuntimeException();
        }
    }
}
