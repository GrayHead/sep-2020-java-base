package lesson3.demo2;

public class User extends Human {
    private String name;

    public User() {
    }

    @Override
    public void live() {

    }

    public User(String name) {
        this.name = name;
    }

    public User(int id, String name) {
        super(id);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                "} " + super.toString();
    }

    @Override
    public int doRun() {
        return 0;
    }
}
