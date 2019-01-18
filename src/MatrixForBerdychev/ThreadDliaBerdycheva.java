package MatrixForBerdychev;

public class ThreadDliaBerdycheva implements Runnable {
Thread thread;
static SumaBerdychevskogoSiSharpa sumaBerdychevskogoSiSharpa = new SumaBerdychevskogoSiSharpa();
int aa[][];
int podzemlia_matrilazalnaya[][];
int suma_nasha_podzemlya[][];
int otvet_berdychevu;

    public ThreadDliaBerdycheva( String name,  int[][] aa){//, int podzemlia_matritsalnaya[][]){//,int suma_nasha_podzemlya[][]) {
        this.thread = new Thread(this,name);
        this.aa = aa;
      //  this.podzemlia_matrilazalnaya = podzemlia_matritsalnaya;
      //this.suma_nasha_podzemlya = suma_nasha_podzemlya;
        thread.start();
    }

    @Override
    public void run() {
    int suma_potoka_berdycheva;
    System.out.println(thread.getName()+ " - Pusk");

    otvet_berdychevu = sumaBerdychevskogoSiSharpa.sumaBerdychevaVvoda(aa);//, podzemlia_matrilazalnaya);//, suma_nasha_podzemlya);

    System.out.println(thread.getName() +" - Berdychevska Summa" + ":" +otvet_berdychevu);
    System.out.println(thread.getName() +" - Finish or Crash Tvoego Shaga gyyyy");
    }
}
