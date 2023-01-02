import java.util.*;

public class Latihan02 {
	
  static long faktorial(int n){
    long z =1;
    int i = 1;
    while(i <= n){
      z=z*i;
      i++;
    }
    return z;
  }
  public static void main(String[] args){
    int a, i, j;
    Scanner scan = new Scanner(System.in);
    System.out.print("Masukkan nilai: ");
    a = scan.nextInt();
    for (i=0; i<a+1; i++){
      for (j=0; j<a-i-1; j++){
        System.out.print(" ");
      }
      for (j=0; j<=i; j++){
        System.out.print(faktorial(i)/(faktorial(j)*faktorial(i-j))+" ");
      }
      System.out.println();
    }
  }  
}