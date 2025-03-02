package MapCollections.HashMapEquality;

import java.util.Objects;

public class Contact {

    private String name;
    private int age;

    public Contact(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Contact(Contact source) {
        this.name = source.name;
        this.age = source.age;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return age == contact.age && Objects.equals(name, contact.name);
    }

}
