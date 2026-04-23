package exCheckStudent.entities;

public class CheckStudent {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;
    public double missing;
    public String status;

    public double finalGrade(){
         return grade1 + grade2 + grade3;
    }

    public double missingPoints(){
        missing = 60 - finalGrade();
        return missing;
    }

    public String result(){
        if (finalGrade() > 60){
            status = "PASS";
            return status;
        }
        else{
            status = "FAILED";
            return status;
        }
    }

    public void showData(){
        System.out.println("Name: " + name);
        System.out.println("Final Grade: " + finalGrade());
        System.out.println("Status: " + result());
        if (finalGrade() < 60){
            System.out.println("Missing: " + missingPoints() + "points");
        }
    }



}
