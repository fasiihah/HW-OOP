import java.util.Date;

//inheritance - parent class is Detail, child class is Tutor
public class Tutor extends Detail{
    private String qualification;
    private int yearExperience;
    //private Date dateJoined;
    private int yearInTheCenter;

    public Tutor(String name, String ic, String address, String qualification,
                 int yearExperience, int yearInTheCenter){
        super(name, ic, address);
        this.qualification = qualification;
        this.yearExperience = yearExperience;
        //this.dateJoined = dateJoined;
        this.yearInTheCenter = yearInTheCenter;
    }

    public String getQualification() {
        return qualification;
    }
    public int getYearExperience() {
        return yearExperience;
    }
    /*public Date getDateJoined() {
        return dateJoined;
    }*/
    public int getYearInTheCenter() {
        return yearInTheCenter;
    }
}
