public class IpCutter{
	
	String ipString;
	public IpCutter(String ipInput){
		ipString=ipInput;
	}
	int[] IpSlitter(){
		String[] ipFields;
			ipFields = ipString.split("[.]");
			if (ipFields.length == 4){
				int ipInt []=new int[ipFields.length]; 
				for(int i=0;i<ipFields.length;i++){
					ipInt[i]=Integer.parseInt(ipFields[i]);
				}
				return ipInt;
			}
		else{
			System.out.println("ip must have four Fields");
			return null;
		}
	}
}