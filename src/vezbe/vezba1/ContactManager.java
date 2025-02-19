public class ContactManager {
    private Contact[] contacts;

    public ContactManager(Contact[]contacts) {
        this.contacts  = new Contact[contacts.length];

        for (int i = 0; i < contacts.length; i++) {
            this.contacts[i] = new Contact(contacts[i]);
        }
    }

    public Contact getContact(int index){
        return contacts[index];
    }

    //Kreirajte metodu setContact koja uzima kontakt objekt i indeks i postavlja kontakt objekt na navedeni indeks u duboku kopiju određenog objekta.

    public void setContact(Contact contact,int index){
       contacts[index] = new Contact(contact);

    }
}
