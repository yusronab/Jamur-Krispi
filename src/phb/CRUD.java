package phb;
public interface CRUD {
    
    final int ADD_DATA_KOMPUTER = 1;
    final int SEARCH_BY_BRAND = 2;
    final int SEARCH_BY_MODEL = 3;
    final int EXIT = 4;
    
    public void createData();
    public void readData();
    public void updateData(String nip);
    public void deleteData(String nip);
}
