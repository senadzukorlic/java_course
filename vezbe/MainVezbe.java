public class MainVezbe {
    public static void main(String[] args){
        Contact contact1 = new Contact("Alice", "123-456-7890", "1990-01-01", 33);
        Contact contact2 = new Contact("Bob", "234-567-8901", "1992-02-02", 31);

        contact2.printContact();


        Contact user19 = new Contact(contact1);

        user19.printContact();
    }
}
