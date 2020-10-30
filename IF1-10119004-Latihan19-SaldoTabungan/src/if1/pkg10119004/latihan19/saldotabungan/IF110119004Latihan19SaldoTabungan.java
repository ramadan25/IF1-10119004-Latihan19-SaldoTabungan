/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119004.latihan19.saldotabungan;
import java.util.Scanner;


/**
 *
 * @author ENDOG
 */
public class IF110119004Latihan19SaldoTabungan {
    static int saldoAkhir;
    static void hitung(int a,int b){
        saldoAkhir = (a + (a*b/100));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int saldoAwal;
        int bunga;
        int lamaMenabung;
        int banyakBulan;
  
    Scanner in = new Scanner(System.in);
  
    System.out.print("Saldo Awal : Rp. ");
    saldoAwal = in.nextInt();
    System.out.print("Bunga/Bulan(%): ");
    bunga = in.nextInt();
    System.out.print("Lama (bulan): ");
    banyakBulan = in.nextInt();
    System.out.println("");
    System.out.println("------------------------------------------------------------------------");

  
  
    for (lamaMenabung=1; lamaMenabung<=banyakBulan; lamaMenabung++) {
        hitung(saldoAwal,bunga);
   
     
    System.out.println("Saldo di bulan ke- "+lamaMenabung+" Rp."+saldoAkhir);
    saldoAwal = saldoAkhir;
        }
    }
    
}
