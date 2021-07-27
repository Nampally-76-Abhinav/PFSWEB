
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.app.contacts.AddressBook.searchByName;
import static com.app.contacts.AddressBook.searchByOrganization;

public class Main {


    public static void addcontact(){

        List<PhoneNumber> ph = new ArrayList<>();
        ph.add(new PhoneNumber("hello", "987654321"));
        List<Address> ad = new ArrayList<>();
        ad.add(new Address("hello", "78-512asd"));
        Contact contact = new Contact("first", "xyz", ph, ad);
        AddressBook.addContact(contact);

    }

    public static void updatecontact(){

        List<PhoneNumber> ph = new ArrayList<>();
        ph.add(new PhoneNumber("hello", "987654321"));
        List<Address> ad = new ArrayList<>();
        ad.add(new Address("hello", "78-512asd"));
        Contact contact = new Contact("first", "xyz", ph, ad);
        AddressBook.updateContact("first", contact);
    }

    public static void main(String[] a) {
        List<PhoneNumber> phoneNumbers = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        boolean ch = true;
        while (ch) {

            System.out.println("1: Add Contact\n2: searchByName\n 3: searchByOrg\n 4: UpdateContact\n 5: exit");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            switch (num) {
                case 1:
                    addcontact(); break;
                case 2:
                    System.out.println(searchByName("first"));
                    break;
                case 3:
                    System.out.println(searchByOrganization("xyz"));
                    break;
                case 4:
                    updatecontact();
                    break;
                case 5:
                    ch = false;
                    break;
            }

        }
    }


}
