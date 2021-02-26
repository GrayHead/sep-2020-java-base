package lesson1;

import java.util.Arrays;

public class User {
    private int id;
    private String name;
    private String[] skills;
    private Wallet wallet; // type sum


    public User() {
    }

    public User(int id, String name, String[] skills) {
        this.id = id;
        this.name = name;
        this.skills = skills;
    }

    public User(int id, String name, String[] skills, Wallet wallet) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = wallet;
    }

    public User(int id, String name, String[] skills, String type, int sum) {
        this.id = id;
        this.name = name;
        this.skills = skills;
        this.wallet = new Wallet(type, sum);
    }

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

    public String[] getSkills() {
        return skills;
    }

    public void setSkills(String[] skills) {
        this.skills = skills;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public static void greeting() {
        System.out.println(new User().name);
    }

    @Override
    public String toString() {
        return "lesson1.User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", skills=" + Arrays.toString(skills) +
                ", wallet=" + wallet +
                '}';
    }
}
