package collepsionMethod.modal;

import java.util.HashMap;
import java.util.HashSet;

public class MechanicalDepartment {

    public <IntegerHashset> HashSet<mechanical> create(){

        HashMap<Integer,mechanical > details = new HashMap<>();
        mechanical mechanical1 =new mechanical("aman", "mechanical", 25,36.22);
                details.put(2,mechanical1);


        return null;
    }
    public static void main(String[]args){
        MechanicalDepartment obj =new MechanicalDepartment();
        HashSet<mechanical>m =obj.create();

        }


}
