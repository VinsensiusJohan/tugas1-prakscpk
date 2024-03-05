public class ProgramTumbuhan {
    public static void main(String[] args) {

        Tumbuhan tumbuhan = new Tumbuhan("Mawar", "Bunga");
        System.out.println("Data awal  ");
        System.out.println("Nama Tumbuhan  : " + tumbuhan.getNama());
        System.out.println("Jenis Tumbuhan : " + tumbuhan.getJenis());
        tumbuhan.settnama("Paku Sejati");
        tumbuhan.setjenis("Paku-pakuan");

        System.out.println("\nSetelah data di overwrite ");
        System.out.println("Nama Tumbuhan  : " + tumbuhan.getNama());
        System.out.println("Jenis Tumbuhan : " + tumbuhan.getJenis());

        Pohon pohon = new Pohon("Apel","Buah-buahan",5);
        System.out.println("\nData awal ");
        System.out.println("Nama Pohon   : " + pohon.getNama());
        System.out.println("Jenis Pohon  : " + pohon.getJenis());
        pohon.tumbuh();
        pohon.settnama("Jati");
        pohon.setjenis("Kayu");
        pohon.setTinggi(45);

        System.out.println("\nData setelah di overwrite ");
        System.out.println("Nama Pohon   : " + pohon.getNama());
        System.out.println("Jenis Pohon  : " + pohon.getJenis());
        pohon.tumbuh();

    }
    
}
