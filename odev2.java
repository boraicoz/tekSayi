import java.util.Scanner;
public class odev2 {

    public static void main(String[] args) {
        int total=0,i;


        do{
            System.out.print("Sayi giriniz:");
            Scanner in=new Scanner(System.in);
            i=in.nextInt();
            if(i%4==0)
              total+=i;
        }while(!(i%2==1));
        System.out.println("Toplam:"+total);

    }




}
