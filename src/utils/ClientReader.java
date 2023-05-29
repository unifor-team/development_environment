package utils;
import entities.Client;
import entities.User;
import entities.Repository;
import enums.Category;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Locale;




public class ClientReader {
    public ClientReader (ArrayList<User> Clients, ArrayList<User> Repository) throws Exception {
        File f = new File ("user_db.txt");
        Scanner sc = new Scanner(f);
        sc.useLocale(Locale.US);

        

        while(sc.hasNextLine()){
            String name = sc.next();
            Integer age = sc.nextInt();
            String address = sc.next();
            Boolean isActive = sc.nextBoolean();
            String cpfOrCnpj = sc   .next();
            String contactNumber = sc.next();
            String location = sc.next();
            Double balance = sc.nextDouble();
            System.out.print(name + age + address + isActive + cpfOrCnpj + contactNumber + location + balance);
            User client = new Client(name, age, address, isActive, cpfOrCnpj, contactNumber, location, balance);
            
            DocumentValidator validator = new DocumentValidator(cpfOrCnpj);
            String documentType = validator.getType();
            if(documentType.equals("CPF")) {
               Clients.add(client);
            } else if(documentType.equals("CNPJ")) {
               Repository.add(client);
            } else {
            
 
            }
    }
}
}