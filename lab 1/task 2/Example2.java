public class Example2{
	public static void main (String[] args){
		if (args.length > 1 || args.length == 0){
			System.out.println("invalid arguments");
		}
		else{
			if (args[0].equals("CoreJava")){
				System.out.println("True "+args[0]);
			}
			else{
				System.out.println("false it is not equal CoreJava");
			}
		}

	}
}