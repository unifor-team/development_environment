package entities;

public abstract class Client {
    private String name;
    private int age;
    private String address;
    private boolean fidelity;
    
    public Client(String name, int age, String address, boolean fidelity) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.fidelity = fidelity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isFidelity() {
        return fidelity;
    }

    public void setFidelity(boolean fidelity) {
        this.fidelity = fidelity;
    }


}
