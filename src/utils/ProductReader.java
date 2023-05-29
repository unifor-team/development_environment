package utils;

import entities.Product;
import enums.Category;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ProductReader {
    private ArrayList<Product> productsPromotion;
    private ArrayList<Product> productsNoPromotion;
    private String promotionFileName = "promotion_db.txt";
    private String noPromotionFileName = "noPromotion_db.txt";

    public ProductReader(ArrayList<Product> productsPromotion, ArrayList<Product> productsNoPromotion)
            throws IOException {
        this.productsPromotion = productsPromotion;
        this.productsNoPromotion = productsNoPromotion;
        readProductsFromFile();
        writePromotionToFile();
        writeNoPromotionToFile();
    }

    private void readProductsFromFile() throws IOException {
        File file = new File("product_reader.txt");
        Scanner scanner = new Scanner(file);
        scanner.useLocale(Locale.US);

        while (scanner.hasNextLine()) {
            String name = scanner.next();
            int quantity = scanner.nextInt();
            double price = scanner.nextDouble();
            Category category = Category.valueOf(scanner.next().toUpperCase());
            boolean promotionBoolean = scanner.nextBoolean();
            double discount = scanner.nextDouble();
            Product product = new Product(name, quantity, price, category, promotionBoolean, discount);

            if (promotionBoolean) {
                productsPromotion.add(product);
            } else {
                productsNoPromotion.add(product);
            }
        }

        scanner.close();
    }

    private void writePromotionToFile() throws IOException {
        if (!productsPromotion.isEmpty()) {
            Writer<Product> writer = new Writer<>(productsPromotion, promotionFileName);
            writer.writeFile();
        }
    }

    private void writeNoPromotionToFile() throws IOException {
        if (!productsNoPromotion.isEmpty()) {
            Writer<Product> writer = new Writer<>(productsNoPromotion, noPromotionFileName);
            writer.writeFile();
        }
    }
}
