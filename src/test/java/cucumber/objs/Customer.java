package cucumber.objs;

public class Customer {

    public Customer(String usrname, String paasword) {
        this.usrname = usrname;
        this.paasword = paasword;
    }

    public String getUsrname() {
        return usrname;
    }

    public void setUsrname(String usrname) {
        this.usrname = usrname;
    }

    public String getPaasword() {
        return paasword;
    }

    public void setPaasword(String paasword) {
        this.paasword = paasword;
    }

    private String usrname;
    private String paasword;
}
