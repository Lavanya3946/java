public  class Blood
{
	 public static void main(String[] args)
	 {
		 String blood1="A+";
		 String blood2="B-";
		 String blood3="AB+";
		 String blood4="o-";
		 String blood5="AB-";
		 String[] bloodGroup={blood1,blood2,blood3,blood4,blood5};
		 System.out.println("blood1:"+blood1);
		 System.out.println("blood2:"+blood2);
		 System.out.println("blood3:"+blood3);
		 System.out.println("blood4:"+blood4);
		 System.out.println("blood5:"+blood5);
		 String blood6="B+";
		 System.out.println("explicit :"+blood6);
		 String blood7="A-";
		 System.out.println("explicit :"+blood7);
		 System.out.println("implicit:"+blood2);
		 System.out.println("implicit :"+blood3);
		 System.out.println("implicit :"+blood4);
		 System.out.println("blood1:"+bloodGroup[0]);
		 System.out.println("blood2:"+bloodGroup[2]);
		 bloodGroup[0]="OB-";
		 System.out.println("update :"+bloodGroup[0]);
	 
	 }
}
		 
		 
		 
	 





		 
		 
	 
