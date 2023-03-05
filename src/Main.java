import java.util.Scanner;

public class Main {

    static int toplama(int n1,int n2)
    {
        return n1+n2;
    }

    static int cikarma(int n1,int n2)
    {
        return n1-n2;
    }

    static int carpma(int n1,int n2)
    {
        return n1*n2;
    }


    static int bolme(int n1,int n2)
    {
        if(n2==0){
            System.out.println("sayi sifira bolunemez!");
            return 0;

        }else{
            return n1/n2;
        }

    }

    static int ustAlma(int n1,int n2)
    {
        int result=1;
        for(int i=0;i<n2;i++){
            result*=n1;
        }

        return result;
    }

    static int modBulma(int n1,int n2)
    {
        return n1%n2;
    }


    static void bas(int n){
        System.out.println("\nislem sonucu = "+n+"\n");
    }


    public static void main(String[] args) {
        int select,n1,n2;
        Scanner oku=new Scanner(System.in);

        String menu="1- Toplama İşlemi\n" +
                "2- Çıkarma İşlemi\n" +
                "3- Çarpma İşlemi\n" +
                "4- Bölme işlemi\n" +
                "5- Üslü Sayı Hesaplama\n" +
                "6- Mod Alma\n" +
                "0- Cikis\n";

        System.out.println(menu);

        while (true){

            System.out.println(menu);

            System.out.print("Bir islem seciniz? ");
            select=oku.nextInt();
            if(select==0){
                break;
            }
            System.out.println("ilk sayiyi giriniz?");
            n1=oku.nextInt();
            System.out.println("ikinci sayiyi giriniz?");
            n2=oku.nextInt();

            switch (select){
                case 1:
                    bas(toplama(n1,n2));
                    break;

                case 2:
                    bas(cikarma(n1,n2));
                    break;
                case 3:
                    bas(carpma(n1,n2));
                    break;
                case 4:
                    bas(bolme(n1,n2));
                    break;

                case 5:
                    bas(ustAlma(n1,n2));
                    break;

                case 6:
                    bas(modBulma(n1,n2));

                default:
                    System.out.println("hatali giris yaptiniz");

            }

    }




    }


}