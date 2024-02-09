// Screen class, a subclass of Component
class Screen extends Component {
    private int sizeInInches;

    Screen(String serialNumber, String manufacturer, String color, int sizeInInches) {
        super(serialNumber, manufacturer, color);
        this.sizeInInches = sizeInInches;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    @Override
    public void displayInfo() {
        System.out.println("Screen: " + serialNumber  + ", " + color + ", " + manufacturer + ", " + sizeInInches);
    }
}
