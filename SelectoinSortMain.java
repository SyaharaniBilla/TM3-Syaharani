import Model.SelectionSort;

public class SelectoinSortMain {
    
    public static void main(String[] args) {
        String[] namaAcak = {"BIlla", "Reno", "Anin", "Ayu", "Citra", "Linda"};

        System.out.println("Data asli :");

        for (int i = 0; i<namaAcak.length;i++) {
            System.out.print(namaAcak[i]+ ",");
        }
        System.out.println("");

        SelectionSort seleksi = new SelectionSort();
        seleksi.setData(namaAcak);
        seleksi.pengurutanData();
        seleksi.cetakData();    
    }
}