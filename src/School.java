import java.util.ArrayList;

public class School {

    private ArrayList<Student> students = new ArrayList<>();
    private ArrayList<Mentor> mentors = new ArrayList<>();
    private static ArrayList<Module> modules= new ArrayList<>();

    public School(){}

    public School(ArrayList<Student> students, ArrayList<Mentor> mentors, ArrayList<Module> modules) {
        this.students = students;
        this.mentors = mentors;
        School.modules = modules;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(ArrayList<Mentor> mentors) {
        this.mentors = mentors;
    }

    public static ArrayList<Module> getModules() {
        return modules;
    }

    public void setModules(ArrayList<Module> modules) {
        this.modules = modules;
    }

    public void hireMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public void acceptStudent(Student student){
        students.add(student);
    }

    public void assignMentorToModule(Mentor mentor, Module module){
        module.getMentors().add(mentor);
    }
}
