package lesson3.demo5;


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Dog> arrayList = new ArrayList<>();
        arrayList.add(new Dog("asd", "rex"));
        Dog plutto = new Dog("asd", "plutto");
        arrayList.add(plutto);
        System.out.println(arrayList);
        Dog dog = arrayList.get(1);
        System.out.println(dog);

        for (Dog dog1 : arrayList) {
            System.out.println(dog1);
        }


    }
}
