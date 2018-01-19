import java.util.Scanner;

class Menu {
    int menu;
    Maba maba = new Maba();
    Mahasiswa maha = new Mahasiswa();
    Perwalian perwalian = new Perwalian();
    Scanner input = new Scanner (System.in);
    void pilihmenu(){
        System.out.println(""); 
        System.out.println("-----------------------------------------");
        System.out.println("Menu : ");
        System.out.println("-----------------------------------------");
        System.out.println("1. PMB");
        System.out.println("2. Perwalian");
        System.out.println("0. Exit");
        System.out.print("Masukan Pilihan : ");
        menu = input.nextInt();
        System.out.println("");
        switch(menu){
            case 1 :
                int loopmaba = 1;
                while(loopmaba == 1){
                    System.out.println("");
                    System.out.println("-----------------------------------------");
                    System.out.println("Menu Maba : ");
                    System.out.println("-----------------------------------------");
                    System.out.println("1. Registrasi");
                    System.out.println("2. Lihat Data Calon Maba");
                    System.out.println("3. Input Hasil Tes");
                    System.out.println("4. Pembayaran");
                    System.out.println("5. Generate NIM");
                    System.out.println("9. Kembali ke Main Menu");
                    System.out.println("0. Exit");
                    System.out.print("Masukan Pilihan : ");
                    menu = input.nextInt();
                    System.out.println("");
                    switch(menu){
                        case 1 :
                            maba.registrasi();
                            break;
                        case 2 :
                            maba.tampilcalon();
                            break;
                        case 3 :
                            maba.inputtes();
                            break;
                        case 4 :
                            maba.paid();
                            break;
                        case 5 :
                            maha.getnim();
                            break;
                        case 9 :
                            loopmaba = 0;
                            break;
                        case 0 :
                            System.exit(0);
                            break;
                        default :
                            System.out.println("Tidak Ada Dalam Menu !!");
                    }
                }
                // System.out.println("Menu ini belum tersedia !!");
                pilihmenu();
                break;
            case 2 :
                int loopwali = 1;
                while(loopwali == 1){
                    System.out.println("");
                    System.out.println("-----------------------------------------");
                    System.out.println("Menu Perwalian : ");
                    System.out.println("-----------------------------------------");
                    System.out.println("1. Lihat Data Mahasiswa");
                    System.out.println("2. Administrasi");
                    System.out.println("3. Konfirmasi Perwalian");
                    System.out.println("9. Kembali ke Main Menu");
                    System.out.println("0. Exit");
                    System.out.print("Masukan Pilihan : ");
                    menu = input.nextInt();
                    System.out.println("");
                    switch(menu){
                        case 1 :
                            perwalian.tampilmahasiswa();
                            break;
                        case 2 :
                            perwalian.administrasi();
                            break;
                        case 3 :
                            perwalian.konfirmasiwali();
                            break;
                        case 9 :
                            loopwali = 0;
                            break;
                        case 0 :
                            System.exit(0);
                            break;
                        default :
                            System.out.println("Tidak Ada Dalam Menu !!");
                    }
                }
                // System.out.println("Menu ini belum tersedia !!");
                pilihmenu();
                break;
            case 0 :
                System.exit(0);
                break;
            default :
                System.out.println("Tidak Ada Dalam Menu !!");
                pilihmenu();
        }
    }
    
}