package ExceptionHandling.ArgumentValidation;

public class User {

    private String username;
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if( age<0){
            throw new IllegalArgumentException("Age can't be negative");
        }
        this.age = age;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        if(username == null || username.isEmpty()){
            throw new IllegalArgumentException("Username can't be null or empty");
        }
        this.username = username;
    }


}

