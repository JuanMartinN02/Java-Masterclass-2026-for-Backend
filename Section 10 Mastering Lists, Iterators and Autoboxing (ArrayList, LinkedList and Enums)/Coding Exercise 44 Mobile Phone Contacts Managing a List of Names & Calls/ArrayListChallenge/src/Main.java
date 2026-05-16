import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contact juan = new Contact("04124432543", "Juan");
        Contact jose = new Contact("04244423443", "Jose");
        Contact gian = new Contact("04124396004", "Gian");
        Contact jesus = new Contact("0412443920", "Jesus");
        Contact irwin = new Contact("0414556254", "Irwin");
        Contact gian2 = new Contact("0412434444", "Gian2");

        ArrayList<Contact> contactsJuan = new ArrayList<>(List.of(juan, jose, gian, jesus, irwin));

        MobilePhone myPhone = new MobilePhone("04242265440");

        for (Contact myContact : contactsJuan)  myPhone.addNewContact(myContact);

        myPhone.printContacts();

        myPhone.findContact("Gian");

        myPhone.findContact(jesus);

        myPhone.removeContact(juan);

        myPhone.updateContact(gian, gian2);

        myPhone.printContacts();
    }


}