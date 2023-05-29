package entities;

public class Client extends User {
    private String cpf;
    private String contactNumber;
    private String location;
    private Double balance;

    public Client(
        String name,
        Integer age,
        String address,
        Boolean isActive,
        String cpf,
        String contactNumber,
        String location,
        Double balance) {
        super(name, age, address, isActive);
        this.cpf = cpf;
        this.contactNumber = contactNumber;
        this.location = location;
        this.balance = balance;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
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

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String toString() {
        return String.format(
            "Nome: %s\nIdade: %d\nEndereço: %s\nCPF: %s\nNúmero de contato: %s\nLocalização: %s\nSaldo: %.2f\n",
            this.getName(),
            this.getAge(),
            this.getAddress(),
            this.getCpf(),
            this.getContactNumber(),
            this.getLocation(),
            this.getBalance());
    }
    
}
