package com.stackroute.hackathon;

public class ToyBuilder {
    public static void main(String[] args) {
        MovingToy mt=new MovingToy();
        mt.car();
        mt.train();
        FlyingToy ft=new FlyingToy();
        ft.plane();

    }

}

class Toy{
      String color="red";
      float price=600;
}
 class MovingToy extends Toy
 {
     public void car()
     {
         System.out.println("Car is a moving toy of color "+color);
     }
     public void train()
     {
         System.out.println("Train is a moving toy of rate "+price+"rs");
     }
 }
 class FlyingToy extends Toy
 {
     public void plane()

     {
         price+=200.50;
         color="white";
         System.out.println("Plane of rs. "+price+" has color "+color);
     }
 }