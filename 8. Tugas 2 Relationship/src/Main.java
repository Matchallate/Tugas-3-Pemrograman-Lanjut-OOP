public class Main {
    public static void main(String[] args) {
        MataKuliah statistika  = new MataKuliah("MK001", "Statistika");
        MataKuliah bisnis      = new MataKuliah("MK002", "Permodelan Bisnis");
        MataKuliah pemrograman = new MataKuliah("MK003", "Pemrograman lanjut");

        Mahasiswa andi = new Mahasiswa("231111111143", "Andin Afit Pradana", 
                            new MataKuliah[]{statistika, bisnis, pemrograman}, 
                            new int[]{70, 85, 40});
        
        Mahasiswa mega = new Mahasiswa("34111119198", "Megawati Putri", 
                            new MataKuliah[]{statistika, bisnis, pemrograman}, 
                            new int[]{98, 95, 92});

        Mahasiswa Latif = new Mahasiswa("137111193", "latifatul Khairi", 
                            new MataKuliah[]{statistika, bisnis, pemrograman}, 
                            new int[]{68, 90, 40});

        andi.cetakKHS();
        System.out.println();
        mega.cetakKHS();
        System.out.println();
        Latif.cetakKHS();
    }
}
