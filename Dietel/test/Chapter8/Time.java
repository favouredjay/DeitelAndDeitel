package Chapter8;

public class Time {
 private int hour;
    private int minutes;
    private int seconds;
    public Time(int seconds){
    this(seconds, 0 ,0);
    }
    public Time(int seconds, int minutes,  int hour) {
       if(seconds < 0 || seconds >= 60)
       throw new IllegalArgumentException("Seconds must be between 0 and 60");

       if(minutes < 0|| minutes >=60)
           throw  new IllegalArgumentException("Minutes must be between 0 and 60");

       if(hour <0|| hour >= 24)
           throw new IllegalArgumentException("Hours must be between 0 and 24");

       this.seconds = seconds;
       this.minutes = minutes;
       this.hour = hour;


    }




}
