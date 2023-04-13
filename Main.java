package modul4strukdat.latihan1;

public class Main {

    String nama, kelas, matkulPraktikum;

    int nim;

    public Main(String nm, String kl, String mat, int ni) {
        nama = nm;
        kelas = kl;
        matkulPraktikum = mat;
        nim = ni;
        
    }
    public static void main(string[] args){
        scanner in = new scanner (system.in);
        Hashpmap<String, Mahasiswa> mhs = new Hashmap<>();
        String input;
        Mahasiswa data;
        
        mhs.put("1", new Mahasiswa(nm)"putri", kl "3H" , mat "struktur Data", ni 2020000));
        mhs.put("2", new Mahasiswa(nm)"agus", kl"3A", mat "Matematika", ni 2020012));
        mhs.put("3", new Mahasiswa(nm)"arro", kl"3D", mat "Pemrograman",ni 2020017));
        
        System.out.println("Masukan ID:");
        input = in.nextLine();
        data = mhs.get(input);
        if (data != null){
            System.out.println("Data Mahasiswa : " + data.nama + ", kelas :" + 
                    data.kelas +", mata kuliah praktikum :" + data.matkulPraktikum +
                    ",nim :" + data.nim);
        }
    }
}