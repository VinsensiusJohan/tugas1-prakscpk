class Pohon extends Tumbuhan {
    private int tinggi;

    public Pohon(String nama, String jenis, int tinggi){
        super(nama, jenis);
        this.tinggi = tinggi;
    }
    public int getTinggi(){
        return tinggi;
    }

    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }

    public void tumbuh(){
        System.out.println("Pohon " + getNama() + " memiliki tinggi " + tinggi + " meter.");
    }
}
