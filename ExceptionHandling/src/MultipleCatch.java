public class MultipleCatch {
	public static void main(String args[]) {
try {
	int a[]=new int[5];
	a[5]=50/0;
}
catch(ArithmeticException e){
	System.out.println("task1 is completed");
}
catch(ArrayIndexOutOfBoundsException e){
	System.out.println("task1 is completed");
}
catch(Exception e){
	System.out.println("task1 is completed");
}

System.out.println("Rest of the code is Executed");
}
}
