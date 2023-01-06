public class TV implements CanOffOn,CanChangeChannel,CanChangeVolume{
    boolean isOn = false;
    int channelNo;
    int volume;
    String[] tvStations = {"TVP1","TVP2","TVN","Polsat","EskaTV","PolskaTV","TvPL","Stacja8","Stacja9","Stacja10"};


    public String status(){
        if(isOn){
            return "TV is ON\nChannel: "+ channelNo + ", Name : " + tvStations[channelNo-1];
        }
        return "TV is OFF";
    }

    public void on(){
        this.isOn=true;
        this.channelNo=1;
        this.volume=1;
    }

    public void off(){
        this.isOn=false;
    }
    
    public void channelUp(){
        if(!isOn){
            System.out.println("Turn on TV first before changing channels");
            return;
        }

        if(channelNo==10){
            channelNo=1;
        } else{
            channelNo++;
        }
    }

    public void channelDown(){
        if(!isOn){
            System.out.println("Turn on TV first before changing channels");
            return;
        }

        if(channelNo==1){
            channelNo=10;
        } else{
            channelNo--;
        }
    }

    public void setChannel(int number){
        if(number>=1&&number<=10){
            this.channelNo=number;
        } else{
            System.out.println("Please input a number between 1 and 99");
        }
    }

    public void volumeUp(){
        if(!isOn){
            System.out.println("Turn on TV first before changing its volume!!");
            return;
        }
        if(volume==10){
            System.out.println("Max volume");
        }else{
            volume++;
        }

    }
    

    public void volumeDown(){
        if(!isOn){
            System.out.println("Turn on TV first before changing its volume!!");
            return;
        }
        if(volume==1){
            System.out.println("Min volume");
        } else{
            volume--;
        }

    }

    public void displayStations(){
        int counter=1;
        for(String i:tvStations){
            System.out.print("Stacja "+ counter + ": ");
            System.out.println(i);
            counter++;
        }
    }
}
