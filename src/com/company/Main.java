package com.company;

 class Time{
    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour(){
        return hour;
    }
    public int getMinute(){
        return minute;
    }
    public int getSecond(){
        return second;
    }

    public void addHour(int delta) {
         if(hour >= 25){
             this.hour=1;
         }else{
             this.hour=hour;
         }
    }

    public void addMinute(int delta){
        if(minute>59){
            this.minute = minute-59;
            this.hour+=1;
            if(this.hour>23);{
                this.hour =1;
            }
        }else{
            this.minute=minute;
        }
    }

    public void addSecond(int delta){
        if(second>59) {
            this.second = second - 59;

            this.minute += 1;
            if (this.minute > 59) {
                this.minute = minute - 59;
                this.hour += 1;
            }
            if (this.hour > 23) {
                this.hour = 1;
            }
        }
        else {
           this.second = second;
        }
     }

    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }

}

public class Main {

    public static void main(String[] args) {
	Time time = new Time(9,65,23 );
    System.out.println(time.toString());
        time.addHour(9);
        time.addMinute(65);
        time.addSecond(23);

        System.out.println(time.toString());


    }
}
