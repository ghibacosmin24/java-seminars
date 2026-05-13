package vehicle;

public class Demo {
    public static void main(String[] args) {
        Garage garage = new Garage(10);

        Car car1 = new Car("C1", "BMW", 220, 9000, 4);
        Car car2 = new Car("C2", "Audi", 240, 12000, 2);
        Motorcycle motorcycle1 = new Motorcycle("M1", "Yamaha", 180, 5000, false);
        Motorcycle motorcycle2 = new Motorcycle("M2", "Honda", 160, 7000, true);
        Truck truck1 = new Truck("T1", "Volvo", 140, 16000, 12000);

        garage.add(car1);
        garage.add(car2);
        garage.add(motorcycle1);
        garage.add(motorcycle2);
        garage.add(truck1);

        Vehicle[] vehicles = new Vehicle[3];
        vehicles[0] = car1;
        vehicles[1] = motorcycle1;
        vehicles[2] = truck1;

        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i].move();
        }

        System.out.println("car1 equals car2: " + car1.equals(car2));

        garage.rentById("C1");
        garage.rentById("M2");

        garage.printAvailable();
        garage.printNeedsService();

        garage.printRentalEstimate("C1", 3);

        garage.returnById("C1", 300);
    }
}