public class Mahasiswa {
    String nim;
    String nama;
    MataKuliah[] mataKuliahList;
    int[] nilai;

    public Mahasiswa(String nim, String nama, MataKuliah[] mataKuliahList, int[] nilai) {
        this.nim = nim;
        this.nama = nama;
        this.mataKuliahList = mataKuliahList;
        this.nilai = nilai;
    }

    public void cetakKHS() {
        System.out.println("Mahasiswa: " + nim + " - " + nama);
        System.out.println("Nilai Mata Kuliah:");
        for (int i = 0; i < mataKuliahList.length; i++) {
            System.out.println("Mata Kuliah: " + mataKuliahList[i].namaMK);
            System.out.println("Nilai: " + nilai[i] + " (" + konversiNilaiKeHuruf(nilai[i]) + ")");
        }
    }

    private char konversiNilaiKeHuruf(int nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return 'A';
        } else if (nilai >= 60 && nilai < 80) {
            return 'B';
        } else if (nilai >= 50 && nilai < 60) {
            return 'C';
        } else if (nilai >= 40 && nilai < 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
