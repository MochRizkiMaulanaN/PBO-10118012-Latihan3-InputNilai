/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputnilai;
import java.util.Scanner;

/**
 * Nama     : Moch Rizki Maulana N
 * Kelas    : IF-1 2018
 * Nim      : 10118012
 * Deskripsi Program : Input Nilai
 *
 * @author LENOVO
 */
public class InputNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.print("Masukkan Nama Anda : ");
        Scanner scanner= new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama Anda Adalah : "+nama);
    }
    
}
