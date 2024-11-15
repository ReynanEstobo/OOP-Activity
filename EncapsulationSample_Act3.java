public class EncapsulationSample_Act3 {
    public static void main(String[] args){

        System.out.println("======STUDENT=====");

        Student student1 = new Student("Juan", "Batangas PH", "BSIT", 2);
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student Address: " + student1.getAddress());
        System.out.println("Student Program: " + student1.getProgram());
        System.out.println("Student Year: " + student1.getYear());
        System.out.println(student1.toString());

        System.out.println("======STAFF=====");

        Staff staff1 = new Staff("Reynan", "Brgy. Gumamela", "BSU", 500);
        System.out.println("Staff name: " + staff1.getName());
        System.out.println("Staff Address: " + staff1.getAddress());
        System.out.println("Staff School: " + staff1.getSchool());
        System.out.println("Staff Salary: " + staff1.getSalary());

        System.out.println("======STAFF=====");

        Staff staff2 = new Staff("Emman", "Brgy. Cayponce", "BSU", 500);
        System.out.println("Staff name: " + staff2.getName());
        System.out.println("Staff Address: " + staff2.getAddress());
        System.out.println("Staff School: " + staff2.getSchool());
        System.out.println("Staff Salary: " + staff2.getSalary());
        System.out.println(staff2.toString());

    }
}

class Person {
    protected String Name;
    protected String Address;  

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAddress(String Address){
        this.Address = Address;
    }

    public String getName(){
        return Name;
    }
    public String getAddress(){
        return Address;
    }

    public String toString(){
        return "Hello I am " + Name + " and " + "I lived in " + Address + ".";
    }
}

class Student extends Person{
    private String Program;
    private int Year;

    public Student(String Name, String Address, String Program, int Year){
        this.Name = Name;
        this.Address = Address;
        this.Program = Program;
        this.Year = Year;
    }
    public void setProgram(String Program){
        this.Program = Program;
    }
    public void setYear(int Year){
        this.Year = Year;
    }

    public String getProgram(){
        return Program;
    }

    public int getYear(){
        return Year;
    }

    public String toString(){
        return "Hello I am " + Name + " and " + " I lived in " + Address + ". I am " + Year + " year of " + Program + ".";
    }
}


class Staff extends Person {
    private String School;
    private double Salary;

    public Staff(String Name, String Address, String School, double Salary){
        this.Name = Name;
        this.Address = Address;
        this.School = School;
        this.Salary = Salary;
    }

    public void setSchool(String School){
        this.School = School;
    }

    public void setSalary(double Salary){
        this.Salary = Salary;
    }

    public String getSchool(){
        return School;
    }

    public double getSalary(){
        return Salary;
    }

    public String toString(){
        return "Hello I am " + Name + " and " + "I lived in " + Address + ". My salary is: " + Salary + ". I study in " + School + ".";
    }

}



