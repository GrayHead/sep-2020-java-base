package amps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Mian {
    public static void main(String[] args) {


        Map<Person, List<Pet>> map = new HashMap<>();

        Person person = new Person();

        List<Pet> pets1 = new ArrayList<>();
        pets1.add(new Pet());
        pets1.add(new Pet());
        pets1.add(new Pet());
        pets1.add(new Pet());
        person.setPets(pets1);

        map.put(person, pets1);
        map.put(new Person(), new ArrayList<Pet>() {{
            this.add(new Pet());
            this.add(new Pet());
            this.add(new Pet());
            this.add(new Pet());
            this.add(new Pet());
        }});



    }
}


class Person {
    private int id;
    private String name;
    private List<Pet> pets = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Pet> getPets() {
        return pets;
    }

    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }
}

class Pet {

    private String name;
}

