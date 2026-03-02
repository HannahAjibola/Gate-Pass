package data.models;
public class Resident {
    private String name;
    private String id;
    private String phoneNumber;
    private String residentAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getHouseAddress() {
        return residentAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.residentAddress = houseAddress;
    }
}