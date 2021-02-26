package lesson3.demo2;

import lesson2.interface_demo.Runner;

public abstract class Human implements Runner {
    private int id;

    public Human() {
    }

    public Human(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void live();


    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                '}';
    }
}
