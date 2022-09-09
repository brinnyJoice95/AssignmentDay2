package week1.day2;



public class PrimeNumber  {

         public static void main(String[] args) {
			
			int num = 13;
			boolean prime = false;
			for(int i = 2;i <= num/2;i++)
			
			if(num%i == 0) {
				prime = true;
				break;
			}
			if(!prime)
				System.out.println("This is Prime Number " +num);
			else
				System.out.println("This is not a Prime Number " +num );



				   }

	}
