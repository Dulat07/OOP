package lab1.java;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        setTime(hour, minute, second);
    }

    public void setTime(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 && minute >= 0 && minute < 60 && second >= 0 && second < 60) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public String toUniversal() {
        String h = (hour < 10 ? "0" : "") + hour;
        String m = (minute < 10 ? "0" : "") + minute;
        String s = (second < 10 ? "0" : "") + second;
        return h + ":" + m + ":" + s;
    }

    public String toStandard() {
        int standardHour = hour % 12;
        if (standardHour == 0) standardHour = 12;
        String amPm = (hour < 12) ? "AM" : "PM";
        
        String h = (standardHour < 10 ? "0" : "") + standardHour;
        String m = (minute < 10 ? "0" : "") + minute;
        String s = (second < 10 ? "0" : "") + second;
        
        return h + ":" + m + ":" + s + " " + amPm;
    }

    public void add(Time t) {
        this.second += t.second;
        this.minute += this.second / 60;
        this.second %= 60;

        this.minute += t.minute;
        this.hour += this.minute / 60;
        this.minute %= 60;

        this.hour = (this.hour + t.hour) % 24;
    }
}
