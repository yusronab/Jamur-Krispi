package phb;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DataKaryawan extends JFrame implements CRUD, Search {

    KaryawanPhb[] karyawan;

    public DataKaryawan() {
        karyawan = new KaryawanPhb[10];
    }

    @Override
    public void createData() {
        KaryawanPhb kp = new KaryawanPhb();
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan Nip");
        String inputNip = input.next();
        System.out.println("Masukan Nama");
        String inputNama = input.next();
        System.out.println("Masukan Unit");
        String inputUnit = input.next();
        System.out.println("Masukan Tahun Masuk");
        int inputTahun = input.nextInt();

        kp.setNip(inputNip);
        kp.setNama(inputNama);
        kp.setUnit(inputUnit);
        kp.setTahunMasuk(inputTahun);

        for (int i = 0; i < karyawan.length; i++) {
            if (karyawan[i] == null) {
                karyawan[i] = kp;
                break;
            }
        }
        System.out.println("=== data yang baru ditambah ===");
        viewData(kp);

    }

    @Override
    public void readData() {

    }

    public void viewData(KaryawanPhb kp) {
        System.out.println(kp.getNip());
        System.out.println(kp.getNama());
        System.out.println(kp.getUnit());
        System.out.println(kp.getTahunMasuk());

    }

    @Override
    public void updateData(String nip) {
        KaryawanPhb kar = null;
        for (KaryawanPhb k : karyawan) {
            if (k != null && nip.equalsIgnoreCase(k.getNip())) {
                kar = k;
                Scanner edit = new Scanner(System.in);
                System.out.println("Masukan Nip");
                String editNip = edit.next();
                System.out.println("Masukan Nama");
                String editNama = edit.next();
                System.out.println("Masukan Unit");
                String editUnit = edit.next();
                System.out.println("Masukan Tahun Masuk");
                int editTahun = edit.nextInt();

                kar.setNip(editNip);
                kar.setNama(editNama);
                kar.setUnit(editUnit);
                kar.setTahunMasuk(editTahun);

                System.out.println("=== data yang setelah diubah ===");
                viewData(kar);
            }
        }
    }

    @Override
    public void deleteData(String nip) {
        KaryawanPhb kar = null;
        
        viewData(kar);
    }

    @Override
    public void searchByNip(String nip) {
        KaryawanPhb kar = null;
        for (KaryawanPhb k : karyawan) {
            if (k != null && nip.equalsIgnoreCase(k.getNip())) {
                kar = k;
                break;
            }
        }
        viewData(kar);
    }

    @Override
    public void searchByNama(String nama) {
        KaryawanPhb kary = null;
        for (KaryawanPhb k : karyawan) {
            if (k != null && nama.equalsIgnoreCase(k.getNama())) {
                kary = k;
                break;
            }
        }
        viewData(kary);
    }

}
