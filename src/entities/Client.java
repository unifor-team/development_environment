package entities;

public abstract class Client {
    private String name;
    private Integer age;
    private String address;
    private Boolean fidelity;
    
    public Client(String name, Integer age, String address, Boolean fidelity) {
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean isFidelity() {
        return fidelity;
    }

    public void setFidelity(Boolean fidelity) {
        this.fidelity = fidelity;
    }


}
