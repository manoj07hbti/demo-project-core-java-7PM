package class_and_object;

public class College {


    // Data Members //

    String uniName;
    int code;
    int fees;
    String add;


   // parameterzied constructor //

    public College(String uniName, int code, int fees, String add) {
        this.uniName = uniName;
        this.code = code;
        this.fees = fees;
        this.add = add;
    }

    public static  void main(String[]args){

        //ClassName objName= new Classname(param1, param2.....); //

        College obj = new College("Bhimrao Ambedkar ",0756,34000,"Agra");

        System.out.println("university Name "+obj.uniName +": university Code "+obj.code +": university Total Fees "+obj.fees +": university Address "+obj.add);

    }
}
