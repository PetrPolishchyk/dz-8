public class Student {
    private String name;
    private String surname;
    private static int currentMaxId = 0;
    private int id;

    public Student(String name, String surname){
        this.name = name;
        this.surname = surname;
        currentMaxId++;
        this.id = currentMaxId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

}
