class Student extends Person {
    // Fields
    private int yearOfStudy;
    private String hobbies;
    private String nameOfInstitution;
    private String programOfStudy;

    // Constructors
       public Student(String name, int age, String gender, String nameOfInstitution,
                   String programOfStudy, int yearOfStudy, String hobbies) {
        super(name, age, gender);
        this.nameOfInstitution = nameOfInstitution;
        this.programOfStudy = programOfStudy;
        this.yearOfStudy = yearOfStudy;
        this.hobbies = hobbies;
    }

    public Student(Student other) {
        super(other);
        this.nameOfInstitution = other.nameOfInstitution;
        this.programOfStudy = other.programOfStudy;
        this.yearOfStudy = other.yearOfStudy;
        this.hobbies = other.hobbies;
    }

    // Methods
    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public String getHobbies() {
        return hobbies;
    }

    public String getNameOfInstitution() {
        return nameOfInstitution;
    }

    public String getProgramOfStudy() {
        return programOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public void setNameOfInstitution(String nameOfInstitution) {
        this.nameOfInstitution = nameOfInstitution;
    }

    public void setProgramOfStudy(String programOfStudy) {
        this.programOfStudy = programOfStudy;
    }
}
