import java.util.Locale;
import java.util.Scanner;

public class Area {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble(), B = sc.nextDouble(), C = sc.nextDouble();
		
		double A_tri = A * C / 2;
		
		double pi = 3.14159;
		double A_cir = pi * C * C;
		
		double A_trap = (A + B) * C / 2;
		
		double A_qua = B * B;
		
		double A_ret = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", A_tri);
		System.out.printf("CIRCULO: %.3f%n", A_cir);
		System.out.printf("TRAPEZIO: %.3f%n", A_trap);
		System.out.printf("QUADRADO: %.3f%n", A_qua);
		System.out.printf("RETANGULO: %.3f%n", A_ret);
		
		
		sc.close();
	}

}
