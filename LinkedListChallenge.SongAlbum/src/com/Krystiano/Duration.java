package com.Krystiano;

public class Duration {
    private int minutes;
    private int seconds;

    public Duration(int minutes, int seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public String printDuration(){
        return (getMinutes() + ":" +getSeconds());
    }

    public void setDuration(Duration duration){
        this.setSeconds(duration.getSeconds());
        int tempMinute=0;
        if (this.getSeconds()>60){
            tempMinute=1;
        }
        this.setMinutes(duration.getMinutes()+tempMinute);
    }

    public void extendDuration(Duration duration){
        this.setSeconds(this.getSeconds()+duration.getSeconds());
        int tempMinute=0;
        if (this.getSeconds()>60){
            tempMinute=1;
            this.setSeconds(this.getSeconds()-60);
        }
        this.setMinutes(this.getMinutes()+duration.getMinutes()+tempMinute);
    }
}
