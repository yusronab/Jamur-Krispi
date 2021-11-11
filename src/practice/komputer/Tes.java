package practice.komputer;

import javax.swing.JOptionPane;

public class Tes {
    public static void main(String[] args) {
        DataKomputer data = new DataKomputer();
        do{
            int p = data.pilihanMenu();
            switch(p){
                case AppInterface.ADD_DATA_KOMPUTER -> {
                    data.add();
                }
                case AppInterface.SEARCH_BY_BRAND -> {
                    String key = data.keyword("brand");
                    Komputer kom = data.searchByBrand(key);
                    data.viewData(kom);
                }
                case AppInterface.SEARCH_BY_MODEL -> {
                    String key = data.keyword("model");
                    Komputer kom = data.searchByModel(key);
                    data.viewData(kom);
                }
                case AppInterface.EXIT -> {
                    data.exit();
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Pilihan Salah");
                }
            }
        }while(true);
    }
}
