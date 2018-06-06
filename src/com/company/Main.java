package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat myCat = new Cat("Scott", "Sophie",3,'F',"Louisville", true,10.5);
        System.out.println("The name of my cat is; " + myCat.getPetName());
        System.out.println("does this cat have whiskers?" + myCat.isWhiskers());
       System.out.println(myCat.makeSound());
        System.out.println(myCat.catYears());
    }


}

