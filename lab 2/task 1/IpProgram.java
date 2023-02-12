public class IpProgram{
	public static void main (String[] args){
		if(args.length == 1){
			IpCutter ip1= new IpCutter(args[0]);
			int [] ipInt1=ip1.IpSlitter();
			System.out.println("by String Split");
			for (int i=0; i<ipInt1.length;i++){
				System.out.println(ipInt1[i]);
			}
			IpTekonizer ip2 = new IpTekonizer(args[0]);
			ipInt1=ip2.getTokens();
			System.out.println("by StringTokenizer");
			for (int i=0; i<ipInt1.length;i++){
				System.out.println(ipInt1[i]);
			}

		}
		else{
			System.out.println("this program must take one String as argument ");
		}

	}


}