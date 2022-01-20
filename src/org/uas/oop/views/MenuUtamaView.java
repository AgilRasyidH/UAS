package org.uas.oop.views;

import java.util.Scanner;

import org.uas.oop.bean.BarangATK;
import org.uas.oop.bean.Pegawai;
import org.uas.oop.dao.PegawaiDAO;
import org.uas.oop.daoimpl.PegawaiDAOimpl;

public class MenuUtamaView {
	
	public static void main(String[] args) {
		//menulogin();
		menuUtama();
	}

	
	public static void menulogin() {
		Scanner scanner = new Scanner (System.in);
		PegawaiDAO operation = new PegawaiDAOimpl();
		Pegawai pegawai;
		String email, password;
		boolean login = false;
		
		do {
	        System.out.println("                                                                 ");
	        System.out.println("                          Selamat   Datang                    ");
	        System.out.println("                           Silahkan Login                    ");
	        System.out.println("                                                             ");
	        System.out.println("                                                             ");
	        System.out.print("                     >  Email    : "); email = scanner.nextLine();
			System.out.print("                     >  Password : "); password = scanner.nextLine();
	        System.out.println("                                                             ");
	        System.out.println("                                                                  ");
			//email = val.validateInput(scanner,"| email      :", "email");
			pegawai = operation.login(email, password);
			if(pegawai != null) {
				login = true;
				System.out.println("                          Login Berhasil !                   ");
			} else {
				System.out.println("Email atau password salah ! ");
			}
		} while (!login);
	}
	
	
	
	public static void menuUtama() {
		int menu;
		Scanner mainScanner = new Scanner(System.in);
        System.out.println();		        
        System.out.println("            ===========================================                  ");
        System.out.println("            ||           Selamat  Datang             ||                  ");
        System.out.println("            ||            di Menu Utama              ||                  ");
        System.out.println("            ===========================================                  ");
        System.out.println("            ||                                       ||                  ");
        System.out.println("            ||                                       ||                  ");
        System.out.println("            ||         1. Data Barang ATK            ||                  ");
        System.out.println("            ||         2. Data Pegawai               ||                  ");
        System.out.println("            ||         3. Data Pembeli               ||                  ");
        System.out.println("            ||         4. Transaksi                  ||                  ");
        System.out.println("            ||         5. Keluar Aplikasi            ||                  ");
        System.out.println("            ||                                       ||                  ");
        System.out.println("            ||                                       ||                  ");	
        System.out.println("            ===========================================                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = mainScanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5)) {
        	System.out.println("Warning: Menu yang Anda masukkan salah!");
        	System.out.println();
        	System.out.print("Silahkan pilih menu kembali: ");
        	menu = mainScanner.nextInt();
        }
        
        switch (menu) {
        case 1:
        	BarangATKView.displaymenuBarangATK();
        	break;
        case 2:
        	PegawaiView.displaymenuPegawai();
        	break;
        case 3:
        	PembeliView.displaymenuPembeli();
        case 4:
        	TransaksiView.displaymenuTransaksi();
        case 5:
        	System.out.println("Terima kasih, Anda Keluar dari aplikasi");
        	System.exit(0);
        default:
        	System.out.println("Pilihan yang anda masukkan salah");
      
        }

        mainScanner.close();
	}
}
