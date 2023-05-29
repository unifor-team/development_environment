package utils;

import entities.Client;
import entities.Repository;
import entities.User;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class ClientReader {
    private ArrayList<User> clients;
    private ArrayList<User> repositories;
    private String clientFileName = "clients_db.txt";
    private String repositoryFileName = "repositories_db.txt";

    public ClientReader(ArrayList<User> clients, ArrayList<User> repositories) throws IOException {
        this.clients = clients;
        this.repositories = repositories;
        readClientsFromFile();
        writeClientsToFile();
        writeRepositoriesToFile();
    }

    private void readClientsFromFile() throws IOException {
        File file = new File("user_reader.txt");
        Scanner scanner = new Scanner(file);
        scanner.useLocale(Locale.US);

        while (scanner.hasNextLine()) {
            String name = scanner.next();
            int age = scanner.nextInt();
            String address = scanner.next();
            boolean isActive = scanner.nextBoolean();
            String cpfOrCnpj = scanner.next();
            String contactNumber = scanner.next();
            String location = scanner.next();
            double balance = scanner.nextDouble();

            DocumentValidator validator = new DocumentValidator(cpfOrCnpj);
            String documentType = validator.getType();

            System.out.println(documentType);

            if (documentType.equals("CPF")) {
                User client = new Client(name, age, address, isActive, cpfOrCnpj, contactNumber, location, balance);
                System.out.println(client.toString());
                clients.add(client);
            } else if (documentType.equals("CNPJ")) {
                User repository = new Repository(name, age, address, isActive, cpfOrCnpj);
                repositories.add(repository);
            }
        }

        scanner.close();
    }

    private void writeClientsToFile() throws IOException {
        if (!clients.isEmpty()) {
            Writer<User> writer = new Writer<User>(clients, clientFileName);
            writer.writeFile();
        }
    }

    private void writeRepositoriesToFile() throws IOException {
        if (!repositories.isEmpty()) {
            Writer<User> writer = new Writer<User>(repositories, repositoryFileName);
            writer.writeFile();
        }
    }
}
