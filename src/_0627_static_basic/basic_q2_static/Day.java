package _0627_static_basic.basic_q2_static;

public class Day {
    private String activity;
    private int hours;
    private String location;

    private static int totalHours = 0;
    private static int totalDays = 0;

    public Day(String activity, int hours, String location) {
        this.activity = activity;
        this.hours = hours;
        this.location = location;

        totalHours += hours;
        totalDays++;
    }

    public static int getTotalHours() {
        return totalHours;
    }

    public static double getAverageHours() {
        return (double) totalHours / totalDays;
    }

    @Override
    public String toString() {
        return activity + " " + hours + "시간, 장소: " + location;
    }
}
