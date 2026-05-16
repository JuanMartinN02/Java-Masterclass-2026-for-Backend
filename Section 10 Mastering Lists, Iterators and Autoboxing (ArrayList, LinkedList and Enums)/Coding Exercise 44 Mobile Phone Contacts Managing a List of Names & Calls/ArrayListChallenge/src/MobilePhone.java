import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> myContacts  = new ArrayList<>();
    private String myNumber;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    public boolean addNewContact(Contact contact){
        if (myContacts.contains(contact)){
            System.out.println("Contact already on the phone!");
            return false;
        }
        myContacts.add(contact);
        System.out.println("Contact added!");
        return true;
    }

    public boolean updateContact(Contact contactOld, Contact contactNew){
        if (!myContacts.contains(contactOld)){
            System.out.println("Contact doesn't exist!");
            return false;
        }
        myContacts.remove(contactOld);
        myContacts.add(contactNew);
        System.out.println("Contact updated successfully!");
        return true;
    }

    public boolean removeContact(Contact contact){
        if (!myContacts.contains(contact)){
            System.out.println("Contact doesn't exist!");
            return false;
        }
        myContacts.remove(contact);
        System.out.println("Contact removed successfully!");
        return true;
    }

    public int findContact(Contact contact){
        if (!myContacts.contains(contact)){
            System.out.println("Contact doesn't exist!");
            return -1;
        }

        return myContacts.indexOf(contact);
    }

    public int findContact(String name){
        for(int i = 0; i < myContacts.size(); i++){
            if (myContacts.get(i).name().equals(name)){
                System.out.println(myContacts.get(i).toString());
                return i;
            }
        }

        return -1;
    }

    public void printContacts(){
        for (Contact myContact : myContacts) {
            System.out.println(myContact.name() + " --> " + myContact.number());
        }
    }

    public ArrayList<Contact> getMyContacts() {
        return myContacts;
    }

    public String getMyNumber() {
        return myNumber;
    }
}
