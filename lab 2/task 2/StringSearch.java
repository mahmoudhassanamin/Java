import java.util.StringTokenizer ;
public class StringSearch{
	static int recurrenceTokenizer (String s1,String s2){
		StringTokenizer str = new StringTokenizer(s1," ");
		int counter=0 ;
		while(str.hasMoreTokens()){
			if(str.nextToken().equals(s2)){
				counter++;
			} 
		}
		return counter;
	}
	static int recurrenceSplit (String s1,String s2){
		String str[] = s1.split(" ");
		int i=0,counter=0;
		for(i=0;i<str.length;i++){
			if(str[i].equals(s2)){
				counter++;
			}
		}
		return counter;
	}
}