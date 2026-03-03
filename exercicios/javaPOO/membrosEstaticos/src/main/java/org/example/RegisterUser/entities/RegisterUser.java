package org.example.RegisterUser.entities;

public class RegisterUser {
    public String name;
    public int age;
    private static int counterInstances = 0;

    // Construtor que incrementa o contador a cada instância criada
    public RegisterUser() {
        counterInstances++;
    }


    public static int getCount(){
        return counterInstances;
    }

    public void showData(){
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.println("=-=-=-=-=-=-=");
    }

    public void birthday(){
        age += 1;
    }


}
