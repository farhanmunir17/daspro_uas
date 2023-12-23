package Database;

import java.util.ArrayList;

public class Strukfix extends Struk {
    private int idPesanan;
    private Customer customer;
    private Customer emailCustomer;
    private int total;
    private ArrayList<Struk> Ostruk;

    public Strukfix setIdpesanan(int idPesanan) {
        this.idPesanan = idPesanan;
        return this;
    }

    public int getIdpesanan() {
        return idPesanan;
    }

    public Strukfix setCustomer(Customer customer) {
        this.customer = customer;
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Strukfix setEmailCustomer(Customer emailCustomer) {
        this.emailCustomer = emailCustomer;
        return this;
    }

    public Customer getEmailCustomer() {
        return emailCustomer;
    }

    public Strukfix setTotal(int total) {
        this.total = total;
        return this;
    }

    public int getTotal() {
        return total;
    }

    public Strukfix setDetilPenjualans(ArrayList<Struk> Ostruk) {
        this.Ostruk = Ostruk;
        return this;
    }

    public ArrayList<Struk> getStruks() {
        return Ostruk;
    }

}
