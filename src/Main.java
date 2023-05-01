public class Main {
    public static void main(String[] args) {
        //create students
        Student studentFirst = new Student("Peter", "Polishchuk");
        Student studentSecond = new Student("Alex", "Opanasenko");
        Student studentThird = new Student("Olena", "Kravchenko");
        Student studentFourth = new Student("Viktoria", "Sapova");
        Student studentFifth = new Student("Mike", "Barasovchuk");

        //add the leader of the group
        Group group = new Group(studentFirst);
        //add other students to the group
        group.addStudent(studentFirst);
        group.addStudent(studentSecond);
        group.addStudent(studentThird);
        group.addStudent(studentFourth);
        group.addStudent(studentFifth);

        //add task to the group
        group.addTask("Learn the Java");
        group.addTask("Change the leader");
        group.addTask("Do the homework");
        group.addTask("Show the result of the homework");

        //try to remove leader
        group.deleteStudent(studentFirst);

        //change the leader
        group.changeLeader(studentThird);

        //rename student
        group.renameStudent(studentSecond, new Student("Viktor", "Zabarniy"));

        //delete student
        group.deleteStudent(studentFifth);

        //check the result
        System.out.println(group.getLeader());
        System.out.println(group.getStudents());
        System.out.println(group.getTasks());
    }

}
