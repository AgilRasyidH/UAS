package org.uas.oop.views;

import java.util.Scanner;

import org.uas.oop.dao.PegawaiDAO;
import org.uas.oop.daoimpl.PegawaiDAOimpl;

public class PegawaiView {
	
	public PegawaiView() {
		
	}
	
	public static void displaymenuPegawai() {
		int menu;
		Scanner scanner = new Scanner(System.in);
		PegawaiDAO operation = new PegawaiDAOimpl();
		System.out.println();			        
        System.out.println("              =========================================                  ");
        System.out.println("              ||           Data  Pegawai             ||                  ");
        System.out.println("              =========================================                  ");
        System.out.println("              ||                                     ||                  ");
        System.out.println("              ||        1. Input Data  		     ||  				 ");
        System.out.println("              ||        2. Cari Data By Nama Barang  ||                  ");
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
        	FormView.forminsertPegawai();
        	break;
        case 2:
        	FormView.formsearchPegawai();
        	break;
        case 3:
        	TableView.displaytablePegawai(operation.getAllpegawai());
        	break;
        case 4:
        	FormView.formupdatePegawai();
        	break;
        case 5:
        	FormView.formdeletePegawai();
        	break;
        case 6:
        	MenuUtamaView.menuUtama();
        }
	}
}
