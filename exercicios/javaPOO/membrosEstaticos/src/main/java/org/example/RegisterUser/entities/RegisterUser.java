package org.example.RegisterUser.entities;

public class RegisterUser {
    public String name;
    public int age;
    private static int counterInstances = 0;

    public void Counter(){
        counterInstances++;
    }

    public static int getCount(){
        return counterInstances;
    }

    public void showData(){
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Counter Instances: %d\n", getCount());
        System.out.println("=-=-=-=-=-=-=");
    }

    public void birthday(){
        age += 1;
    }


}
