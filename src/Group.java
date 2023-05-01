import java.util.ArrayList;
import java.util.List;

public class Group {
    private Student leader;
    private List<Student> students = new ArrayList<>();
    private List<String> tasks = new ArrayList<>();

    public Group(Student leader) {
        this.leader = leader;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTask(String task) {
        tasks.add(task);
    }

    public Student getLeader() {
        return leader;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getTasks() {
        return tasks;
    }

    public void changeLeader (Student newLeader){
        this.leader = newLeader;
    }

    public void renameStudent(Student oldName, Student newName){
        int i = 0;
        for (Student student : students){
            if (student == oldName){
                students.set(i, newName);
            }
            i++;
        }
    }

    public void deleteStudent(Student name){
        int j = 0;
        for (Student student : students){
            if (student == name && name == this.leader){
                System.out.println("You can't remove the leader of the group");
                System.out.println("Please change the leader first");
            } else if (student == name && name != this.leader) {
                this.students.remove(j);
                break;
            }
            j++;
        }
    }

}
