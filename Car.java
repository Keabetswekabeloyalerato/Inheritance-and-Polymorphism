class Car extends Vehicle {
    protected int capacity; // Change the access modifier to protected
    protected double weight; // Change the access modifier to protected

    public Car(int numCylinders, String maker, Student owner, int passengers, double carWeight) {
        super(numCylinders, maker, owner);
        this.capacity = passengers;
        this.weight = carWeight;
    }

    public Car(Car c) {
        super(c);
        this.capacity = c.capacity;
        this.weight = c.weight;
    }

    @Override
    public String toString() {
        return super.toString() +
               "\nSeating Capacity: " + capacity +
               "\nWeight: " + weight;
    }
}
