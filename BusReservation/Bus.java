package BusReservation;

import java.util.ArrayList;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity; // must want get and set methods

    Bus(int no, boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getCapacity(){ // accessor method
        return this.capacity;
    }

    public void setCapacity(int cap){ //mutator method
        this.capacity=cap;
    }

    public boolean getAc(){
        return this.ac;
    }

    public void setAc(boolean ac){
        this.ac=ac;
    }
    public int getBusNo(){
        return this.busNo;
    }

    public void displayBusInfo(){
        System.out.println("Bus No: "+busNo+", Ac: "+ac+", Capacity: "+capacity);
    }


    }

    // no mutator for busno. I have designed busno as not to be changed

