package eduard.moisa.lists.arraylist.challenge;

public class Contact {
    private String phoneNumber;
    private String name;

    public Contact(String name, String phoneNumber) {
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }
}
