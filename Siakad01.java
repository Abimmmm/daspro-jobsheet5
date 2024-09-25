import java.util.Scanner;

public class Siakad01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.print("Masukan Nama: ");
        nama = sc.nextLine();
        System.out.print("Masukan NIM: ");
        nim = sc.nextLine();
        System.out.print("Masukan kelas: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Masukan nomor absen: ");
        absen = sc.nextByte();
        System.out.print("Masukan nilai kuis: ");
        nilaiKuis = sc.nextDouble();
        System.out.print("Masukan nilai tugas: ");
        nilaiTugas = sc.nextDouble();
        System.out.print("Masukan nilai Ujian: ");
        nilaiUjian = sc.nextDouble();

        nilaiAkhir = (nilaiKuis * 0.20) + (nilaiTugas * 0.15) + (nilaiUjian * 0.65);

        System.out.println("Nilai Tugas: " + nilaiUjian);
        System.out.println("Nilai Kuis: " + nilaiUjian);
        System.out.println("Nilai Ujian: " + nilaiUjian);
        System.out.println(
                "Mahasiswa dengan nama " + nama + " (NIM " + nim + ")" + " Kelas " + kelas + " nomor absen " + absen);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        if (nilaiAkhir > 80) {
            System.out.println("Nilai akhir Anda : A");
            System.out.println("Kualisifikasi : Sangat Baik");
        } else if (nilaiAkhir > 73) {
            System.out.println("Nilai akhir Anda : B+");
            System.out.println("Kualisifikasi : Lebih dari Baik");
        } else if (nilaiAkhir > 65) {
            System.out.println("Nilai akhir Anda : B");
            System.out.println("Kualisifikasi : Baik");
        } else if (nilaiAkhir > 60) {
            System.out.println("Nilai akhir Anda : C+");
            System.out.println("Kualisifikasi : Lebih dari Cukup");
        } else if (nilaiAkhir > 50) {
            System.out.println("Nilai akhir Anda : C");
            System.out.println("Kualisifikasi : Cukup");
        } else if (nilaiAkhir > 39) {
            System.out.println("Nilai akhir Anda : D");
            System.out.println("Kualisifikasi : Kurang");
        } else {
            System.out.println("Nilai akhir Anda : E");
            System.out.println("Kualisifikasi : Gagal");
        }

    }
}