package app;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.EmptyBorder;

public class DataMahasiswa {
    static final int TAMBAH_DATA = 1;
    static final int LIHAT_DATA = 2;
    static final int KELUAR = 3;
    static final Logger LOGGER = Logger.getLogger(DataMahasiswa.class.getName());
    static final Mahasiswa[] mhs = new Mahasiswa[10];
    
    public void setUpLogger(){
        try {
            FileHandler fh = new FileHandler("app-activity.log");
            LOGGER.addHandler(fh);
            fh.setLevel(Level.ALL);
            LOGGER.setLevel(Level.ALL);
            LOGGER.info("Memulai menyiapkan file log");
        }catch (IOException | SecurityException e){
            LOGGER.log(Level.SEVERE, "error",e);
        }finally {
            LOGGER.info("File log telah siap");
        }
    }
    public void showMenu(){
        int pilihanMenu = menu();
        switch(pilihanMenu){
            case TAMBAH_DATA:
                add();
                break;
            case LIHAT_DATA:
                view();
                break;
            case KELUAR:
                exit();
                break;
            default:
                exit();
                break;
        }   
    }
    public int menu(){
        try {
            Object[] opsi = {TAMBAH_DATA, LIHAT_DATA, KELUAR};
            Object p = JOptionPane.showInputDialog(null, ""
                + "<html>"
                + "===== Pilihan ====<br>"
                + "1 = Tambah Data Mahasiswa<br>"
                + "2 = Lihat Data<br>"
                + "3 = Keluar Aplikasi<br>"
                + "====================="
                + "<strong>Plilihan Anda: </strong>"
                + "</html>", "Menu Pilihan", JOptionPane.QUESTION_MESSAGE, null, opsi, opsi[0]);
            int pilihan = Integer.parseInt(""+p);
            return pilihan;
        }catch (HeadlessException | NumberFormatException e){
            return 0;
        }
    }
    public void add(){
        LOGGER.info("Memilih menu tambahkan data Mahasiswa");
        JDialog f = new JDialog(new Frame());
        f.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        f.setSize(300, 200);
        f.setLayout(new GridLayout(0, 2));
        
        final JLabel labelNim = new JLabel("NIM");
        labelNim.setBorder(new EmptyBorder(0, 15, 0, 0));
        final JTextField fNim = new JTextField();
        f.add(labelNim);
        f.add(fNim);
        
        final JLabel labelNama = new JLabel("NAMA");
        labelNama.setBorder(new EmptyBorder(0, 15, 0, 0));
        final JTextField fNama = new JTextField();
        f.add(labelNama);
        f.add(fNama);
        
        JButton simpan = new JButton ("Simpan Data");
        simpan.addActionListener((ActionEvent e) -> {
            try {
                Mahasiswa m = new Mahasiswa();
                String tNim = fNim.getText();
                String sNim = tNim.isEmpty() ? "0" : tNim;
                int nim = Integer.parseInt(sNim);
                m.setNim(nim);
                m.setNama(fNama.getText());
                for(int i = 0; i<mhs.length; i++){
                    if(mhs[i] == null){
                        mhs[i] = m;
                        break;
                    }
                }
                LOGGER.info("Data Mahasiswa berhasil disimpan");
                f.dispose();
                showMenu();
            }catch (NumberFormatException error){
                LOGGER.log(Level.SEVERE, "error", error);
            }
        });
        f.add(simpan);
        JButton batal = new JButton("Batal");
        batal.addActionListener((ActionEvent event) -> {
            f.dispose();
            showMenu();
        });
        f.add(batal);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void view(){
        LOGGER.info("Memilih menu lihat data Mahasiswa");
        JDialog d = new JDialog(new Frame(), "Data Mahasiswa");
        d.setSize(400, 400);
        d.addWindowListener(new java.awt.event.WindowAdapter(){
            @Override
            public void windowClosing(java.awt.event.WindowEvent e){
                d.dispose();
                showMenu();
            }
        });
        JTextArea area = new JTextArea();
        area.setEditable(false);
        int i = 1;
        for (Mahasiswa m: mhs){
            if (m != null){
                area.append("Data ke: "+i+"\n");
                area.append(m.toString()+"\n");
                i++;
            }
        }
        d.add(new JScrollPane(area));
        d.setLocationRelativeTo(null);
        d.setVisible(true);
    }
    public void exit(){
        LOGGER.info("menutup aplikasi");
        System.exit(0);
    }
}
