import java.math.BigInteger;
import java.util.Date;

public class Student extends Person {

    int moduleNumber = 0;
    private Module currentModule;
    private int progression;

    public Student(String name, String birthDate, long phoneNumber) {
        super(name, birthDate, phoneNumber);
    }

    public Module getCurrentModule() {
        return currentModule;
    }

    public void setCurrentModule(Module currentModule) {
        this.currentModule = currentModule;
    }

    public int getProgression() {
        return progression;
    }

    public void setProgression(int progression) {
        this.progression = progression;
        checkProgression();
    }

    public void checkProgression(){
        if (progression == 100){
            nextModule();
        }
    }

    public void nextModule(){

        if (currentModule instanceof ProgrammingBasics){
            moduleNumber = 0;
        } else if (currentModule instanceof Web){
            moduleNumber = 1;
        } else if (currentModule instanceof Oop){
            moduleNumber = 2;
        } else if (currentModule instanceof  Advanced){
            moduleNumber = 3;
        }

        moduleNumber++;
        this.currentModule = School.getModules().get(moduleNumber);
        progression = 0;

    }
}
