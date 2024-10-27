public class ContactFinderr
 {
    public static void findContact(String mobileNumber)
	{
        String[] contactNames = {"Alice", "Bob", "Charlie", "David", "Eve","Frank", "Grace", "Hannah", "Ian", "Jack"};
        String[] contactNumbers = {"1234567890", "0987654321", "1122334455", "2233445566", "3344556677", "4455667788", "5566778899", "6677889900", "7788990011", "8899001122"};
        for (int i = 0; i < contactNumbers.length; i++)
		{
            if (contactNumbers[i].equals(mobileNumber)) 
			{
                System.out.println("Contact for " + mobileNumber + ": " + contactNames[i]); 
                return; 
            }
        }
        System.out.println("Contact for " + mobileNumber + ": Contact not found");
    }

    public static void main(String[] args)
	{
        String mobileNumber1 = "1234567890";
        String mobileNumber2 = "1111111111"; 
        findContact(mobileNumber1);
        findContact(mobileNumber2);
	}
 }