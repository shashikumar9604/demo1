package project1_Calculator;


	import java.util.Scanner;

	public class Calculator {

		public static void main(String[] args) {
			int result;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the value a :");
			int a = sc.nextInt();
			System.out.println("Enter the value of b");
			int b = sc.nextInt();
			System.out.println(" Enter the Below option to perform operation ... \n "
					+ "\n 1. addition\n" + "\n 2.substraction    \n" + "\n 3. multiplication \n" + "\n 4.divition \n");
			System.out.println("Enter the options to perform Arthamatic operations... enter the key  like 1,2,3 or 4");
			char c = sc.next().charAt(0);
			
			
			switch(c)
			{
			case '1':
			{
		        result=a+b;
				System.out.println("Addition is "+result);
				break;
			}
			case '2':
			{
				result=a-b;
				System.out.println("Substraction is "+result);
				break;
			}
			case '3':
			{
				result = a*b;
				System.out.println("Multiplication is "+result);
				break;
			}
			case '4':
			{
				result=a/b;
				System.out.println("Divition is "+result);
				break;
			}
		
			default:
			{
				System.out.println("Invalid input");
			}
					
					
			}

		}

	}


