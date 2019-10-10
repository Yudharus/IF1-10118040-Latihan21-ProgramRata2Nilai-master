/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118040.latihan21.programrata2nilai.master;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class IF110118040Latihan21ProgramRata2NilaiMaster {

 /**
 * @param args the command line arguments
   NAMA			: Moch Yudha Rusdian
 * KELAS		: IF-1
 * NIM			: 10118040
 * Deskripsi Program	: menghitung rata rata mahasiswa
 */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
		System.out.print("Masukkan Banyaknya Mahasiswa : ");
		int jumlahMahasiswa = scanner.nextInt();
		double rataMahasiswa = 0;
		for( int i = 0; i < jumlahMahasiswa; i++){
			System.out.print("Nilai Mahasiswa ke-" + (i+1) + " : ");
			rataMahasiswa += scanner.nextInt();
		}
		rataMahasiswa /= jumlahMahasiswa;
		System.out.println("Maka, Rata-rata Nilainya adalah " + rataMahasiswa);
    }
    
}
