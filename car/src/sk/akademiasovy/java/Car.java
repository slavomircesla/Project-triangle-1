package sk.akademiasovy.java;

import java.util.Random;

/**
 * Created by schoolpc on 8. 1. 2018.
 */
public class Car {
    private String brand;
    private int speed;
    private boolean engine;
    private float gasConsumption;

    public Car(int seats) {
        this.seats = seats;
    }

    private int seats;

    public Car(String color) {
        this.color = color;
    }

    private String color;

    public Car(boolean breaks) {
        this.breaks = breaks;
    }

    private boolean breaks;

    public String getPlate() {
        return plate;
    }

    private String plate;


    // constuctor
    public Car(){
        speed=0;
        engine=false;
        gasConsumption=7.9f;
        brand=null;

    }
    public Car(String brand, float consumption, String city)
    {
        speed=0;
        engine=false;
        gasConsumption=consumption;
        this.brand=brand;
        generatePlate(city);
    }

    public void generatePlate (String city)
    {
     switch(city.toLowerCase()) {
         case "Trencin":
             plate = "TN";
             break;
         case "Senec":
             plate = "SC";
             break;
         case "Presov":
             plate = "PO";
             break;
         case "Bratislava":
             plate = "BA";
             break;
         case "Nitra":
             plate = "NR";
             break;
         default:
             plate = "KE";
     }
     Random random = new Random();
     int i;
     for(i=1;i<=3;i++)
     {

         int randomNumber=random.nextInt(10);

             printInfo();
         plate=plate+randomNumber;

     }
     for(i=1;i<=2;i++)
     {
         int randomNumber=random.nextInt(26)+'A';
         plate=plate+(char)randomNumber;
     }
     System.out.println("SPZ: " +plate);
    }

    public void setBrand(String value)
    {
        brand=value;
    }

    public void setGasConsumption(float gasConsumption)
    {
        this.gasConsumption=gasConsumption;
    }

    public void printInfo()
    {
    System.out.println("Brand: "+brand+"Consumption: "+gasConsumption+" Actual speed: "+speed+" Engine: "+engine);

    }
    public void startEngine()
    {
        engine=true;
    }

    public void stopEngine()
    {
        engine=false;
    }

    public void increaseSpeed(int value)
    {
        if(engine==true)
        speed+=value;
    }

    public void decreaseSpeed()
    {
        speed-=10;
        if(speed<0)
            speed=0;
    }


    public void stop ()
    {
        speed=0;
    }

    public float getPrice(int distance, float costPerLiter)
    {
        float price;
        price=distance*gasConsumption*costPerLiter/100;
        return price;

    }

    public int getSpeed()
    {

        return speed;
    }

}
