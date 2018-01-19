import java.util.Scanner;

class Mahasiswa extends Maba{
    
    static int nim = 17000000;
    static int idmaba = 0;
    static String[][] listmaba = new String[30][8];
    void tampilmaba(){
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Daftar Mahasiswa Baru");
        System.out.println("-----------------------------------------");
        if (nim == 17000000){
            System.out.println("");
            System.out.println("Belum Ada Data Mahasiswa");
        }else{
            
            for(int bar = 1; bar + 17000000 <= nim; bar++){
                System.out.println("");
                System.out.println("NIM           : " + listmaba[bar][0]);
                System.out.println("Nama          : " + listmaba[bar][1]);
                System.out.println("Email         : " + listmaba[bar][2]);
                System.out.println("Alamat        : " + listmaba[bar][3]);
                System.out.println("No Telepon    : " + listmaba[bar][4]);
                System.out.println("Jurusan       : " + listmaba[bar][5]);
                System.out.println("Administrasi  : " + listmaba[bar][6]);
                System.out.println("Perwalian     : " + listmaba[bar][7]);
            }
        }
	}

    void getnim(){
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Generate NIM Maba");
        System.out.println("-----------------------------------------");
        if (super.noreg > nim - 17000000){
            for(int bar = 1; bar <= super.noreg; bar++){
                if(super.calonmaba[bar][7].equalsIgnoreCase("Bayar") && super.calonmaba[bar][8].equalsIgnoreCase("0")){
                    idmaba++;
                    nim++;
                    
                    listmaba[idmaba][0] = String.valueOf(nim);
                    listmaba[idmaba][1] = super.calonmaba[bar][1];
                    listmaba[idmaba][2] = super.calonmaba[bar][2];
                    listmaba[idmaba][3] = super.calonmaba[bar][3];
                    listmaba[idmaba][4] = super.calonmaba[bar][4];
                    listmaba[idmaba][5] = super.calonmaba[bar][5];
                    listmaba[idmaba][6] = "Belum";
                    listmaba[idmaba][7] = "Belum";

                    super.calonmaba[bar][8] = "1";
                    System.out.println("");
                    System.out.println("NIM           : " + listmaba[idmaba][0]);
                    System.out.println("Nama          : " + listmaba[idmaba][1]);
                }else if(super.calonmaba[bar][6].equalsIgnoreCase("Lulus") && super.calonmaba[bar][8].equalsIgnoreCase("0")){
                    System.out.println("");
                    System.out.println("Mahasiswa Belum Melakukan Pembayaran");
                }
            }
        }else{
            System.out.println("");
            System.out.println("Tidak Ada Mahasiswa Baru");
        }
        
        if(super.noreg == 0){
            System.out.println("");
            System.out.println("Tidak Ada Mahasiswa Baru");
        }
        System.out.println("");
        System.out.println("Selesai Generate NIM");
	}
}