package entities;

import enums.Category;

public abstract class Product {
  private String name;
  private Integer quantity;
  private Double price;
  private Category category;
  private Boolean hasPromotion;
  private Double discount;
}
