package entities;

import enums.Category;

public class Product {
  private String name;
  private Integer quantity;
  private Double price;
  private Category category;
  private Boolean hasPromotion;
  private Double discount;

  public Product(String name, Integer quantity, Double price, Category category, Boolean hasPromotion, Double discount) {
    this.name = name;
    this.quantity = quantity;
    this.price = price;
    this.category = category;
    this.hasPromotion = hasPromotion;
    this.discount = discount;
    
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }

  public Boolean getHasPromotion() {
    return hasPromotion;
  }

  public void setHasPromotion(Boolean hasPromotion) {
    this.hasPromotion = hasPromotion;
  }

  public Double getDiscount() {
    return discount;
  }

  public void setDiscount(Double discount) {
    this.discount = discount;
  }

  public String toString() {
    return "Name: " + this.getName() + "\n" +
           "Quantity: " + this.getQuantity() + "\n" +
           "Price: " + this.getPrice() + "\n" +
           "Category: " + this.getCategory() + "\n" +
           "Has promotion: " + this.getHasPromotion() + "\n" +
           "Discount: " + this.getDiscount() + "\n";
  }
}
