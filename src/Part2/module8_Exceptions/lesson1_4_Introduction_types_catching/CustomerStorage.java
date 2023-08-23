package Part2.module8_Exceptions.lesson1_4_Introduction_types_catching;

import java.io.IOException;
import java.util.HashMap;
import java.util.regex.Pattern;

public class CustomerStorage
{
    private HashMap<String, Customer> storage;

    public CustomerStorage()
    {
        storage = new HashMap<>();
    }

    public void addCustomer(String data) throws IOException {
        String[] components = data.split("\\s+");
        if(components.length!=4){
            throw new IOException("Wrong format.\nexample: add Василий Петров vasily.petrov@gmail.com +375256800139");
        }
        String name = components[0] + " " + components[1];
        if (!Pattern.matches("(\\+375)(29|44|17|33|44|25)\\d{7}", components[3])){
            throw new IOException("Wrong format tel number\nexample:+375297090835");
        }
        if (!Pattern.matches("(\\w+|\\w+\\.\\w+)@\\w+\\.\\w+", components[2])){
            throw new IOException("Wrong format email\nexample:vasily.petrov@gmail.com");
        }
        storage.put(name, new Customer(name, components[3], components[2]));
    }

    public void listCustomers()
    {
        storage.values().forEach(System.out::println);
    }

    public void removeCustomer(String name)
    {
        storage.remove(name);
    }

    public int getCount()
    {
        return storage.size();
    }
}