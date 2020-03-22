public class Car {
    String name;
    int fuelLevel;
    int maxSpeed;
    boolean broken;
    void drive() {
        if (broken){
            System.out.println("Car " + name
                     + "is broken");
        }else if (fuelLevel > 0) {
            System.out.println("Car" + name + "is driving with speed " + maxSpeed);
            fuelLevel = 50;
            //drive
        }
    }
    void refuel(){
        //refuel
    }

}
