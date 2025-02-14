public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate, int age){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = age;
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
        this.age = source.age;
    }


    public void printContact (){
        System.out.println("Name: " + this.name + "\nPhone number: " + this.phoneNumber + "\nBirth date: " + this.birthDate + "\nAge: " + this.age);
        System.out.print("\n");
    }
}
