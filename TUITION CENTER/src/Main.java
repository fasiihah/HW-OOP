public class Main {
    public static void main(String[] args) {
        Tutor[] t = new Tutor[2];
        t[0] = new Tutor("John", "12345678", "Seri Kembangan","Lawyer",3,1);
        t[1] = new Tutor("Mary", "87654321", "Ipoh","Chef",2,1);

        Student[] s = new Student[4];
        s[0] = new Student("Tom", "98765432", "Kuala Lumpur",12,"SMK Anderson",90, t[0]);
        s[1] = new Student("Jane", "23456789", "Gombak",12,"SBP Gombak",85, t[0]);
        s[2] = new Student("Mike", "34567890", "Tambun",11,"MRSM Kluang", 58, t[1]);
        s[3] = new Student("Sue", "45678901", "St Johnson",10,"SMKA Ulul Albab", 76, t[1]);

        // create a tuition center and add tutors and students
        TuitionCenter tuitionCenter = new TuitionCenter("Melaka","Tan Siew Lee",t,s);
        tuitionCenter.addTutor(t[0]);
        tuitionCenter.addTutor(t[1]);
        tuitionCenter.addStudent(s[0]);
        tuitionCenter.addStudent(s[1]);
        tuitionCenter.addStudent(s[2]);
        tuitionCenter.addStudent(s[3]);

        // generate and print the report
        tuitionCenter.generateReport();
    }
}