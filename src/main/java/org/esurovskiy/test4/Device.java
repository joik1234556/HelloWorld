package org.esurovskiy.test4;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Device {
    private String manufacturer;
    private float price;
    private String serialNumber;

    public Device(String manufacturer, String serialNumber) {
        this.manufacturer = manufacturer;
        this.serialNumber = serialNumber;
    }

    public void printPrice() {
        System.out.println(price * 0.7);
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(final String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() +
                ": manufacturer=" + manufacturer +
                ", price=" + price +
                ", serial=" + serialNumber;
    }
}
