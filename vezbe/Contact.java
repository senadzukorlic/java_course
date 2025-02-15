import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Contact {
    private String name;
    private String phoneNumber;
    private String birthDate;
    private int age;

    public Contact(String name, String phoneNumber, String birthDate){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.birthDate = birthDate;
        this.age = toAge(birthDate);
    }

    public Contact(Contact source){
        this.name = source.name;
        this.phoneNumber = source.phoneNumber;
        this.birthDate = source.birthDate;
    this.age = source.toAge(source.birthDate);
    }

    public int toAge(String BirthDate){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate datumRodjenja = LocalDate.parse(BirthDate, formatter);
        LocalDate danas = LocalDate.now();
        Period period = Period.between(datumRodjenja, danas);
        return period.getYears();
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getBirthDate() {
        return birthDate;
    }
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printContact (){
        System.out.println("Name: " + this.name + "\nPhone number: " + this.phoneNumber + "\nBirth date: " + this.birthDate + "\nAge: " + this.age);
        System.out.print("\n");
    }
}
