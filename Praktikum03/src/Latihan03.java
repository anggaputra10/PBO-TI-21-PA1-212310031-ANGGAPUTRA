import java.util.Scanner;

public class Latihan03 {

	public static void main(String[] args) {
		createNoRegis();
	}

	static void createNoRegis() {
		System.out.print("Masukkan Nomor: ");
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		String with3digits = String.format("%05d", a);
		System.out.println("No register:" + "IBIK" + with3digits);
	}
}