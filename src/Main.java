import java.util.Scanner;
public class Main {
    private static int isPrime(int num, int i) {
        if (i==1){
            return 1;
        }else {
            if (num%i==0){
                return 0;
            }
            else return isPrime(num,i-1);
        }
    }
    public static void main(String[] args) {
        while (true){

            int num, prime ;
            Scanner data=new Scanner(System.in);
            System.out.print("Bir sayi giriniz : ");
            num= data.nextInt();
            if (num == 000){
                break;
            }
            prime=isPrime(num,num/2);
            if (prime==1){
                System.out.println(num+" sayisi asaldir");
            }else {
                System.out.println(num+" sayisi asal degildir");
            }

        }

    }


}