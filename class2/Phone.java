class  Phone
{
	 public static void main(String[] args)
	 {
		 int[] mobilePrice={15000,26000,24000,30000,18000,28000,17000,32000,19000,25000};
		 System.out.println("prices before update:");
		 for(int i=0;i<mobilePrice.length;i++)
		 {
			 System.out.println(mobilePrice[i]);
		 }
		 for(int i=0;i<mobilePrice.length;i++)
		 {
			 if(mobilePrice[i]>25000)
			 {
				 mobilePrice[i]+=500;
			 }
		 }
		 System.out.println("prices after updated :");
		 for(int i=0;i<mobilePrice.length;i++)
		 {
			 System.out.println(mobilePrice[i]);
		 }
	 }
}
			 