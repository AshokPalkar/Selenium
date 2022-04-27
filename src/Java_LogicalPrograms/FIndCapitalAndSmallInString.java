package Java_LogicalPrograms;

public class FIndCapitalAndSmallInString {
	public static void main(String[] args) {
		String str = "WelcoMe To AutomaTioN";

		String Upper = "";
		String Lower = "";

		/*for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch > 'A' && ch < 'Z') {
				Upper++;

			}

			if (ch > 'a' && ch < 'z') {
				Lower++;

			}

		}
		System.out.println(Upper);
		System.out.println(Lower);*/
		
		
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>=65 && ch<=90)
			{
				Upper=Upper+ch;
			}
			else
			{
				Lower=Lower+ch;
			}
			
		}
		System.out.println(Upper);
		System.out.println(Lower);

	}

}
