import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string: ");
		String str = sc.nextLine();
		
		String rev = "";
		int length = str.length();
		int vowels = 0;
		
		for (int i = length - 1; i >= 0; i--) {
		    char ch = str.charAt(i);
		    
		    // count vowels
		    switch (ch) {
		        case 'a':
		        case 'e':
		        case 'i':
		        case 'o':
		        case 'u':
		        case 'A':
		        case 'E':
		        case 'I':
		        case 'O':
		        case 'U':
		            vowels++;
		    }
		    
	        // reverse string
	        rev += ch;
		}
		
		System.out.println("Number of vowels: " + vowels);
		System.out.println("Reverse: " + rev);
		
		sc.close();
	}
}
