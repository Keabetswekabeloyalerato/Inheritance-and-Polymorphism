class Vehicle {
    private int cylinders;
    private String manufacturer;
    protected Student owner; // Change the access modifier to protected

    public Vehicle(int cylinders, String maker, Student owner) {
        this.cylinders = cylinders;
        this.manufacturer = maker;
        this.owner = owner;
    }

    public Vehicle(Vehicle v) {
        this.cylinders = v.cylinders;
        this.manufacturer = v.manufacturer;
        this.owner = v.owner;
    }

    public String toString() {
        return manufacturer+", "+cylinders+" cylinders, owned by"+ owner;
            }
}

