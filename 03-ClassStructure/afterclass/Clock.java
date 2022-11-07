public class Clock{
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    
    Clock(){
        hour = 0;
        minute = 0;
    }
    
    Clock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    public void setAlarm(int alarmHour, int alarmMinute){
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }
    
    public void setClock(){
        hour = 0;
        minute = 0;
    }
    
    public void setClock(int hour, int minute){
        this.hour = hour;
        this.minute = minute;
    }
    
    public void displayTime(){
        System.out.println("Time: " + hour + ":" + minute);
    }
    
    public void addMinute(){
        if (minute == 59){
            hour+=1;
            minute = 0;
        } else{
            minute+=1;
        }
        if(hour == alarmHour && minute == alarmMinute){
            System.out.println("beep, beep, beep");
        }
    }
    
}