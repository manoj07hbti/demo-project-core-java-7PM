package demo;

public class College {
    String name;
    int faculty;
    String dept;

    public College(String name, int faculty, String dept) {
        this.name = name;
        this.faculty = faculty;
        this.dept = dept;
    }
        public static void main(String[] args){

            College obj1= new College("Mithibai college",40,"Law");
            System.out.println("Name is: "+obj1.name + " Faculty is: "+obj1.faculty +" Dept is: "+obj1.dept);

            College obj2= new College("Thakur college",25,"Commerce");
            System.out.println("Name is: "+obj2.name + " faculty is: "+obj2.faculty+" Dept is: "+obj2.dept);
        }
        }


