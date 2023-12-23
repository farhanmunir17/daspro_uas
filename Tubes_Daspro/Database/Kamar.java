package Database;

public class Kamar {
    private int idKamar;
    private String jenis;
    private String fasilitas;
    private int harga;
    private int jumlahKamar;

    public Kamar setIdKamar(int idKamar) {
        this.idKamar = idKamar;
        return this;
    }

    public Kamar setJenisKamar(String jenis) {
        this.jenis = jenis;
        return this;
    }

    public Kamar setfasilitas(String fasilitas) {
        this.fasilitas = fasilitas;
        return this;
    }

    public Kamar setharga(int harga) {
        this.harga = harga;
        return this;
    }

    public Kamar setJumlahKamar(int jumlahKamar) {
        this.jumlahKamar = jumlahKamar;
        return this;
    }

    public int getIdKamar() {
        return idKamar;
    }

    public String getJenisKamar() {
        return jenis;
    }

    public String getfasilitas() {
        return fasilitas;
    }

    public int getharga() {
        return harga;
    }

    public int getJumlahKamar() {
        return jumlahKamar;
    }

}
