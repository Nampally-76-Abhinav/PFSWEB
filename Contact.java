
import java.util.List;

public class Contact {
    String name;
    String organization;
    public static List<PhoneNumber> phoneNumbers;
    public static List<Address> addresses;

    public Contact(String name, String organization, List<PhoneNumber> phoneNumbers, List<Address> addresses){
        this.name = name;
        this.organization = organization;
        this.phoneNumbers = phoneNumbers;
        this.addresses = addresses;
    }
    public void setAddresses(List<Address> addresses){
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public String getOrganization() {
        return organization;
    }

    public List<PhoneNumber> getPhoneNumbers() {
        return phoneNumbers;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void addPhoneNumber(PhoneNumber phoneNumber){

        phoneNumbers.add(phoneNumber);


    }
    public void addAddress(Address address){

        addresses.add(address);

    }
}
