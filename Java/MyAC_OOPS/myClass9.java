package Java.MyAC_OOPS;

class Account {
    public String name; // if we remove the public from here then only name will be available to the bank package, if we try to access from the different class then we won't be able to access
    protected String email;
    private String password; // it will only be accessible 'Account' class, not even the 'Bank' class can access

    // getters and setters
    public void setPassword(String pass) {
        this.password = pass;
    }
    public String getPassword() {
        return this.password;
    }
}
public class myClass9 {
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.name = "Bet";
        a1.email = "xyz@gmail.com";
        a1.setPassword("abcd");
        System.out.println(a1.getPassword());

        // Access Modifier - 4 Types in Java
        // 1. Public - It is available for all class and packages, means if anyone import our package then all the public class can be accessible to him
        // 2. Default - It is default means all the class, variable is accessible within the class, but not the outside of the class, check line no. 4
        // 3. Protected - It can be used from within the package but to different package, only subclass can access
        // 4. Private - Only within a class can be access but after the class no one can access directly
        // that is why we have getters and setters for private class

    }
}