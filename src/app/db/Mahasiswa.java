package app.db;

public class Mahasiswa {

    private String Nama;
    private String Tanggal;
    private String Jam;
    private String JumlahPulsa;
    private String Harga;
    private String Pembayaran;

    public Mahasiswa() {

    }

    public String getpembayaran() {
        return Pembayaran;
    }

    public void setpembayaran(String pembayaran) {
        this.Pembayaran = pembayaran;
    }

    public String getharga() {
        return Harga;
    }

    public void setharga(String harga) {
        this.Harga = harga;
    }

    public String getjumlahpulsa() {
        return JumlahPulsa;
    }

    public void setjumlahpulsa(String jumlahpulsa) {
        this.JumlahPulsa = jumlahpulsa;
    }

    public String getjam() {
        return Jam;
    }

    public void setjam(String jam) {
        this.Jam = jam;
    }

    public String gettanggal() {
        return Tanggal;
    }

    public void settanggal(String tanggal) {
        this.Tanggal = tanggal;
    }

    public String getnama() {
        return Nama;
    }

    public void setnama(String nama) {
        this.Nama = nama;
    }

}

