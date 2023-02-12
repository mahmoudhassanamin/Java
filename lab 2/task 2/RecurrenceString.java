public class  RecurrenceString{
	public static void main (String[] args){
		if(args.length == 1){
		int repetition = StringSearch.recurrenceTokenizer(args[0],"mahmoud");
		System.out.println("mahmoud is founed : "+repetition+" Times");
		int repetition2 = StringSearch.recurrenceTokenizer(args[0],"hassan");
		System.out.println("hassan is founed : "+repetition2+" Times");
		}
		else{
			System.out.println("program must take just one argument as string");
		}
	}
}