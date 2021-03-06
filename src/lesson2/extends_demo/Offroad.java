package lesson2.extends_demo;

public class Offroad extends Car {
    private int power;

    public Offroad() {
    }

    public Offroad(int id, String model) {
        super(id, model);
    }


    public Offroad(int id, String model, int power) {
        super(id, model);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }


    @Override
    public void drive() {
        System.out.println("drive offroad " + this.power);
    }

    @Override
    public String toString() {
        return "Offroad{" +
                "power=" + power +
                "} " + super.toString();
    }
}
