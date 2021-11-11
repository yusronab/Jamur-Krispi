package phb;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Play {

    public static void main(String[] args) {
        DataKaryawan dk = new DataKaryawan();
        
        int nomor = 0;
        
        while (nomor != 5) {

            System.out.println("Selamat datang");
            System.out.println("1.create");
            System.out.println("2.search by nip");
            System.out.println("3.search by nama");
            System.out.println("4.edit");
            System.out.println("5.berhenti");
            System.out.println("=== pilih menu ===");
            Scanner pilihan = new Scanner(System.in);
            int nomorPil = pilihan.nextInt();

            if (nomorPil == 1) {
                dk.createData();
            } else if (nomorPil == 2) {
                System.out.println("Masukan nip yang dicari");
                String cariNip = pilihan.next();
                dk.searchByNip(cariNip);
            } else if(nomorPil==3){
                 System.out.println("Masukan nama yang dicari");
                String carinama = pilihan.next();
                dk.searchByNama(carinama);
            } else if (nomorPil == 4) {
                System.out.println("Masukan nip yang dicari");
                String cariNip = pilihan.next();
                dk.updateData(cariNip);
            } else if(nomorPil==5){
                System.out.println("sedang berhenti");
                break;
            }    
            
             
            
            nomor = nomorPil;
        }

    }
}
