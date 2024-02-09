// Accessory class, a subclass of Component
class Accessory extends Component {
    Accessory(String serialNumber, String manufacturer, String color) {
        super(serialNumber, manufacturer, color);
    }

    @Override
    public void displayInfo() {
        System.out.println("Accessories: " + serialNumber + ", " + manufacturer + ", " + color);
    }
}
