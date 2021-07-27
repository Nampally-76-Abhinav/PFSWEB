
public class PhoneNumber {
    public String label;
    public String phonenumber;
    public PhoneNumber(String label, String phonenumber){
        this.label = label;
        this.phonenumber = phonenumber;
    }
    public String getPhonenumber(){
        return phonenumber;
    }
    public String getLabel(){
        return label;
    }
    public void setLabel(String label){
        this.label = label;
    }
    public void setPhonenumber(String phonenumber){
        this.phonenumber = phonenumber;
    }
}
