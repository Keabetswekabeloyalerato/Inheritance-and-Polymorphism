class Person {
    // Fields
    private int age;
    private String gender;
    private String name;

    // Constructors
       public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
        this.gender = other.gender;
    }

    // Methods
    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }
}
