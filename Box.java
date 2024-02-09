// Box class, a subclass of Component
class Box extends Component {
    private int memory;

    Box(String serialNumber, String manufacturer, String color, int memory) {
        super(serialNumber, manufacturer, color);
        this.memory = memory;
    }

    public int getMemory() {
        return memory;
    }

    @Override
    public void displayInfo() {
        System.out.println("Box: " + serialNumber + ", " + manufacturer + ", " + color + ", " + memory);
    }
}
