/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gelismis_kull;
import java.util.Scanner;
/**
 *
 * @author Costa
 */
public class Gelismis_kull {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner veri=new Scanner (System.in);
        System.out.print("Girilecek veri sayısını giriniz:");
        int veri_sayisi=veri.nextInt();
        int toplam=0;
        for(int i=1;i<=veri_sayisi;++i){
            System.out.print("\n"+i+". veri:");
            toplam+=veri.nextInt();
            }
        double ort=toplam/veri_sayisi;
        System.out.print("\nOrtalamanız: "+ort);
    }
    
}
