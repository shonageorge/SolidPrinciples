package com.stackroute.hackathon;

public class ElectricSwitch {

    public static void main(String[] args) {
        Switch sof=new Switch();
        sof.switchOff();
        sof.switchOn();
    }
}
class Switch
{
    int flag=1;
    public void switchOn()
    {
        if(flag==1)
        System.out.println("The switch is ON");
    }
    public void switchOff()
    {
        if(flag==0)
        System.out.println("The switch is OFF");
    }
}