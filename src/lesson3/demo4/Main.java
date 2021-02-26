package lesson3.demo4;

public class Main {
    public static void main(String[] args) {

        User vasya = new User("vasya", Seasons.AUTUMN);
        vasya.getBirthArea().getAlias();
        vasya.getBirthArea().getDays();

    }
}

class User {
    private String name;
    private Seasons birthArea;

    public User(String name, Seasons birthArea) {
        this.name = name;
        this.birthArea = birthArea;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Seasons getBirthArea() {
        return birthArea;
    }

    public void setBirthArea(Seasons birthArea) {
        this.birthArea = birthArea;
    }
}


