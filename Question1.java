import java.util.ArrayList;
import java.util.Scanner;

// Base class for computer components
class Component {
    protected String serialNumber;
    protected String manufacturer;
    protected String color;

    Component(String serialNumber, String manufacturer, String color) {
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getColor() {
        return color;
    }

    public void displayInfo() {
        // This method is overridden by subclasses
    }
}




public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Component> components = new ArrayList<>();

        System.out.println("Welcome to Great International Technology");
        while (true) {
            System.out.println("MENU: add (B)ox, add (S)creen, add (A)ccessories, (D)elete, (L)ist, (Q)uit");
            String choice = scanner.next().toUpperCase();

            switch (choice) {
                case "B":
                    addBox(scanner, components);
                    break;
                case "S":
                    addScreen(scanner, components);
                    break;
                case "A":
                    addAccessory(scanner, components);
                    break;
                case "D":
                    deleteComponent(scanner, components);
                    break;
                case "L":
                    listComponents(components);
                    break;
                case "Q":
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addBox(Scanner scanner, ArrayList<Component> components) {
        System.out.println("Enter the serial number");
        String serialNumber = scanner.next();
        System.out.println("Enter the manufacturer");
        String manufacturer = scanner.next();
        System.out.println("Enter the colour");
        String color = scanner.next();
        System.out.println("Enter the amount of memory (MB)");
        int memory = scanner.nextInt();

        components.add(new Box(serialNumber, manufacturer, color, memory));
        System.out.println("Done");
    }

    private static void addScreen(Scanner scanner, ArrayList<Component> components) {
        System.out.println("Enter the serial number");
        String serialNumber = scanner.next();
        System.out.println("Enter the manufacturer");
        String manufacturer = scanner.next();
        System.out.println("Enter the colour");
        String color = scanner.next();
        System.out.println("Enter the screen size in inches");
        int sizeInInches = scanner.nextInt();

        components.add(new Screen(serialNumber, manufacturer, color, sizeInInches));
        System.out.println("Done");
    }

    private static void addAccessory(Scanner scanner, ArrayList<Component> components) {
        System.out.println("Enter the serial number");
        String serialNumber = scanner.next();
        System.out.println("Enter the manufacturer");
        String manufacturer = scanner.next();
        System.out.println("Enter the colour");
        String color = scanner.next();

        components.add(new Accessory(serialNumber, manufacturer, color));
        System.out.println("Done");
    }

    private static void deleteComponent(Scanner scanner, ArrayList<Component> components) {
        System.out.println("Enter the serial number");
        String serialNumberToDelete = scanner.next();
        boolean found = false;

        for (int i = 0; i < components.size(); i++) {
            Component component = components.get(i);
            if (component.getSerialNumber().equals(serialNumberToDelete)) {
                components.remove(i);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Done");
        } else {
            System.out.println("Not found");
        }
    }

    private static void listComponents(ArrayList<Component> components) {
        for (Component component : components) {
            component.displayInfo();
        }
        System.out.println("Done");
    }
}
