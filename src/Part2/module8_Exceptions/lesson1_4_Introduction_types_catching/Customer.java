package Part2.module8_Exceptions.lesson1_4_Introduction_types_catching;

public class Customer
{
    private String name;
    private String phone;
    private String eMail;

    public Customer(String name, String phone, String eMail)
    {
        this.name = name;
        this.phone = phone;
        this.eMail = eMail;
    }

    public String toString()
    {
        return name + " - " + eMail + " - " + phone;
    }
}
