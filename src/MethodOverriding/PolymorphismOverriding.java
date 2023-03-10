package MethodOverriding;

public class PolymorphismOverriding {
    static class Vehicle{
        //defining a method
        void run(){System.out.println("Vehicle is moving");}
    }
    //Creating a child class
    static class Car2 extends Vehicle{
        //defining the same method as in the parent class
        void run(){System.out.println("Car is running safely");}

        public static void main(String args[]){
            Car2 obj = new Car2();//creating object
            obj.run();//calling method

        }
    }
}
