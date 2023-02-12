import java.util.StringTokenizer ;
public class IpTekonizer{
	
	StringTokenizer ipToken;
	public IpTekonizer(String ipInput){
		ipToken = new StringTokenizer(ipInput,"."); 		
	}
	int[] getTokens(){
		if(ipToken.countTokens() == 4){
			int ipInt []=new int[4];
			int i = 0;
			while(ipToken.hasMoreTokens()){
				ipInt[i] =Integer.parseInt(ipToken.nextToken());
				i++;
			}
			return ipInt;
		}
		else{
			System.out.println("ip must have four Fields");
			return null;
		}
	}

	
}