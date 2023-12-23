package Database;

public class Struk {
    private int idStruk;
    private Kamar kamar;
    private int hargaJual;
    private int jumlahPesan;
    private int subTotal;
    private int jumlahHari;

    public void setIdStruk(int idStruk) {
        this.idStruk = idStruk;
    }

    public int getIdStruk() {
        return this.idStruk;
    }

    public void setKamar(Kamar kamar) {
        this.kamar = kamar;
    }

    public Kamar getKamar() {
        return this.kamar;
    }

    public int getHargaJual() {
        return hargaJual;
    }

    public void setHargaJual(int hargaJual) {
        this.hargaJual = hargaJual;
    }

    public int getJumlahPesan() {
        return jumlahPesan;
    }

    public void setJumlahPesan(int jumlahPesan) {
        this.jumlahPesan = jumlahPesan;
    }

    public int getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(int subTotal) {
        this.subTotal = subTotal;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    public int getJumlahHari() {
        return this.jumlahHari;
    }

}
