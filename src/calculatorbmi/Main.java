/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatorbmi;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Main {
    public static void main(String[] args) {
        KalkulatorBMI hitungBMI = new KalkulatorBMI();
        Scanner userInput = new Scanner(System.in);
          System.out.println("SELAMAT DATANG DI PROGRAM MENGHITUNG BMI");
          System.out.print("Siapa namamu :");
          hitungBMI.nama = userInput.next();
          System.out.print("Usiamu berapa tahun :");
          hitungBMI.umur = userInput.nextInt();
          System.out.print("Masukkan berat badanmu dalam (Kilogram): ");
      hitungBMI.berat = userInput.nextDouble();
      System.out.print("Masukkan tinggi badanmu dalam (CentiMeter): ");
      hitungBMI.tinggi = userInput.nextDouble();
      hitungBMI.menghitungBMI();
      hitungBMI.hitungKesehatan();
          
    }
    
    
}
