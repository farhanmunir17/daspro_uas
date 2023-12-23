package Database;

public class Customer extends User {
    private int idcus;

    public Customer setIdcus(int idcus) {
        this.idcus = idcus;
        return this;
    }

    public int getIdcus() {
        return this.idcus;
    }
}
