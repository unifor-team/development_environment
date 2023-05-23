package entities;

public abstract class User {
    private String name;
    private Integer age;
    private String address;
    private Boolean isActive;
    
    public User(String name, Integer age, String address, Boolean isActive) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.isActive = isActive;
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

    public Boolean isActive() {
        return isActive;
    }

    public void isActive(Boolean isActive) {
        this.isActive = isActive;
    }


}
