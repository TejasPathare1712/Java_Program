
public class Vehicle {
    // fields and methods
    public void test() {
        System.out.println("Vehicle Testing");
    }

    class Car extends Vehicle {
        @Override
        public void test() {
            System.out.println("Engine oil is checked");
            System.out.println("Coolant water is checked");
            System.out.println("Air of all tyres is checked");
            
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle.Car car = vehicle.new Car(); // Instantiate inner class using the outer class instance

        Vehicle v1 = car; // Assign the car object to the Vehicle reference
        v1.test(); // This will call the overridden method in the Car class
    }
}
