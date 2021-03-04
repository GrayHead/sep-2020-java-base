package lesson5;


import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class User implements Comparable<User> {

    //    private static int value = 1;
//    public User() {
//        this.id = value;
//        value++;
//    }
//    public User(String name) {
//
//        this.id = value;
//        value++;
//        this.name = name;
//    }
    private int id;
    private String name;


    @Override
    public int compareTo(User b) {
        return this.id - b.id;
    }
}
