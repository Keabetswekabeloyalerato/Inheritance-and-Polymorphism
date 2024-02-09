import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get vehicle manufacturer
        System.out.println("Enter the vehicle manufacturer:");
        String manufacturer = scanner.nextLine();

        // Get owner information
        System.out.println("Enter the name of the vehicle owner:");
        String ownerName = scanner.nextLine();

        System.out.println("Enter the owner's gender:");
        String ownerGender = scanner.nextLine();

        System.out.println("Enter the owner's programme of study:");
        String programOfStudy = scanner.nextLine();

        System.out.println("Enter the owner's Institution name:");
        String institutionName = scanner.nextLine();

        System.out.println("Enter the owner's hobbies:");
        String hobbies = scanner.nextLine();

        System.out.println("Enter the owner's age:");
        int ownerAge = scanner.nextInt();

        // Get vehicle details
        System.out.println("Enter the number of cylinders in the engine:");
        int numCylinders = scanner.nextInt();

        // Get car details
        System.out.println("Enter the car seating capacity:");
        int seatingCapacity = scanner.nextInt();

        System.out.println("Enter the weight of the car:");
        double carWeight = scanner.nextDouble();

        // Create a Student object for the owner
        Student owner = new Student(ownerName, ownerAge, ownerGender, institutionName, programOfStudy, 0, hobbies);

        // Create a Vehicle object
        Vehicle vehicle = new Vehicle(numCylinders, manufacturer, owner);

        // Create a Car object
        Car car = new Car(numCylinders, manufacturer, owner, seatingCapacity, carWeight);

        // Print the information
        System.out.println(manufacturer+", "+numCylinders+" cylinders, owned by "+ ownerName + ", a " + ownerAge + "-year old " + ownerGender + " studying " + programOfStudy + " at " + institutionName + ". " + ownerName + " likes " + hobbies + ".");
        System.out.println("The car is a " + car.capacity + "-seater weighing " + car.weight + " kg");
    }
}
