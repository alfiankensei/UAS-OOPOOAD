import java.util.Scanner;

class Perwalian {
    Mahasiswa maha = new Mahasiswa();
    Scanner input = new Scanner (System.in);
    void tampilmahasiswa(){
        maha.tampilmaba();
    }

    void administrasi(){
        int nomor;
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Administrasi Perwalian");
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.print ("Masukan NIM : ");
		nomor = input.nextInt();
        if(nomor <= maha.nim && nomor > 17000000){
            nomor = nomor - 17000000;
            if(maha.listmaba[nomor][6] == "Belum"){
                System.out.println("No Registrasi : " + maha.listmaba[nomor][0]);
                System.out.println("Nama          : " + maha.listmaba[nomor][1]);
                System.out.println("Alamat        : " + maha.listmaba[nomor][3]);
                
                String yesno;
                System.out.print ("Tekan 'Y' Untuk Konfirmasi Pembayaran? : ");
                yesno = input.nextLine();
                if(yesno.isEmpty()){
                    yesno = input.nextLine();
                }
                if((yesno.equalsIgnoreCase("Y")) || (yesno.equalsIgnoreCase("y"))){
                    System.out.println ("Sukses Melakukan Pembayaran");
                    System.out.println ("Mahasiswa Mendapatkan Kartu Rencana Studi");
                    maha.listmaba[nomor][6] = "Bayar";
                }else{
                    System.out.println ("Pembayaran Dibatalkan");
                }
            }else{
                System.out.println ("Mahasiswa Sudah Melakukan Pembayaran");                
            }
        }else{
            System.out.println ("Nomor Tidak Terdaftar");
        }
	}

    void konfirmasiwali(){
        int nomor;
        System.out.println("");
        System.out.println("-----------------------------------------");
        System.out.println("Konfirmasi Pewalian");
        System.out.println("-----------------------------------------");
        System.out.println("");
        
        System.out.print ("Masukan NIM : ");
		nomor = input.nextInt();
        if(nomor <= maha.nim && nomor > 17000000){
            nomor = nomor - 17000000;
            if(maha.listmaba[nomor][6] == "Bayar"){
                if(maha.listmaba[nomor][7] == "Belum"){
                    System.out.println("");
                    System.out.println("No Registrasi : " + maha.listmaba[nomor][0]);
                    System.out.println("Nama          : " + maha.listmaba[nomor][1]);
                    System.out.println("Alamat        : " + maha.listmaba[nomor][3]);
                    
                    String yesno;
                    System.out.print ("Tekan 'Y' Untuk Konfirmasi Perwalian? : ");
                    yesno = input.nextLine();
                    if(yesno.isEmpty()){
                        yesno = input.nextLine();
                    }
                    if((yesno.equalsIgnoreCase("Y")) || (yesno.equalsIgnoreCase("y"))){
                        System.out.println ("Anda Sudah Menyelesaikan Perwalian");
                        System.out.println ("KRS Sudah Tervalidasi");
                        maha.listmaba[nomor][7] = "Sudah";
                    }else{
                        System.out.println ("KRS Belum Tervalidasi");
                    }
                }else{
                    System.out.println ("Mahasiswa Sudah Melakukan Perwalian");
                }
            }else{
                System.out.println ("Mahasiswa Belum Melakukan Pembayaran");                
            }
        }else{
            System.out.println ("NIM Tidak Terdaftar");
        }
	}
}