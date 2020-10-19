import java.util.ArrayList;

public abstract class Module {

    private int requiredProgression;
    private ArrayList<ProgrammingLanguages> progLanguages = new ArrayList<>();
    private ArrayList<Mentor> mentors = new ArrayList<>();

    public Module(int requiredProgression, ArrayList<ProgrammingLanguages> progLanguages) {
        this.requiredProgression = requiredProgression;
        this.progLanguages = progLanguages;
    }

    public int getRequiredProgression() {
        return requiredProgression;
    }

    public void setRequiredProgression(int requiredProgression) {
        this.requiredProgression = requiredProgression;
    }

    public ArrayList<ProgrammingLanguages> getProgLanguages() {
        return progLanguages;
    }

    public void setProgLanguages(ArrayList<ProgrammingLanguages> progLanguages) {
        this.progLanguages = progLanguages;
    }

    public ArrayList<Mentor> getMentors() {
        return mentors;
    }

    public void setMentors(ArrayList<Mentor> mentors) {
        this.mentors = mentors;
    }
}
