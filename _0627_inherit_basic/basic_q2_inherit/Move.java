package _0627_inherit_basic.basic_q2_inherit;

public class Move {
    public int batteryCapacity; // 배터리 용량
    private String color; // 색상

    public Move(int batteryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.color = color;
    }

    public int getBatteryCapacity() { return batteryCapacity; }
    public void setBatteryCapacity(int capacity) { this.batteryCapacity = capacity; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Move{" +
                "batteryCapacity=" + batteryCapacity +
                ", color='" + color + '\'' +
                '}';
    }
}
