package org.esurovskiy.test4;

/**
 * TODO: write javadoc
 *
 * @author Evgeniy Surovskiy
 */
public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(final String manufacturer, final String serialNumber) {
        super(manufacturer, serialNumber);
    }

    @Override
    public void printPrice() {
        System.out.println(10 * getPrice());
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(final int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(final int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString() {
        return super.toString()
                + ", X=" + resolutionX
                + ", Y" + resolutionY;
    }
}
