public class Example3{
	public static void main (String [] args){
		if (args.length == 2){
			int i=0;
			int x = Integer.parseInt(args[0]);
			for ( i=0 ; i < x ; i++ ){
				System.out.println(args[1]);	
			}
		}
		else{
			System.out.println("invalid arguments");
		}
	}
}