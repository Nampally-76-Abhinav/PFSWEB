
public class Address {
    public String label;
    public String address;
    public Address(String label, String address){
        this.label = label;
        this.address = address;
    }
    public String getaddress(){
        return address;
    }
    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public void setaddress(String address){
        this.address = address;
    }
}
