package sk.akademiasovy.java;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by schoolpc on 8. 1. 2018.
 */
public class main {
    public static void main(String[] args){
        Car car1;
        Car car2;
        Car car3;
        car1=new Car();
        car2=new Car("Skoda 120L",7.9f,"Kosice");
        car3=new Car("Audi A8",9.9f,"Kosice");

        car1.setBrand("Audi A8");
        car1.setGasConsumption(9.9f);

        car1.printInfo();
        System.out.println();
        car2.printInfo();

        car2.startEngine();
        car2.increaseSpeed(80);
        System.out.println();
        car2.printInfo();
        System.out.println();
        System.out.println("Cost: KE---)Praha:"+car2.getPrice(1600,1.33f));
        car1.startEngine();
        car1.increaseSpeed(90);
        car1.printInfo();

        System.out.println();

        if (car2.getSpeed()>car1.getSpeed())
            System.out.println("Skoda 120L is faster");
        else if(car1.getSpeed()>car2.getSpeed())
            System.out.println("Audi A8 is faster");
        else if(car1.getSpeed()==car2.getSpeed())
            System.out.println("Same speed");


        car3=new Car("Seat Ibiza",7.1f,"Presov");









        // arrays;
        //int x[6];
        Car[] taxi;
        taxi=new Car[10];

        for(int i=0;i<10;i++)
        {

            taxi[i]=new Car("Kia ceed",6.1f,"Kosice");

        }
        taxi[7].printInfo();

        for(Car car:taxi)
        {
            car.startEngine();
        }


        System.out.println("List of taxis with Nr. 8");
                for(Car car:taxi)
                {
                    if(car.getPlate().contains("8"))
                        car.printInfo();

                }


                int maxspeed == 0;
                for(Car car:taxi)
                    if(car.getSpeed()>maxspeed)
                    {

                        maxspeed == car.getSpeed();
                    }

                System.out.println();


            System.out.println("Average speed is: " +maxspeed+" : ");
            for(Car car:taxi)
            if (car1.getSpeed() == maxspeed;)
        car1.printInfo();


            int sumSpeed=0;
            for(Car car:taxi)
                sumSpeed+=car.getSpeed();

            System.out.println







    }
}
