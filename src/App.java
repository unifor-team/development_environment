import java.util.ArrayList;

import entities.Product;
import entities.User;

import utils.ClientReader;
import utils.ProductReader;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<User> repository = new ArrayList<>();
        ArrayList<User> clients = new ArrayList<>();
        ArrayList<Product> productsInPromo = new ArrayList<>();
        ArrayList<Product> productsNoPromo = new ArrayList<>();

        new ProductReader(productsInPromo, productsNoPromo);
        new ClientReader(clients, repository);
    }
}
