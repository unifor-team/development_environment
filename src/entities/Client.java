package entities;

public class Client extends User {
    private Integer cpf;
    private String contactNumber;
    private String location;
    private String balance;

    public Client(String name, Integer age, String address, Boolean isActive, Integer cpf,
            String contactNumber, String location, String balance) {
        super(name, age, address, isActive);
        this.cpf = cpf;
        this.contactNumber = contactNumber;
        this.location = location;
        this.balance = balance;
    }

    public Integer getCpf() {
        return cpf;
    }

    public void setCpf(Integer cpf) {
        this.cpf = cpf;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

}
