/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyek;

/**
 *
 * @author windows 10
 */

/*
Code by : 
Muhammad Lazuardi Timur
TI-1E
19
*/
import java.util.Scanner;
public class ProyekFix {
    static Scanner sc = new Scanner(System.in);
    static char kelas[] = {'A','B','C','D','E'};
    static String bangku[][] = {{"(01)","(02)","(03)","(04)","(05)"},{"(06)","(07)","(08)","(09)","(10)",},{"(11)","(12)","(13)","(14)","(15)"},
            {"(16)","(17)","(18)","(19)","(20)"},{"(21)","(22)","(23)","(24)","(25)"}};
    static int hargaBangku[]={30000,32500,35000,40000,42500};
    static int no[] = {1,2,3,4,5};
    static String Studio[]={"Studio-'1'", "Studio-'2'", "Studio-'1'", "Studio-'2'", "Studio-'1'"};
    static String daftarFilm[] = {"Fast and Furious 9", "The Spongebob Movie", "Now you see me 3", "Sonic the Hedgehog", "Avengers (Endgame)"};
    static String jamPenayangan [] = {"09.30-12.00", "10.00-12.00","12.30-14.30", "13.00-15.00", "16.30-18.30"};
    static int hargaFilm[] = {35000, 32000, 30000, 27500, 25000};
    static String jenisFilm[] = {"Action", "Comedy", "Mystery", "Comedy", "Action"};
    static String makanan[] = {"PopCorn Caramel", "French Fries", "Chicken Burger", "Cheese Hotdog", "Onion rings"};
    static String minuman[] = {"iced lychee", "Cappucino", "Hot Milo", "Milkshake", "Matcha Milk"};
    static int hargaSnacks[] = {22000,20000,18000,15000,17000};
    static int hargaminuman[] = {11000, 15000, 10000, 12000, 14000};
    static int bangkuu=0, hargabgku=0, hargaFlm=0, hasil, bayar, total, hasilll, hargaMakanan, hargaMinuman;
    static String namaFilm, jamPen,snacks, snacksMinum, genre, loc;
    
    public static void main(String[] args) {
        char jawab;
        do{
            for(int i = 1; i < no.length-1; i++){
            for (int l = 1; l < no.length-1; l++) {
                System.out.print("\t    ");
            }
            for(int j = no.length; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("\t\t-----SELAMAT DATANG DI CINEMAXXI-----");
        for (int i = 1; i < no.length-1; i++) {
            for (int j = 1; j < no.length-1; j++) {
                System.out.print("\t     ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = no.length-1; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
            System.out.println("\t\t=================================");
            System.out.println("\t\t 1. Pencarian");
            System.out.println("\t\t 2. Pemesanan Film");
            System.out.println("\t\t 3. Pemesanan Bangku");
            System.out.println("\t\t 4. Snacks & Minuman");
            System.out.println("\t\t 5. Struk");
            System.out.println("\t\t 6. Keluar");
            System.out.println("\t\t=================================\n");
            System.out.print("\t\tSilahkan Masukkan Pilihan Anda : ");
            int pilihan = sc.nextInt();
            System.out.println("");
            switch(pilihan){
                case 1 : 
                    System.out.println("\t\t\t---PENCARIAN---");
                    Pencarian();
                    break;
                case 2 :
                    System.out.println("\t\t\t\t\t\t---JADWAL FILM YANG SEDANG TAYANG---\n");
                    jadwal();
                    break;
                case 3 :
                    System.out.println("\t\t\t\t ---DAFTAR BANGKU---");
                    bangku();
                    break;
                case 4 :
                    System.out.println("\t\t\t---MAKANAN & MINUMAN---");
                    Snacks();
                    break;
                case 5 : 
                    Struk();
                    break;
                case 6 :
                    keluar();
                    break;
                default:
                    System.out.println("Error");
            }
            if(pilihan == 6 || pilihan == 5){
                jawab='t';
            }
            else{
                System.out.println("\t\t---------------------------------------------------");
                System.out.print("\t\tApakah anda ingin melanjutkan pembelian (y/t) : ");
                jawab=sc.next().charAt(0);
                System.out.println("\t\t---------------------------------------------------\n");
            }
        }
            while (jawab == 'y' || jawab == 'Y');
    }
//    FUNGSI PENCARIAN
    static void Pencarian(){
        char jwb;
        do{
            System.out.println("\t\t============================");
            System.out.println("\t\tApa yang ingin anda cari ?");
            System.out.println("\t\t 1. Daftar film");
            System.out.println("\t\t 2. Tempat duduk");
            System.out.println("\t\t 3. Daftar menu");
            System.out.println("\t\t 4. Keluar");
            System.out.println("\t\t--------------------------------------------");
            System.out.print("\t\t Masukkan yang ingin anda cari (1/2/3/4) : ");
            int pilih = sc.nextInt();
            System.out.println("\t\t--------------------------------------------\n");
            switch(pilih){
                case 1 :
                    dftrfilm();
                    break;
                case 2 : 
                    tmptduduk();
                    break;
                case 3 : 
                    dftrmenu();
                    break;
                case 4 :
                    main(Studio);
                    break;
                default:
                    System.out.println("Error!");
            }
            System.out.println("\t\t=========================================================");
            System.out.print("\t\tApakah anda ingin kembali ke menu pencarian (y/t): ");
            jwb = sc.next().charAt(0);
            System.out.println("\t\t=========================================================");
            
        }while (jwb == 'y' || jwb == 'Y');
        
    }
//    FUNGSI PENCARIAN DAFTAR FILM
    static void dftrfilm(){
        char jwbn;
        System.out.println("\t\t====================================================================================================================");
                for(int i = 0;i < no.length; i++){
                System.out.println("\t\t   "+no[i]+"\t"+daftarFilm[i]+"\t\t"+jenisFilm[i]+"\t\t\t"+jamPenayangan[i]+"\t\tRp."+hargaFilm[i]+"\t"+Studio[i]+"\n");
                }
                System.out.println("\t\t====================================================================================================================\n");
                
                System.out.println("\t\tMenu pencarian : ");
                System.out.println("\t\t 1. Berdasarkan Lokasi Studio");
                System.out.println("\t\t 2. Berdasarkan Jam Penayangan");
                System.out.println("\t\t 3. Berdasarkan Genre Film");
                System.out.println("\t\t 4. Keluar");
                System.out.print("\t\t Masukkan pilihan anda : ");
                int sorting = sc.nextInt();
                switch(sorting){
                    case 1 :
                        do {
                        System.out.println("");
                        System.out.println("\t\t\t   ---Studio---\n");
                        System.out.println("\t\t\t1. Studio-'1'");
                        System.out.println("\t\t\t2. Studio-'2'\n");

                        System.out.print("\t\tPilih Salah satu studio :");
                        int studio = sc.nextInt();
                        switch(studio){
                            case 1 : 
                                System.out.println("");
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[0]);
                                System.out.println("\t\tStudio         : "+Studio[0]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[0]);
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[2]);
                                System.out.println("\t\tStudio         : "+Studio[2]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[2]);
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[4]);
                                System.out.println("\t\tStudio         : "+Studio[4]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[4]);
                                System.out.println("\t\t------------------------------");
                                break;
                            case 2 :
                                System.out.println("");
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[1]);
                                System.out.println("\t\tStudio         : "+Studio[1]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[1]);
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[3]);
                                System.out.println("\t\tStudio         : "+Studio[3]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[3]);
                                System.out.println("\t\t------------------------------");
                                break;
                                
                            }System.out.print("\t\tApakah anda ingin melihat studio lain (y/t) : ");
                                jwbn = sc.next().charAt(0);
                                if(jwbn == 't' || jwbn =='T'){
                                    dftrfilm();
                                }
                        }while (jwbn == 'y' || jwbn == 'Y');
                        
                        break;
                    case 2 :
                        do{
                        System.out.println("\t\t\t   ---Range Jam Penayangan---\n");
                        System.out.println("\t\t\t1. 10.00-12.00");
                        System.out.println("\t\t\t2. 13.00-15.00");
                        System.out.println("\t\t\t3. 16.00-18.00\n");
                        System.out.print("\t\tMasukkan pilihan anda :");
                        int range = sc.nextInt();
                        switch(range){
                            case 1 : 
                                System.out.println("");
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[0]);
                                System.out.println("\t\tStudio         : "+Studio[0]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[0]);
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[1]);
                                System.out.println("\t\tStudio         : "+Studio[1]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[1]);
                                System.out.println("\t\t------------------------------");
                                
                                break;
                            case 2 : 
                                System.out.println("");
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[2]);
                                System.out.println("\t\tStudio         : "+Studio[2]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[2]);
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[3]);
                                System.out.println("\t\tStudio         : "+Studio[3]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[3]);
                                System.out.println("\t\t------------------------------");
                                break;
                            case 3 : 
                                System.out.println("");
                                System.out.println("\t\t------------------------------");
                                System.out.println("\t\tFilm           : "+daftarFilm[4]);
                                System.out.println("\t\tStudio         : "+Studio[4]);
                                System.out.println("\t\tJam penayangan : "+jamPenayangan[4]);
                                System.out.println("\t\t------------------------------");
                                break;
                                
                            }
                            System.out.print("\t\tApakah anda ingin melihat jam penayangan yang lain (y/t) :");
                            jwbn = sc.next().charAt(0);
                            if(jwbn == 't' || jwbn == 'T'){
                                dftrfilm();
                            }
                        } while (jwbn == 'y'||jwbn == 'Y');                       
                        
                        break;
                    case 3 :
                        do{
                        System.out.println("\t\t\t   ---Genre Film---\n");
                        System.out.println("\t\t\t1. Action");
                        System.out.println("\t\t\t2. Comedy");
                        System.out.println("\t\t\t3. Mystery\n");
                        sc.nextLine();
                        System.out.print("\t\tMasukkan pilihan genre :");
                        String genre = sc.nextLine();
                        if(genre.equalsIgnoreCase("Action")){
                            System.out.println("");
                            System.out.println("\t\t----------------------------------------");
                            System.out.println("\t\tFilm           : "+daftarFilm[0]);
                            System.out.println("\t\tGenre          : "+jenisFilm[0]);
                            System.out.println("\t\tJam penayangan : "+jamPenayangan[0]);
                            System.out.println("\t\t----------------------------------------");
                            System.out.println("\t\tFilm           : "+daftarFilm[4]);
                            System.out.println("\t\tGenre          : "+jenisFilm[4]);
                            System.out.println("\t\tJam penayangan : "+jamPenayangan[4]);
                            System.out.println("\t\t----------------------------------------");
                        }
                        else if(genre.equalsIgnoreCase("Comedy")){
                            System.out.println("");
                            System.out.println("\t\t----------------------------------------");
                            System.out.println("\t\tFilm           : "+daftarFilm[1]);
                            System.out.println("\t\tGenre          : "+jenisFilm[1]);
                            System.out.println("\t\tJam penayangan : "+jamPenayangan[1]);
                            System.out.println("\t\t----------------------------------------");
                            System.out.println("\t\tFilm           : "+daftarFilm[3]);
                            System.out.println("\t\tGenre          : "+jenisFilm[3]);
                            System.out.println("\t\tJam penayangan : "+jamPenayangan[3]);
                            System.out.println("\t\t----------------------------------------");
                        }
                        else if(genre.equalsIgnoreCase("Mystery")){
                            System.out.println("");
                            System.out.println("\t\t----------------------------------------");
                            System.out.println("\t\tFilm           : "+daftarFilm[2]);
                            System.out.println("\t\tGenre          : "+jenisFilm[2]);
                            System.out.println("\t\tJam penayangan : "+jamPenayangan[2]);
                            System.out.println("\t\t----------------------------------------");
                        }System.out.print("\t\tApakah anda ingin melihat genre lain (y/t) : ");
                        jwbn = sc.next().charAt(0);
                        if(jwbn == 't' || jwbn == 'T'){
                            dftrfilm();
                        }
                    }while (jwbn == 'y' || jwbn == 'Y');
                        break;
                    case 4 :
                        Pencarian();
                        break;
                    default:
                        System.out.println("Error!");
                }
            }
//    FUNGSI PENCARIAN TEMPAT DUDUK
    static void tmptduduk(){
        char jwb;
        do{
        System.out.println("\t       ===================================================");        
        System.out.println("\t\t\t    ===========LAYAR===========\n");
        System.out.println("\t\t\t\t  ======SEAT======");

        for(int i = 0; i < bangku.length; i++){
            System.out.print("\t\t"+kelas[i]+"-->\t");
            for(int j = 0;j < bangku.length; j++){
                System.out.print(bangku[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.println("\t       ===================================================");
            System.out.print("\t\tApakah anda ingin kembali ke menu pencarian (y/t): ");jwb = sc.next().charAt(0);
            if(jwb == 'y' || jwb == 'Y'){
                Pencarian();
            }
        }while(jwb == 'T' || jwb == 't');
    }
//    FUNGSI PENCARIAN DAFTAR MENU
    static void dftrmenu(){
            System.out.println("\t\t\t\t---MAKANAN---");
            System.out.println("\t\t=========================================");
            System.out.println("\t\t  No\tMakanan\t\t\t  Harga");
            System.out.println("\t\t==========================================\n");
            
            for(int i = 0 ;i < no.length; i++){
                System.out.println("\t\t  "+no[i]+"\t"+makanan[i]+"\t\tRp."+hargaSnacks[i]+"\n");
            }
            System.out.println("\t\t==========================================\n");
            System.out.println("\t\t\t\t---MINUMAN---");
            System.out.println("\t\t===========================================");
            System.out.println("\t\t No\t  Minuman\t\t  Harga");
            System.out.println("\t\t===========================================\n");
            for(int i = 0 ;i < no.length; i++){
                System.out.println("\t\t "+no[i]+"\t"+minuman[i]+"\t\tRp."+hargaminuman[i]+"\n");
            }   
    }
//    FUNGSI DARI JADWAL FILM
    static void jadwal(){
        
        System.out.println("\t\t====================================================================================================================");
        System.out.println("\t\t   No\t    Daftar Film\t\t\tJenis Film\t\tJam Tayang\t\tHarga\t\tStudio");
        System.out.println("\t\t====================================================================================================================\n");
        for(int i = 0;i < no.length; i++){
            System.out.println("\t\t   "+no[i]+"\t"+daftarFilm[i]+"\t\t"+jenisFilm[i]+"\t\t\t"+jamPenayangan[i]+"\t\tRp."+hargaFilm[i]+"\t"+Studio[i]+"\n");
        }
        System.out.println("\t\t====================================================================================================================");
        System.out.println("");
        System.out.print("\t\tMasukkan no pilihan film yang akan anda tonton : ");
        int pilFilm = sc.nextInt();
        System.out.println("");
        
//        MENAMPILKAN ISI STRUK
        switch(pilFilm){
            case 1 :
                namaFilm=daftarFilm[0];
                jamPen=jamPenayangan[0];
                hargaFlm=hargaFilm[0];
                genre=jenisFilm[0];
                loc=Studio[0];
                System.out.println("\t\tFilm yang anda pilih adalah "+daftarFilm[0]+" akan di mulai pada pukul "+jamPenayangan[0]);
                break;
            case 2 : 
                namaFilm=daftarFilm[1];
                jamPen=jamPenayangan[1];
                hargaFlm=hargaFilm[1];
                genre=jenisFilm[1];
                loc=Studio[1];
                System.out.println("\t\tFilm yang anda pilih adalah "+daftarFilm[1]+" akan di mulai pada pukul "+jamPenayangan[1]);
                break;
            case 3 : 
                namaFilm=daftarFilm[2];
                jamPen=jamPenayangan[2];
                hargaFlm=hargaFilm[2];
                genre=jenisFilm[2];
                loc=Studio[2];
                System.out.println("\t\tFilm yang anda pilih adalah "+daftarFilm[2]+" akan di mulai pada pukul "+jamPenayangan[2]);
                break;
            case 4 : 
                namaFilm=daftarFilm[3];
                jamPen=jamPenayangan[3];
                hargaFlm=hargaFilm[3];
                genre=jenisFilm[3];
                loc=Studio[3];
                System.out.println("\t\tFilm yang anda pilih adalah "+daftarFilm[3]+" akan di mulai pada pukul "+jamPenayangan[3]);
                break;
            case 5 : 
                namaFilm=daftarFilm[4];
                jamPen=jamPenayangan[4];
                hargaFlm=hargaFilm[4];
                genre=jenisFilm[4];
                loc=Studio[4];
                System.out.println("\t\tFilm yang anda pilih adalah "+daftarFilm[4]+" akan di mulai pada pukul "+jamPenayangan[4]);
                break;
            default:
                System.out.println("Error");
        }
        
    }
//    FUNGSI MENAMPILKAN BANGKU BIOSKOP
    static void bangku(){
        
        
        System.out.println("\t       ===================================================");        
        
        System.out.println("\t\t\t    ===========LAYAR===========\n");
        System.out.println("\t\t\t\t  ======SEAT======");
        
        for(int i = 0; i < bangku.length; i++){
            System.out.print("\t\t"+kelas[i]+"-->\t");
            for(int j = 0;j < bangku.length; j++){
                System.out.print(bangku[i][j]+"\t");
            }
            System.out.println("\n");
        }
        System.out.print("\t\tMasukkan No Bangku : ");
        int pilihan=sc.nextInt();
        System.out.println("");
        if(pilihan <= 25){
            if(pilihan==01|pilihan==02||pilihan==03||pilihan==04||pilihan==05){
                hargabgku=hargaBangku[0];     
                bangkuu=pilihan;
            }
            else if(pilihan==06||pilihan==07||pilihan==8||pilihan==9||pilihan==10){
                hargabgku=hargaBangku[1];
                bangkuu=pilihan;
            }
            else if(pilihan==11||pilihan==12||pilihan==13||pilihan==14||pilihan==15){
                
                hargabgku=hargaBangku[2];
                bangkuu=pilihan;
            }
            else if(pilihan==16||pilihan==17||pilihan==18||pilihan==19||pilihan==20){
                hargabgku=hargaBangku[3];
                bangkuu=pilihan;
            }
            else if(pilihan==21||pilihan==22||pilihan==23||pilihan==24||pilihan==25){
                hargabgku=hargaBangku[4];
                bangkuu=pilihan;
            }
            System.out.println("\t\tBangku yang anda pesan adalah bangku nomor ("+pilihan+")");
        }
        else{
            System.out.println("Nomor kursi yang anda masukkan Salah");
        }
        System.out.println("\t       ==================================================="); 
        
    }
//    FUNGSI MENAMPILKAN SNACKS YANG DIJUAL
    static void Snacks(){
        
        char jawab;
        do{
        System.out.println("\t\t-------------------------------------------");
        System.out.print("\t\tAnda ingin pesan Makanan/minuman? : ");
             String kiww=sc.next();
             System.out.println("\t\t-------------------------------------------\n");
             switch(kiww){
                 case "Makanan" :
                        System.out.println("\t\t\t ---MAKANAN---");
                        System.out.println("\t\t=========================================");
                        System.out.println("\t\t  No\tMakanan\t\t\t  Harga");
                        System.out.println("\t\t==========================================\n");
                        for(int i = 0 ;i < no.length; i++){
                            System.out.println("\t\t  "+no[i]+"\t"+makanan[i]+"\t\tRp."+hargaSnacks[i]+"\n");
                        }
                        System.out.println("\t\t==========================================\n");
                        sc.nextLine();
                        System.out.print("\t\tMasukkan Pilihan makanan yang Anda ingin : ");
                        String pilihan=sc.nextLine();
                        System.out.println("");
                        if(pilihan.equalsIgnoreCase("Popcorn caramel")){
                            snacks=makanan[0];
                            hargaMakanan=hargaSnacks[0];
                            System.out.println("\t\t Makanan yang anda pilih "+makanan[0]+" : Rp."+hargaSnacks[0]);
                        }
                        else if(pilihan.equalsIgnoreCase("French Fries")){
                            snacks=makanan[1];
                            hargaMakanan=hargaSnacks[1];
                            System.out.println("\t\t Makanan yang anda pilih "+makanan[1]+" : Rp."+hargaSnacks[1]);
                        }
                        else if(pilihan.equalsIgnoreCase("chicken Burger")){
                            snacks=makanan[2];
                            hargaMakanan=hargaSnacks[2];
                            System.out.println("\t\t Makanan yang anda pilih "+makanan[2]+" : Rp."+hargaSnacks[2]);
                        }
                        else if(pilihan.equalsIgnoreCase("cheese Hotdog")){
                            snacks=makanan[3];
                            hargaMakanan=hargaSnacks[3];
                            System.out.println("\t\t Makanan yang anda pilih "+makanan[3]+" : Rp."+hargaSnacks[3]);
                        }
                        else if(pilihan.equalsIgnoreCase("Onion Rings")){
                            snacks=makanan[4];
                            hargaMakanan=hargaSnacks[4];
                            System.out.println("\t\t Makanan yang anda pilih "+makanan[4]+" : Rp."+hargaSnacks[4]);
                        }

                        break;
                 case "Minuman" :
                     System.out.println("\t\t\t ---MINUMAN---");
                     System.out.println("\t\t===========================================");
        
                        System.out.println("\t\t No\t  Minuman\t\t  Harga");
                        System.out.println("\t\t===========================================\n");
                        for(int i = 0 ;i < no.length; i++){
                            System.out.println("\t\t "+no[i]+"\t"+minuman[i]+"\t\tRp."+hargaminuman[i]+"\n");
                        }
                        System.out.println("\t\t===========================================\n");
                        sc.nextLine();
                        System.out.print("\t\tMasukkan Pilihan minuman yang Anda ingin : ");
                        String pilihan2=sc.nextLine();
                        System.out.println("");
                        if(pilihan2.equalsIgnoreCase("Iced Lychee")){
                            snacksMinum=minuman[0];
                            hargaMinuman=hargaminuman[0];
                            System.out.println("\t\t Minuman yang anda pilih "+minuman[0]+" : Rp."+hargaminuman[0]);
                        }
                        else if(pilihan2.equalsIgnoreCase("Cappucino")){
                            snacksMinum=minuman[1];
                            hargaMinuman=hargaminuman[1];
                            System.out.println("\t\t Minuman yang anda pilih "+minuman[1]+" : Rp."+hargaminuman[1]);
                        }
                        else if(pilihan2.equalsIgnoreCase("Hot Milo")){
                            snacksMinum=minuman[2];
                            hargaMinuman=hargaminuman[2];
                            System.out.println("\t\t Minuman yang anda pilih "+minuman[2]+" : Rp."+hargaminuman[2]);
                        }
                        else if(pilihan2.equalsIgnoreCase("Milkshake")){
                            snacksMinum=minuman[3];
                            hargaMinuman=hargaminuman[3];
                            System.out.println("\t\t Minuman yang anda pilih "+minuman[3]+" : Rp."+hargaminuman[3]);
                        }
                        else if(pilihan2.equalsIgnoreCase("Matcha Milk")){
                            snacksMinum=minuman[4];
                            hargaMinuman=hargaminuman[4];
                            System.out.println("\t\t Minuman yang anda pilih "+minuman[4]+" : Rp."+hargaminuman[4]);
                        }
                }
                System.out.println("\t\t---------------------------------------------------");
                System.out.print("\t\tApakah anda ingin memesan yang lain ? (y/t) : ");
                jawab=sc.next().charAt(0);
                System.out.println("\t\t---------------------------------------------------\n");
            }
        while (jawab == 'y' || jawab == 'Y');

    }
//    FUNGSI PERHITUNGAN AKHIR
    static int Perhitungan(int a, int b, int c, int d){
        int hitung;
        hitung=a+b+c+d;
        return hitung;
    }
//    FUNGSI UNTUK MENAMPILKAN STRUK
    static void Struk(){
        System.out.println("\t\t=================================");
        System.out.println("\t\t\tSTRUK PEMESANAN");
        System.out.println("\t\t=================================");
        System.out.println("\t\tSeat              : "+bangkuu);
        System.out.println("\t\tFilm              : "+namaFilm);
        System.out.println("\t\tJam Penayangan    : "+jamPen);
        System.out.println("\t\tGenre Film        : "+genre);
        System.out.println("\t\tStudio            : "+loc);
        System.out.println("\t\tMakanan           : "+snacks);
        System.out.println("\t\tMinuman           : "+snacksMinum);
        System.out.println("\t\t=================================");
        System.out.println("\t\tTotal Pemesanan   : Rp."+Perhitungan(hargabgku, hargaFlm, hargaMakanan, hargaMinuman));
        System.out.println("\t\t---------------------------------");
        System.out.println("\t\tTOTAL             : Rp."+Perhitungan(hargabgku, hargaFlm, hargaMakanan, hargaMinuman));
        System.out.print("\t\tTUNAI             : Rp.");
        bayar = sc.nextInt();
        System.out.println("\t\t---------------------------------");
        if(hasil==bayar){
            hasilll=Perhitungan(hargabgku, hargaFlm, hargaMakanan, hargaMinuman)-bayar;
        }
        else {
            hasilll=bayar-Perhitungan(hargabgku, hargaFlm, hargaMakanan, hargaMinuman);
        }
        
        System.out.println("\t\tKEMBALI           : Rp."+hasilll);
        System.out.println("\t\t=================================");
        System.out.println("");
        for(int i = 1; i < no.length-1; i++){
            for (int l = 1; l < no.length-1; l++) {
                System.out.print("\t    ");
            }
            for(int j = no.length; j >= i; j--){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
        System.out.println("\t\t---TERIMA KASIH ATAS KUNJUNGAN ANDA---");
        for (int i = 1; i < no.length-1; i++) {
            for (int j = 1; j < no.length-1; j++) {
                System.out.print("\t     ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");
            }
            for (int j = no.length-1; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println(" ");
        }
    }
//    FUNGSI UNTUK KELUAR
    static void keluar(){
        System.out.println("\t\t---TERIMA KASIH ATAS KUNJUNGAN ANDA---");
    }
}
/*
Code by : 
Muhammad Lazuardi Timur
TI-1E
19
*/