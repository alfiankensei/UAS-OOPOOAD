import java.util.Scanner;

class Maba {
	static int noreg;
    static String[][] calonmaba = new String[30][9];
    Scanner input = new Scanner (System.in);

	void registrasi(){
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Input Calon Maba");
        System.out.println("-----------------------------------------");
        System.out.println("");

        noreg = noreg + 1;
		System.out.println ("No Registrasi : " + noreg);
        calonmaba[noreg][0] = String.valueOf(noreg);	
        System.out.print ("Nama : ");
		calonmaba[noreg][1] = input.nextLine();
        if(calonmaba[noreg][1].isEmpty()){
		    calonmaba[noreg][1] = input.nextLine();
        }
		System.out.print ("Email : ");
		calonmaba[noreg][2] = input.nextLine();
		System.out.print ("Alamat : ");
		calonmaba[noreg][3] = input.nextLine();
		System.out.print ("Telp : ");
		calonmaba[noreg][4] = input.nextLine();
		System.out.print ("Jurusan : ");
		calonmaba[noreg][5] = input.nextLine();
        calonmaba[noreg][6] = "Belum Tes";
        calonmaba[noreg][7] = "Belum";
        calonmaba[noreg][8] = "0";

        
		System.out.println ("");
		System.out.println ("Data Berhasil Tersimpan");
	}

	void tampilcalon(){
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Daftar Calon Maba");
        System.out.println("-----------------------------------------");
        for(int bar = 1; bar <= noreg; bar++){
            System.out.println("");
            System.out.println("No Registrasi : " + calonmaba[bar][0]);
            System.out.println("Nama          : " + calonmaba[bar][1]);
            System.out.println("Email         : " + calonmaba[bar][2]);
            System.out.println("Alamat        : " + calonmaba[bar][3]);
            System.out.println("No Telepon    : " + calonmaba[bar][4]);
            System.out.println("Jurusan       : " + calonmaba[bar][5]);
            System.out.println("Hasil Tes     : " + calonmaba[bar][6]);
            System.out.println("Pembayaran    : " + calonmaba[bar][7]);
        }
	}

    void inputtes(){

        int nomor,nilai;
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Input Nilai Calon Maba");
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.print ("Masukan Nomor Registrasi : ");
		nomor = input.nextInt();
        if(nomor <= noreg){
            if(calonmaba[nomor][6] == "Belum Tes"){
                System.out.println("No Registrasi : " + calonmaba[nomor][0]);
                System.out.println("Nama          : " + calonmaba[nomor][1]);
                System.out.println("Alamat        : " + calonmaba[nomor][3]);

                System.out.print ("Masukan Nilai Tes : ");
                nilai = input.nextInt();
                if(nilai >= 70){
                    System.out.println ("Anda Lulus Tes");
                    calonmaba[nomor][6] = "Lulus";
                }else{
                    System.out.println ("Anda Tidak Lulus Tes");
                    calonmaba[nomor][6] = "Tidak Lulus";
                }
            }else{
                System.out.println ("Mahasiswa Tersebut Sudah Memiliki Hasil Tes");    
            }
        }else{
            System.out.println ("Nomor Tidak Terdaftar");
        }
	}

    void paid(){
        int nomor;
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Pembayaran");
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.print ("Masukan Nomor Registrasi : ");
		nomor = input.nextInt();
        if(nomor <= noreg){
            if(calonmaba[nomor][6] == "Lulus" && calonmaba[nomor][7] == "Belum"){
                System.out.println("No Registrasi : " + calonmaba[nomor][0]);
                System.out.println("Nama          : " + calonmaba[nomor][1]);
                System.out.println("Alamat        : " + calonmaba[nomor][3]);
                
                String yesno;
                System.out.print ("Tekan 'Y' Untuk Konfirmasi Pembayaran? : ");
                yesno = input.nextLine();
                if(yesno.isEmpty()){
                    yesno = input.nextLine();
                }
                if((yesno.equalsIgnoreCase("Y")) || (yesno.equalsIgnoreCase("y"))){
                    System.out.println ("Sukses Melakukan Pembayaran");
                    calonmaba[nomor][7] = "Bayar";
                }else{
                    System.out.println ("Pembayaran Dibatalkan");
                }
            }else{
                System.out.println ("Calon Tidak Diperkenankan Untuk Melakukan Pembayaran");                
            }
        }else{
            System.out.println ("Nomor Tidak Terdaftar");
        }
	}

}