public class ContactFinderr1
 {
    public static void findContact(String mobileNumber)
	{
        String[] contactNames = {"Alice", "Bob", "Charlie", "David", "Eve","Frank", "Grace", "Hannah", "Ian", "Jack"};
        long[] contactNumbers = {1234567890l, 0987654321l, 1122334455l, 2233445566l, 3344556677l, 4455667788l, 5566778899l, 6677889900l, 7788990011l, 8899001122l};
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
        String mobileNumber1 = 1234567890l;
        String mobileNumber2 = 1111111111l; 
        findContact(mobileNumber1);
        findContact(mobileNumber2);
	}
 }