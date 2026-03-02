package data.models;

public class Visitor {
    private int id;
    private String name;
    private String phoneNumber;
    private String purposeOfVisiting;

    public String getPurposeOfComing() {
        return purposeOfVisiting;
    }

    public void setPurposeOfComing(String purposeOfComing) {
        this.purposeOfVisiting = purposeOfComing;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}