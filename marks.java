package ram;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.io.*;


public class Main2 {
	public static void main(String[] args) throws Exception{
		System.out.println("Enter number of subjects:");
		InputStreamReader re=new InputStreamReader(System.in);
		BufferedReader brr=new BufferedReader(re);
		int n=Integer.parseInt(brr.readLine());
		int[] marks= new int[n];
		try (Scanner sc = new Scanner(System.in)) {
			int total=0;
			double average;
			System.out.println("Enter Marks:");
			for(int i=0;i<n;i++)
			{
				System.out.println("Enter Marks for subject"+i+":");
				marks[i]=sc.nextInt();
			total=total+marks[i];
			}
			average =total/n;
			System.out.println("TOTAL MARKS:"+total);
			System.out.println("AVERAGE PERCENTAGE:"+average);
			if (average>=90)
			{
				System.out.println("GRADE:A+");
				System.out.println("CONGRATULATIONS!!!YOU HAVE PASSED THE EXAM");
			}
			else if (average<90 && average>=80)
			{
				System.out.println("GRADE:A");
				System.out.println("CONGRATULATIONS!!!YOU HAVE PASSED THE EXAM");
			}
			else if (average<80 && average>=70)
			{
				System.out.println("GRADE:B");
				System.out.println("CONGRATULATIONS!!!YOU HAVE PASSED THE EXAM");
			}
			else if (average<70 && average>=60)
			{
				System.out.println("GRADE:C");
				System.out.println("CONGRATULATIONS!!!YOU HAVE PASSED THE EXAM");
			}
			else if (average<60 && average>=50)
			{
				System.out.println("GRADE:D");
				System.out.println("CONGRATULATIONS!!!YOU HAVE PASSED THE EXAM");
			}
			else if (average<50 && average>=40)
			{
				System.out.println("GRADE:E");
				System.out.println("CONGRATULATIONS!!!YOU HAVE PASSED THE EXAM");
			}
			else
			{
				System.out.println("GRADE:F");
				System.out.println("SORRY!!!YOU FAILED THE EXAM");
			}
		}
	}
		}