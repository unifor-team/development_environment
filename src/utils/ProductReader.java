package utils;
import entities.Product;
import enums.Category;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;

public class ProductReader {
    public ProductReader (ArrayList<Product> productsPromotion,ArrayList<Product> productsNoPromotion) throws Exception{
        File F = new File("product_db.txt");
        Scanner sc = new Scanner(F);
        sc.useLocale(Locale.US);
        
        while (sc.hasNextLine()){
            String name = sc.next();
            Integer quantity = sc.nextInt();
            Double price = sc.nextDouble();
            Category category = Category.valueOf(sc.next().toUpperCase());
            Boolean promotiBoolean = sc.nextBoolean();
            Double discount = sc.nextDouble();
            Product purchase = new Product(name, quantity, price,category, promotiBoolean,discount);

            if(promotiBoolean != false){
                productsNoPromotion.add(purchase);
            }else{
                productsPromotion.add(purchase);
            };
    
        }
    }

    
}