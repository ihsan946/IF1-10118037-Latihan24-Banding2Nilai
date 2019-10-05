/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if110118037latihan24bandingnilai;
import java.util.Scanner;
/**
 *
 * @author Muhammad Ihsan
 * NAMA                           : Muhammad Ihsan
 * KELAS                         : IF-1
 * NIM                              : 10118037
 * Deskripsi Program   : Program ini berisi program perbandingan 2 buah nilai
 */
public class IF110118037Latihan24BandingNilai {

    
    public static void main(String[] args) {
       
        String status;
        int nilai1;
        int nilai2;
        String cek;
        
        //proses
        do{
            System.out.println("+++++PROGRAM PERBANDINGAN NILAI+++++");
            System.out.print("Masukkan Nilai Pertama\t: ");
            Scanner tempNilai1 = new Scanner(System.in);
            nilai1 = tempNilai1.nextInt();
            
            System.out.print("Masukkan Nilai Kedua\t: ");
            Scanner tempNilai2 = new Scanner(System.in);
            nilai2 = tempNilai2.nextInt();
           
            cek = (nilai1 > nilai2)?" Lebih Besar ":" Lebih Kecil ";
            System.out.println("Hasil\t\t\t: " + nilai1 + cek + nilai2);
            
            
            System.out.print("Ulangi Aktivitas? [Ya/Tidak] : ");    
            Scanner tempStatus = new Scanner(System.in);
            status = tempStatus.nextLine();
            System.out.println();
        }while(status.equals("Ya") || status.equals("ya"));
    }
    
}
