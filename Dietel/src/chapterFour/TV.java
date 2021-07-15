package chapterFour;

public class TV {
    private boolean isOn;
    private int channel;
    private int volume;
    private int brightness;

    public TV(){
        this.channel = channel;
    }

    public boolean isOn() {
        return isOn;
    }

    public void turnOn() {
        isOn = !isOn;
;
    }

    public void channelUp() {
        if (isOn && channel >= 1)
//        if(channel <100)
            channel++;
    }

    public void channelDown() {
        if (channel >= 1 && channel <= 100){
        if (isOn && channel <= 1)
            channel--;
        }
    }

    public int getChannel(){
        return channel;
    }
}
