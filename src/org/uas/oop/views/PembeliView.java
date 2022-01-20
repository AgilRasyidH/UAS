package org.uas.oop.views;

import java.util.Scanner;

import org.uas.oop.dao.PembeliDAO;
import org.uas.oop.daoimpl.PembeliDAOimpl;

public class PembeliView {
	
	public PembeliView() {
		
	}
	
	public static void displaymenuPembeli() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		PembeliDAO operation = new PembeliDAOimpl();
		System.out.println();			        
        System.out.println("              =========================================                  ");
        System.out.println("              ||           Data  Pembeli             ||                  ");
        System.out.println("              =========================================                  ");
        System.out.println("              ||                                     ||                  ");
        System.out.println("              ||        1. Input Data  		     ||  				 ");
        System.out.println("              ||        2. Cari Data By id pembeli  ||                  ");
        System.out.println("              ||        3. Tampilkan Seluruh Data    ||                  ");
        System.out.println("              ||        4. Perbarui Data             ||                  ");
        System.out.println("              ||        5. Hapus Data                ||                  ");
        System.out.println("              ||        6. Kembali                   ||                  ");
        System.out.println("              ||                                     ||                  ");
        System.out.println("              =========================================                  ");	
        System.out.println();
        System.out.print("Pilih menu: ");
        menu = scanner.nextInt();
        
        while (!(menu == 1 || menu == 2 || menu == 3 || menu == 4 || menu == 5 || menu == 6)) {
        	System.out.println("Menu yang Anda masukkan salah!");
        	System.out.println("Silahkan pilih menu kembali :");
        	menu = scanner.nextInt();
        }
        
        switch (menu) {
        
        case 1:
        	FormView.forminsertPembeli();
        	break;
        case 2:
        	FormView.formsearchPembeli();
        	break;
        case 3:
        	TableView.displaytablePembeli(operation.getAllPembeli());//TableView.displa
        	break;
        case 4:
        	FormView.formupdatePembeli();
        	break;
        case 5:
        	FormView.formdeletePembeli();;
        case 6:
        	MenuUtamaView.menuUtama();
        }
	}
}
