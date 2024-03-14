public class Course {
    private String judul;
    private String deskripsi;
    private String namaPengajar;
    private String level;
    private double harga;

    // Constructor
    public Course(String judul, String deskripsi, String namaPengajar, String level, double harga) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.namaPengajar = namaPengajar;
        this.level = level;
        this.harga = harga;
    }

    // Setter dan Getter untuk setiap atribut
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getNamaPengajar() {
        return namaPengajar;
    }

    public void setNamaPengajar(String namaPengajar) {
        this.namaPengajar = namaPengajar;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Method untuk mendapatkan informasi kursus
    public void getInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Deskripsi: " + deskripsi);
        System.out.println("Nama Pengajar: " + namaPengajar);
        System.out.println("Level: " + level);
        System.out.println("Harga: " + harga);
    }
}
