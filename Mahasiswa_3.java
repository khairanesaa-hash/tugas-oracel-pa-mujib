import java.util.Date;

// Sesuaikan nama class agar sama dengan nama file: Mahasiswa_3
public class Mahasiswa_3 extends Person{
    // Variable instance yang bersifat private (Enkapsulasi)
    private String nim;
    private double ipk;
    private String jurusan;
    private String gelar; // Sarjana, Magister, Doktor
    private int tahunKelulusan;

    // Constructor disesuaikan menjadi Mahasiswa_3
    public Mahasiswa_3(String firstName, String middleName, String lastName, Date dateOfBirth, 
                   String nim, String jurusan, String gelar, int tahunKelulusan) {
        super(firstName, middleName, lastName, dateOfBirth);
        this.nim = nim;
        this.jurusan = jurusan;
        this.gelar = gelar;
        this.tahunKelulusan = tahunKelulusan;
        this.ipk = 0.0;
    }

    // Accessor (Getter)
    public String getNim() { return nim; }
    public double getIpk() { return ipk; }
    public String getJurusan() { return jurusan; }
    public String getGelar() { return gelar; }
    public int getTahunKelulusan() { return tahunKelulusan; }

    // Mutator (Setter) untuk mengubah jurusan mahasiswa
    public void setJurusan(String jurusanBaru) {
        this.jurusan = jurusanBaru;
    }

    // Method menghitung IPK berdasarkan array nilai huruf
    public double hitungIPK(String[] daftarNilai) {
        if (daftarNilai == null || daftarNilai.length == 0) return 0.0;
        
        double totalPoin = 0;
        for (String nilai : daftarNilai) {
            totalPoin += konversiNilaiKePoin(nilai);
        }
        this.ipk = totalPoin / daftarNilai.length;
        return this.ipk;
    }

    // Helper method konversi nilai huruf ke poin angka
    private double konversiNilaiKePoin(String nilai) {
        switch (nilai.toUpperCase()) {
            case "A":  return 4.0;
            case "A-": return 3.67;
            case "B+": return 3.33;
            case "B":  return 3.0;
            case "B-": return 2.67;
            case "C+": return 2.33;
            case "C":  return 2.0;
            case "D":  return 1.0;
            default:   return 0.0;
        }
    }
}