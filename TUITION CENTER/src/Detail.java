public class Detail {
    //abstract class to represent a person as details
    private String name;
    private String ic;
    private String address;

    public Detail(String name, String ic, String address) {
        this.name = name;
        this.ic = ic;
        this.address = address;
    }

    public String getName() {
        return name;
    }
    public String getIc() {
        return ic;
    }
    public String getAddress() {
        return address;
    }
}
