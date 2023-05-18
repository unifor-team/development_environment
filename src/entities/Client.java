package entities;

public class Client extends User {
    private Integer cnpj;
    private String services;
    private String nameCompany;
    private String buy;



public Client (String name, Integer age, String address, Boolean fidelity, Double quantityMoney, Integer cnpj, String services, String nameCompany, String buy){
     super(name, age, address, fidelity);
     this.cnpj = cnpj;
     this.services = services;
     this.nameCompany = nameCompany;
     this.buy = buy;
    }



public Integer getCnpj() {
    return cnpj;
}



public void setCnpj(Integer cnpj) {
    this.cnpj = cnpj;
}



public String getServices() {
    return services;
}



public void setServices(String services) {
    this.services = services;
}



public String getNameCompany() {
    return nameCompany;
}



public void setNameCompany(String nameCompany) {
    this.nameCompany = nameCompany;
}



public String getBuy() {
    return buy;
}



public void setBuy(String buy) {
    this.buy = buy;
}





}
