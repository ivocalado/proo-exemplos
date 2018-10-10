import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Digite a entrada: ");
		int i = s.nextInt();
		
		s.close();
		System.out.println("Valor lido: " + i);
	}
}
