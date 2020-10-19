import java.util.ArrayList;

public class Mentor extends Employee {

    private ArrayList<ProgrammingLanguages> knownLanguages;
    private Module currentModule;

    public Mentor(int salary, ArrayList<ProgrammingLanguages> knownLanguages, Module currentModule) {
        super(salary);
        this.knownLanguages = knownLanguages;
        this.currentModule = currentModule;
    }

    public ArrayList<ProgrammingLanguages> getKnownLanguages() {
        return knownLanguages;
    }

    public void setKnownLanguages(ArrayList<ProgrammingLanguages> knownLanguages) {
        this.knownLanguages = knownLanguages;
    }

    public Module getCurrentModule() {
        return currentModule;
    }

    public void setCurrentModule(Module currentModule) {
        this.currentModule = currentModule;
    }
}
