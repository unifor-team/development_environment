package entities;

public class Repository extends User {
  private String cnpj;

  public Repository(
      String name,
      Integer age,
      String address,
      Boolean fidelity,
      String cnpj) {
    super(name, age, address, fidelity);
    this.cnpj = cnpj;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public void addProductQuantity(Product product, Integer quantity) {
    Integer previousQuantity = product.getQuantity();
    product.setQuantity(previousQuantity + quantity);
  }

  public void changeProductValue(Product product, Double newPrice) {
    product.setPrice(newPrice);
  }
  
  public void changeProductPromotion(Product product, Boolean hasPromotion) {
    product.setHasPromotion(hasPromotion);
  }
}