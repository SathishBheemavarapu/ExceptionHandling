
public class FinalBlock {

	public static void main(String[] args) {
		try {
			int a=50/0;
		}
		finally{
			System.out.println("Finally block is executed irrestive to the exceptions");
			
		}
		System.out.println("Rest of the code is executed");

	}

}
