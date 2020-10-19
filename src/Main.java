import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws ParseException {

        School school = new School();

        Module ProgBasics = new ProgrammingBasics(0, new ArrayList<>(Collections.singletonList(ProgrammingLanguages.PYTHON)));
        Module OOP = new Oop(0, new ArrayList<>(Arrays.asList(ProgrammingLanguages.JAVA_EE, ProgrammingLanguages.JAVA_SE)));
        Module WEB = new Web(0, new ArrayList<>(Collections.singletonList(ProgrammingLanguages.WEB)));
        Module Advanced = new Advanced(0, new ArrayList<>(Collections.singletonList(ProgrammingLanguages.WEB)));

        school.setModules(new ArrayList<>(Arrays.asList(ProgBasics,WEB,OOP,Advanced)));

        Student florin = new Student("Florin Danciu", "1990-10-03",3213123);
        Student gabi = new Student("Vasile Gabriel", "1980-07-09",12556541);
        Student test = new Student("Test Student", "1960-10-10",357172);

        florin.setCurrentModule(OOP);
        gabi.setCurrentModule(OOP);
        test.setCurrentModule(ProgBasics);

        school.acceptStudent(florin);
        school.acceptStudent(gabi);
        school.acceptStudent(test);

        Mentor alex = new Mentor(5000, new ArrayList<>(Arrays.asList(ProgrammingLanguages.PYTHON)), ProgBasics);
        Mentor iulia = new Mentor(5000, new ArrayList<>(Arrays.asList(ProgrammingLanguages.PYTHON)), OOP);
        Mentor adam = new Mentor(5000, new ArrayList<>(Arrays.asList(ProgrammingLanguages.PYTHON)), WEB);

        alex.setCurrentModule(WEB);
        school.assignMentorToModule(alex, WEB);
        iulia.setCurrentModule(OOP);
        adam.setCurrentModule(OOP);

        school.hireMentor(adam);
        school.hireMentor(alex);
        school.hireMentor(iulia);

        school.assignMentorToModule(iulia,WEB);

        System.out.println("Mentors in WEB module " + WEB.getMentors());

        System.out.println(school.getStudents());
        System.out.println(School.getModules());

        florin.setProgression(100);
        gabi.setProgression(100);
        test.setProgression(100);

        System.out.println(florin.getCurrentModule());
        System.out.println(gabi.getCurrentModule());
        System.out.println(test.getCurrentModule());


    }
}
