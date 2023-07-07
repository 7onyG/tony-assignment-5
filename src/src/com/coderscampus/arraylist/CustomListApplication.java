package src.com.coderscampus.arraylist;


public class CustomListApplication {

	public static <T> void main(String[] args) {

		CustomList<Integer> integers =  new CustomArrayList<>();
		
		
		for (int i=1; i<=200; i++) 
		{
			integers.add(i);
		}
		
		for (int i=0; i<integers.getSize(); i++) {
			System.out.println(integers.get(i));
		}
	}
		
	}


