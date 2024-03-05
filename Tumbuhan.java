public class Tumbuhan {
    private String nama;
    private String jenis;

    Tumbuhan(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }

    public String getNama(){
    return nama;
    }

    public String getJenis(){
        return jenis;
    }

    public void settnama(String nama){
        this.nama = nama;
    }

    public void setjenis(String jenis){
        this.jenis = jenis;
    }
}