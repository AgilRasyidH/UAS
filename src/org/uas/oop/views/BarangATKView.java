package org.uas.oop.views;

import java.util.Scanner;

import org.uas.oop.dao.BarangATKDAO;
import org.uas.oop.daoimpl.BarangATKDAOimpl;

public class BarangATKView {
	
	public BarangATKView() {
		
	}
	
	
	public static void displaymenuBarangATK() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println();			        
        System.out.println("              =========================================                  ");
        System.out.println("              ||            Data Barang ATK          ||                  ");
        System.out.println("              =========================================                  ");
        System.out.println("              || Pilihan:                            ||                  ");
        System.out.println("              ||        1. Input Data		     ||  				 ");
        System.out.println("              ||        2. Cari Data By Nama Barang  ||                  ");
        System.out.println("              ||        3. Tampilkan Seluruh Data    ||                  ");
        System.out.println("              ||        4. Perbarui Data             ||                  ");
        System.out.println("              ||        5. Hapus Data                ||                  ");
        System.out.println("              ||        6. Kembali                   ||                  ");
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
        	FormView.formInsertBarangATK();
        	break;
        case 2:
        	FormView.formSearchBarangATK();
        	break;
        case 3:
        	TableView.displayBarangATK(operation.getAllBarangatk());
        	break;
        case 4:
        	FormView.formUpdateBarangATK();
        	break;
        case 5:
        	FormView.formDeleteBarangATK();
        	break;
        case 6:
        	MenuUtamaView.menuUtama();
        }
        
        scanner.close();
	}
	
}
