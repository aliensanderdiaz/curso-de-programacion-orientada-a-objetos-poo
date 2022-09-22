package CURSOPOOUBER.Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola");

        // Car car = new Car();
        // car.license = "ABC123";
        // car.driver = "Andres Perez";
        // car.passengers = 5;
        // System.out.println("Car Licence: " + car.license);

        // Car car2 = new Car();
        
        // car2.license = "ABC124";
        // car2.driver = "Andres Perea";
        // System.out.println("Car Licence: " + car2.license);
        // car2.printDataCar();

        Account driver = new Account("Pedro Perez", "1075235");
        Car car = new Car("ABC123", driver);
        car.printDataCar();
    }
}