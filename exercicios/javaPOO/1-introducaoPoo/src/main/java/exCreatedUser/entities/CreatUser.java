package exCreatedUser.entities;

public class CreatUser {
    public String name;
    public double grossSalary;
    public double tax;
    public double percentage = 0;

    public double netSalary(){
        if (percentage == 0){
            return grossSalary - tax;
        }else{
            grossSalary += (grossSalary * (percentage / 100));
            return grossSalary - tax;
        }

    }

    public String toString(){
        return "Name: " + name + "\nSalary: " + netSalary();
    }






}
