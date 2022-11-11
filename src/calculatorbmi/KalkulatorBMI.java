/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorbmi;

/**
 *
 * @author USER
 */
public class KalkulatorBMI {

    /**
     * @param args the command line arguments
     */
    double hasil,berat,tinggi;
    int umur;
    String nama = "";
    String kesehatan;
    
    void menghitungBMI (){
        
        tinggi = tinggi / 100;
        hasil = Math.round(berat / (tinggi * tinggi));
        System.out.print("Body Mass Indexmu sekitar : " + hasil + " kg/m2  \n");        
    }
    
    void hitungKesehatan() {
        kesehatan = "";
        
        if (hasil < 18 ) {
            kesehatan = "Terlalu Kurus";
        }else if (hasil >= 18 && hasil < 25) {
            kesehatan = "Normal";
        }else if (hasil >= 25 && hasil <30) {
           kesehatan = "Kelebihan Berat Badan";
        } else if (hasil >= 30 && hasil <= 35) {
            kesehatan = "Obesitas";
        } else if (hasil > 35) {
            kesehatan = "Obesitas Extrem";
        }
            System.out.println("=========================================================");
            System.out.println("Jadi Standart Kesehatan "+ nama + " di umur " + umur + " tahun dengan BMI " + hasil + " kg/m2 adalah " + kesehatan );
         
        } 
        
    
    
}
