package org.esurovskiy.test2;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Computer {
    public String manufacture;
    private float price;
    private int cpu;
    private int serialNumber;


    public Computer(final int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(final String manufacture) {
        this.manufacture = manufacture;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float p) {
        price = p;
    }

    public int getCpu() {
        return cpu;
    }

    public void setCpu(final int cpu) {
        this.cpu = cpu;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final int serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "manufacture='" + manufacture + '\'' +
                ", price=" + price +
                ", cpu=" + cpu +
                ", serialNumber=" + serialNumber +
                '}';
    }
}
