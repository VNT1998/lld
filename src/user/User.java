package user;

public class User {
    public int age;
    private String username;
    String password;
    protected int passwordLength;
    protected User(){}

    void print(){
        System.out.println(age);
    }
    void print(String username){
        this.username = username;
        System.out.println(this.username);
    }
}
