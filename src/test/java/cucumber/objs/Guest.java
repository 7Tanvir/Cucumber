package cucumber.objs;

public class Guest {

    private String Fname;
    private String Lname;
    private String Country;
    private String Address;
    private String City;
    private String State;
    private String Zip;
    private String Email;

    public Guest(String fname, String lname, String country, String address, String city, String state, String zip, String email) {
        this.Fname = fname;
        this.Lname = lname;
        this.Country = country;
        this.Address = address;
        this.City = city;
        this.State = state;
        this.Zip = zip;
        this.Email = email;
    }

    public void setFname(String fname) {
        this.Fname = fname;
    }

    public void setLname(String lname) {
        this.Lname = lname;
    }

    public void setCountry(String country) {
        this.Country = country;
    }

    public void setAddress(String address) {
        this.Address = address;
    }

    public void setCity(String city) {
        this.City = city;
    }

    public void setState(String state) {
        this.State = state;
    }

    public void setZip(String zip) {
        this.Zip = zip;
    }

    public void setEmail(String email) {
        this.Email = email;
    }

    public String getFname() {
        return Fname;
    }

    public String getLname() {
        return Lname;
    }

    public String getCountry() {
        return Country;
    }

    public String getAddress() {
        return Address;
    }

    public String getCity() {
        return City;
    }

    public String getState() {
        return State;
    }

    public String getZip() {
        return Zip;
    }

    public String getEmail() {
        return Email;
    }
}
