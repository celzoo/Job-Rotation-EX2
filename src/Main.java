import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number=0,k=1,fibo=0,count=0,n=0;
        System.out.println("Diga qual numero deseja saber se faz parte da sequencia de Fibonaci");
        number = sc.nextInt();
		
		while(fibo<=number) {
			n=k;
			k=fibo;
			fibo=n+k;
			
			if(number==k) {
				count++;
			}
		}
		
		if(count>0 ) {
			System.out.println("O numero "+ number+" faz parte da sequencia de Fibonaci");
			
		}
		else {
			System.out.println("O numero "+number+" não faz parte da sequencia de Fibonaci");
		}
		
		

	}

}
