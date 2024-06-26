package _0627_inherit_basic.basic_q3_inherit;

public class Main {
    public static void main(String[] args) {
        Smartphone smartphone = new Smartphone(80, "red", 20);
        Tablet tablet = new Tablet(70, "blue", false);
        Laptop laptop = new Laptop(100, "silver");
        System.out.println(smartphone);
        System.out.println(tablet);
        System.out.println(laptop);

    }
}

class Smartphone extends Move{ // 스마트폰
    private int cameraResolution; // 카메라 해상도

    public Smartphone(int batteryCapacity, String color, int cameraResolution) {
        super(batteryCapacity, color);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() { return cameraResolution; }
    public void setCameraResolution(int resolution) { this.cameraResolution = resolution; }

    @Override
    public String toString() {
        return "Smartphone{" +
                "cameraResolution=" + cameraResolution +
                ", batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}
class Tablet extends Move { // 태블릿
    private boolean isConnected; // 연결 상태

    public Tablet(int batteryCapacity, String color, boolean isConnected) {
        super(batteryCapacity, color);
        this.isConnected = isConnected;
    }

    public boolean getIsConnected() { return isConnected; }
    public void setIsConnected(boolean status) { this.isConnected = status; }

    @Override
    public String toString() {
        return "Tablet{" +
                "isConnected=" + isConnected +
                ", batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}

class Laptop extends Move { // 노트북

    public Laptop(int batteryCapacity, String color) {
        super(batteryCapacity, color);
    }

    public void charge(int additionalCapacity) {
        batteryCapacity = additionalCapacity;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "batteryCapacity=" + batteryCapacity +
                "} " + super.toString();
    }
}