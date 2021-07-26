package Chapter8;

public class TimeComparator {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeComparator(int hours, int minutes, int seconds) {
        if(hours >0 && hours <=24)
        this.hours = hours;
        if(minutes >0 && minutes <=60)
        this.minutes = minutes;
        if(seconds >0 && seconds <= 60)
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours >0 && hours <=24)
        this.hours = hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if(minutes >0 && minutes <=60)
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if(seconds >0 && seconds <=60)
        this.seconds = seconds;
    }
    public String toUniversalString(){
        return (getHours()+ "," + getMinutes() + "," + getSeconds());
    }
    public String toString(){
        return ((getHours() == 0 || getHours() == 12) ? 12 : getHours() % 12) + ":" +
         getMinutes() + ":"  + getSeconds()   +""+ (getHours() < 12 ? "AM" : "PM");
    }


}
