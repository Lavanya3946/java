class Location{
	 String area;
	 
	 
	 public static void main(String[] args)
	 {
		 Location location=new Location();
		 System.out.println("area of location:"+location.area);
		 location.area="yelahanka";
		 System.out.println("area of a location after updated is:"+location.area);
		 Location location1=new Location();
		 System.out.println("area of location:"+location1.area);
		  Location location2=location;
		 System.out.println("area of location:"+location.area);
	 }
}
		 
		 