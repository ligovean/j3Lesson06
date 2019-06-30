package arraymeth;

public class ArrCheck {

    public boolean Check(int[] arrEnt){
        boolean res=false;
        for (int elm:arrEnt) {
            if (elm==1 || elm==4){
                res=true;
                break;
            }
        }
        return res;
    }
}
