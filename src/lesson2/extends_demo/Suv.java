package lesson2.extends_demo;

public class Suv extends Offroad {
    private int fd;
    private int bd;

    public Suv() {
    }

    public Suv(int id, String model, int power, int fd, int bd) {
        super(id, model, power);
        this.fd = fd;
        this.bd = bd;
    }

    public int getFd() {
        return fd;
    }

    public void setFd(int fd) {
        this.fd = fd;
    }

    public int getBd() {
        return bd;
    }

    public void setBd(int bd) {
        this.bd = bd;
    }

    @Override
    public String toString() {
        return "Suv{" +
                "fd=" + fd +
                ", bd=" + bd +
                "} " + super.toString();
    }
}
