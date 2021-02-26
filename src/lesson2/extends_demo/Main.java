package lesson2.extends_demo;

public class Main {
    public static void main(String[] args) {


//        User user1 = new User();
//        User user2 = new User();
//        User user3 = new User();
//
////        User[] users = {user1, user2};
//        User[] users = new User[3];
//        users[0] = user1;
//        users[1] = user2;
//        users[2] = user3;


        Car car = new Car(1, "mazda");
        Offroad offroad = new Offroad(2, "subaru", 256);
        offroad.drive();
        System.out.println(offroad);

        SuperCar superCar = new SuperCar(3, "urus", 480, true);
        Suv suv = new Suv(4, "ram4000", 300, 50, 50);


        Car[] cars = new Car[4];
        cars[0] = car;
        cars[1] = offroad;
        cars[2] = superCar;
        cars[3] = suv;
        Offroad[] offroads = {offroad, superCar, suv};

        checkCar(superCar);

    }

    public static void checkCar(Car car) {
        car.drive();
    }

}
