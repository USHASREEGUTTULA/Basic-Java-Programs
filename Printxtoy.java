
import java.util.Scanner;
class  Printxtoy
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);

		System.out.println("Enter x value:");
		int x=sc.nextInt();
		System.out.println("Enter y value:");
		int y=sc.nextInt();

		for (int i=x;i<=y ;i++ )
		{
			System.out.println(i);
		}
		
	}
}
