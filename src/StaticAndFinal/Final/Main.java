package StaticAndFinal.Final;

public class Main {
    public static void main(String[] args) {

        Employee john = new Employee("John", 45);
        Employee lisa = new Employee("Lisa", 20);

        System.out.println("Retirement Age: " + Employee.maxAge);
        System.out.println("Minimum Working Age: " + Employee.minAge);

        System.out.println(john.getName() + ", you can retire in " + (Employee.maxAge - john.getAge()) + " years.");
        System.out.println(lisa.getName() + ", you have been eligible to work for " + (lisa.getAge() - Employee.minAge) + " years.");

    }
}
