package MatrixForBerdychev;

 class SumaBerdychevskogoSiSharpa {
     private  int summa_dlia_berdycheva;


     synchronized int  sumaBerdychevaVvoda(int[][] persha_matritsa_berdyceva){//{, int[][] druga_matritsa_berdycheva){//,int suma_zarplaty_shaga_prepoda[][]){
         int suma_zarplaty_shaga_prepoda[][];
       int strochki, stolbiki;
       strochki = persha_matritsa_berdyceva.length; // druga_matritsa_berdycheva.length;
             stolbiki = persha_matritsa_berdyceva[0].length; //druga_matritsa_berdycheva[0].length;

         summa_dlia_berdycheva = 0;
        suma_zarplaty_shaga_prepoda = new int[stolbiki][strochki];

         for(int i = 0 ; i < stolbiki; i++) {
             for (int j = 0; j < strochki; j++) {
                 suma_zarplaty_shaga_prepoda[i][j] = 0;
               //  suma_zarplaty_shaga_prepoda[i][j] += persha_matritsa_berdyceva[i][j] + druga_matritsa_berdycheva[i][j];
                 summa_dlia_berdycheva += suma_zarplaty_shaga_prepoda[i][j];
                 summa_dlia_berdycheva += persha_matritsa_berdyceva[i][j];
                 try {

                     Thread.sleep(100);
                 } catch (InterruptedException e) {
                     System.out.println("Nu ty podzemelnik");
                 }


             }

         }


         return summa_dlia_berdycheva;
     }
    SumaBerdychevskogoSiSharpa(){

    }
}
