import java.util.*;

public class PhoneList

{
static Scanner keyboard = new Scanner(System.in); 

private ArrayList<Contact> phoneList = new ArrayList<Contact>();

public void getContactInfo()

{
    String cont = "Y";

    
    while (cont.equalsIgnoreCase("Y")) {
        System.out.print("Enter name -->");
        String name = keyboard.nextLine();
    
        System.out.print("Enter phone number -->");
        String phone = keyboard.nextLine();
    
    
        Contact contact = new Contact (name, phone);
        phoneList.add(contact);
    
        System.out.println("Continue [Y or N]?");
        cont = keyboard.nextLine();
    }

}

public void printContactInfo()
{
    System.out.println("        Contact List");
    System.out.println("----------------------------------");
    for (int n = 0; n<phoneList.size(); n++) {
        Contact contact = phoneList.get(n);
        System.out.println(contact.getName() + "\t" + contact.getPhone());
    }

}

public static void main(String[] args)

{

PhoneList app = new PhoneList();

app.getContactInfo();

app.printContactInfo();

}

}