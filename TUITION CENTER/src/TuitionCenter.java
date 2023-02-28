import java.util.ArrayList;
public class TuitionCenter {
    private String address;
    private String headMaster;
    private Tutor[] tutors;
    private Student[] students;

    public TuitionCenter(String address, String headMaster,
                         Tutor[] tutors, Student[] students) {
        this.address = address;
        this.headMaster = headMaster;
        this.tutors = tutors;
        this.students = students;
    }

    //to add new student to the student list
    public void addStudent(Student student){
        Student[] newStudents = new Student[students.length +1];

        for (int i=0; i< students.length; i++){
            newStudents[i] = students[i];
        }
        newStudents[newStudents.length-1] = student;
        students = newStudents;
    }
    //to add new tutor to the tutor list
    public void addTutor(Tutor tutor){
        Tutor[] newTutors = new Tutor[tutors.length +1];

        for (int i=0; i<tutors.length; i++){
            newTutors[i] = tutors[i];
        }
        newTutors[newTutors.length - 1] = tutor;
        tutors = newTutors;
    }

    //calculate average
    public double getAvg(){
        double totalScore = 0;
        for (Student student: students){
            totalScore += student.getScores();
        }
        return totalScore / students.length;
    }
    //calculate minimum
    public int getMin(){
        int minScore = Integer.MAX_VALUE;
        for (Student student : students){
            if (student.getScores()<minScore){
                minScore = student.getScores();
            }
        }
        return minScore;
    }
    //calculate maximum
    public int getMax(){
        int maxScore = Integer.MIN_VALUE;
        for (Student student : students){
            if (student.getScores()>maxScore){
                maxScore = student.getScores();
            }
        }
        return maxScore;
    }
    //function to generate report consist of total students, total tutors, average score, minimum score
    //maximum score, tutor background
    public void generateReport(){
        System.out.println("TUITION CENTER PERFORMANCE REPORT:");
        System.out.println("__________________________________");
        System.out.println("Number of Students: "+ students.length);
        System.out.println("Number of Tutors: "+ tutors.length);
        System.out.println("Average Score: "+ getAvg());
        System.out.println("Minimum Score: "+ getMin());
        System.out.println("Maximum Score: "+ getMax());
        System.out.println();
        System.out.println("TUTORS BACKGROUND:");
        System.out.println("_________________________________");
        for (Tutor tutor: tutors){
            System.out.println("Name: "+ tutor.getName());
            System.out.println("IC: "+ tutor.getIc());
            System.out.println("Address: "+ tutor.getAddress());
            System.out.println("Qualification: "+ tutor.getQualification());
            System.out.println("Year of Experience: "+ tutor.getYearExperience());
            //System.out.println("Date Joined: "+ tutor.getDateJoined());
            System.out.println("Year In The Tuition Center: "+ tutor.getYearInTheCenter());

        }
    }
}
