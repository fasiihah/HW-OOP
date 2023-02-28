
//inheritance - parent class is Student, child class is Tutor
public class Student extends Detail{
    private int year;
    private String schoolName;
    private int scores;
    private Tutor assignedTutor;

    public Student(String name, String ic, String address, int year,
                   String schoolName, int scores, Tutor assignedTutor){
        super(name, ic, address);
        this.year = year;
        this.schoolName = schoolName;
        this.scores = scores;
        this.assignedTutor = assignedTutor;
    }

    public int getYear() {
        return year;
    }
    public String getSchoolName() {
        return schoolName;
    }
    public int getScores() {
        return scores;
    }
    public Tutor getAssignedTutor() {
        return assignedTutor;
    }
}
