import java.util.Scanner;
class Main {
  public static void main(String[] args) {

    int a, b = 0;
		Scanner s = new Scanner(System.in);		
		System.out.print("Enter a number to count down or up from:");
		a = s.nextInt();
		System.out.print("Enter 0:");
		b = s.nextInt();
		
			if(a<b){					
				do{
					System.out.println(a);
					a++; }
				while(a<=b);
				}		
			else if (b<a){					
				do{
					System.out.println(a);
					a--; }
				while(b<=a);
				}
		System.out.println("Blast off!");
  }
}