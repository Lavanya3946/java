class Height
{
	public static void main(String[] args)
	{
		 double height1=5.8;
		 double height2=6.1;
		 double height3=5.2;
		 double height4=5.9;
		 double height5=6.0;
		 double height6=5.1;
		 double height7=4.9;
         double height8=5.4;
         double height9=5.5;
		 double height10=6.2;
		 double[] heights={height1,height2,height3,height4,height5,height6,height7,height8,height9,height10};
		 for(int i=0;i<heights.length;i++)
		 {
		 System.out.println("height"+(i+1)+":  "+heights[i]);
		 }
		 System.out.println("heights greater than 5.9:");
		 for(int i=0;i<heights.length;i++)
		 {
			 if(heights[i]>5.9)
			 {
				  
				  System.out.println("height"+(i+1)+":  "+heights[i]);
			 }
		 }
		 System.out.println("heights less than 5.3:");
		 for(int i=0;i<heights.length;i++)
		 {
			 if(heights[i]<5.3)
			 {
				 System.out.println("height"+(i+1)+":  "+heights[i]);
			 }
		 }
	}
}

		 