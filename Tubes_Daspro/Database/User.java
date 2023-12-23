package Database;

public class User {
    private String nama;
    private String email;
    private String jenis_kelamin;

    public User setName(String nama) {
        this.nama = nama;
        return this;
    }

    public String getName() {
        return this.nama;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getEmail() {
        return this.email;
    }

    public User setKelamin(String jenis_kelamin) {
        this.jenis_kelamin = jenis_kelamin;
        return this;
    }

    public String getKelamin() {
        return this.jenis_kelamin;
    }
}
