package practice.komputer;

import javax.swing.JOptionPane;

public class DataKomputer implements AppInterface{
    private final Komputer[] komputer;
    
    public DataKomputer(){
        komputer = new Komputer[100];
    }    
    @Override
    public int pilihanMenu() {
        String display = JOptionPane.showInputDialog(null, ""
                + "<html>"
                + "===== Menu =====<br>"
                + "1 &rarr; Tambah Data Komputer<br>"
                + "2 &rarr; Cari Berdasarkan Brand<br>"
                + "3 &rarr; Cari Berdasarkan Model<br>"
                + "4 &rarr; Keluar Aplikasi<br>"
                + "==================<br>"
                + "<b>Ketik Pilihan Anda:</b>"
                + "</html>","Menu Pilihan", JOptionPane.QUESTION_MESSAGE);
        int pilihan = Integer.parseInt(display);
        return pilihan;
    }

    @Override
    public void add() {
        Komputer kom = new Komputer();
        String brand = JOptionPane.showInputDialog(null, "Ketik Brand:", ""+"Brand", JOptionPane.QUESTION_MESSAGE);
        String model = JOptionPane.showInputDialog(null, "Ketik Model:", ""+"Model", JOptionPane.QUESTION_MESSAGE);
        String disk = JOptionPane.showInputDialog(null, "Tipe Disk (SSD/Hardisk):", ""+"Tipe Disk", JOptionPane.QUESTION_MESSAGE);
        String size = JOptionPane.showInputDialog(null, "Kapasitas Disk (Angka):", ""+"Kapasitas Disk (Dalam GB)", JOptionPane.QUESTION_MESSAGE);
        int diskSize = Integer.parseInt(size);
        String ram = JOptionPane.showInputDialog(null, "Kapasitas RAM (Angka):", ""+"Kapasitas RAM (Dalam GB)", JOptionPane.QUESTION_MESSAGE);
        int ramSize = Integer.parseInt(ram);
        
        kom.setBrand(brand);
        kom.setModel(model);
        kom.setDisk(disk);
        kom.setDiskSize(diskSize);
        kom.setRam(ramSize);
        
        for(int i=0; i<komputer.length; i++){
            if(komputer[i] == null){
                komputer[i] = kom;
                break;
            }
        }
        viewData(kom);
    }

    @Override
    public String keyword(String type) {
        String key = JOptionPane.showInputDialog(null, "Ketik"+type+" Komputer"+type, JOptionPane.QUESTION_MESSAGE);
        return key;
    }

    @Override
    public Komputer searchByBrand(String brand) {
        Komputer kom = null;
        for(Komputer k: komputer){
            if(k != null && brand.equalsIgnoreCase(k.getBrand())){
                kom = k;
                break;
            }
        }
        return kom;
    }

    @Override
    public Komputer searchByModel(String model) {
        Komputer kom = null;
        for(Komputer k: komputer){
            if(k != null && model.equalsIgnoreCase(k.getModel())){
                kom = k;
                break;
            }
        }
        return kom;
    }

    @Override
    public void viewData(Komputer k) {
        if(k == null){
            JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan");
        }
        else{
            JOptionPane.showMessageDialog(null,
                    "Brand\t\t: "+k.getBrand()+
                    "\nModel\t\t: "+k.getModel()+
                    "\nDisk Type\t\t: "+k.getDisk()+
                    "\nDisk Size\t\t: "+k.getDiskSize()+
                    "\nRAM\t\t: "+k.getRam(), "Data Komputer", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    @Override
    public void exit() {
        System.exit(0);
    }
    
}
