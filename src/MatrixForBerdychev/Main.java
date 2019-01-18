package MatrixForBerdychev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int stroki;
        int stolbtsi;
        //Input data stroki, stolbtsi
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vashe zhelanie , Berdychev");
        stroki = scanner.nextInt();
        System.out.println("Vash prikaz dlia stolbtsov");
        stolbtsi = scanner.nextInt();

        //input Matritsi
        int Matritsa_Dlya_SiSharpa[][] = new int[stroki][stolbtsi];

        System.out.print("Berdychev ili kto tam, Zapolnaj Matristsu");
        for(int i = 0; i < Matritsa_Dlya_SiSharpa.length; i++){
            for(int j = 0; j < Matritsa_Dlya_SiSharpa[i].length; j++){
                Matritsa_Dlya_SiSharpa[i][j] = scanner.nextInt();
            }
        }
        int stroki_shaga;
        int stolbtsi_shaga;
        //System.out.println("Che ty tytsaesh? Davai Podzemelnye strochki");
       // stroki_shaga = scanner.nextInt();
      //  System.out.println("My voobzche to edem popdzemlu tvoich stolbtsov.Vvodi tsap");
      //  stolbtsi_shaga = scanner.nextInt();

      //  int Matritsa_Dlya_Tvoego_Shaga[][] = new int[stroki][stolbtsi];
     //   System.out.print("Vvodi drugu Matritsu edI v Koshalin");
     //   for(int i = 0; i < Matritsa_Dlya_SiSharpa.length; i++){
    //        for(int j = 0; j < Matritsa_Dlya_SiSharpa[i].length; j++){
     //           Matritsa_Dlya_Tvoego_Shaga[i][j] = scanner.nextInt();
      //      }
      //  }

     //   int Eto_Nasha_Podzemlya[][] = new int [stroki][stolbtsi];
     //   for(int i = 0; i < Eto_Nasha_Podzemlya.length; i++){
     //   //    for(int j = 0; j < Eto_Nasha_Podzemlya[i].length; j++){
          //      Eto_Nasha_Podzemlya[i][j] = 0;
      ///      }
      //  }

        ThreadDliaBerdycheva threadDliaBerdycheva1 = new ThreadDliaBerdycheva("Akademia Shag", Matritsa_Dlya_SiSharpa);//,Matritsa_Dlya_Tvoego_Shaga);//,Eto_Nasha_Podzemlya);
        ThreadDliaBerdycheva threadDliaBerdycheva = new ThreadDliaBerdycheva("Diplom SiSharpa", Matritsa_Dlya_SiSharpa);//,Matritsa_Dlya_Tvoego_Shaga);//, Eto_Nasha_Podzemlya);



    }
}
