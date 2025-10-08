package S12_bank_account;

public class Customer {
    private String name;
    private String gender;
    private int age;
    private String email;
    private static int lastCustomerId = 0;
    private int customerId;

    public Customer(String name, String gender, int age, String email) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.email = email;
        this.customerId = ++lastCustomerId;
    }

    public String getName() {
        return name;
    }

    public int getCustomerId() {
        return customerId;
    }
    
}
