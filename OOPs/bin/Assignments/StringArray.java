class StringArray{
	public static void main(String args[]){
		System.out.println("-----Friends List-------");
		String friends[] =  {"Atharv","Virendra","Nagesh","Vishnu","Harshad","Bhagwat"};
		/*for(int i=0;i<=friends.length-1;i++){
			System.out.println(friends[i]);
		}*/
		System.out.println("Lengths of Friends = "+friends.length);
		for(String j:friends){
			System.out.println(j);
		}
	}
}