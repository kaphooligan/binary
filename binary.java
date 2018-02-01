import java.util.Scanner;

public class binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyboard = new Scanner (System.in);
		int x=1;
		
		do
		{
			System.out.println("enter a number in binary and I'll convert it");
			try
			{
				
					String user = keyboard.nextLine();
					int convert = Integer.parseInt(user, 2);
					System.out.println(convert);
					x = 2;
				
			}
			catch(NumberFormatException nfex)
			{
				System.out.println("not in binary");
			}
		}while(x==1);
	}

}
