package org.uas.oop.views;

import java.util.Scanner;


import org.uas.oop.views.FormView;

public class TransaksiView {
	double harga, total, bayar, kembalian;
	int pil, jumlah;
	public TransaksiView() {
		
	}
		public static void displaymenuTransaksi() {
			Scanner scanner = new Scanner(System.in);
			TransaksiView in = new TransaksiView();
			do {
		        System.out.println("            ===========================================                  ");
		        System.out.println("            ||           Selamat  Datang             ||                  ");
		        System.out.println("            ||       Silakan Pilih Barang Anda       ||                  ");
		        System.out.println("            ===========================================                  ");
		        System.out.println("            ||                                       ||                  ");
		        System.out.println("            ||                                       ||                  ");
		        System.out.println("            ||         1. Buku Tulis [Rp.5000]       ||                  ");
		        System.out.println("            ||         2. Pensil     [Rp.1500]       ||                  ");
		        System.out.println("            ||         3. Penggaris  [Rp.3000]       ||                  ");
		        System.out.println("            ||         4. Penghapus  [Rp.1000]       ||                  ");
		        System.out.println("            ||         5. Selesai Dan Bayar          ||                  ");
		        System.out.println("            ||         6. Keluar Aplikasi            ||                  ");
		        System.out.println("            ||                                       ||                  ");
		        System.out.println("            ||                                       ||                  ");	
		        System.out.println("            ===========================================                  ");
				System.out.println("Masukkan pilihan");
				in.pil = scanner.nextInt();
				if(in.pil>=1 && in.pil<=3) {
					System.out.println("Masukkan jumlah beli :");
					in.jumlah = scanner.nextInt();
				} else {
					
				}
				in.hitungTotal(in.jumlah);
			} while(in.pil!=5);
			in.viewTotal();
			System.out.println("Bayar : Rp.");
			in.bayar = scanner.nextDouble();
			in.hitungKembalian(in.bayar);
			in.viewKembalian();
			
		}
		
		double hitungTotal(int jml) {
			jumlah = jml;
			switch(pil) {
			case 1:
				harga = 5000;
				total = total+(harga*jml);
				break;
			case 2:
				harga = 1000;
				total = total+(harga*jml);
				break;
			case 3:
				harga = 3000;
				total = total+(harga*jml);
				break;
			case 5:
				break;
			case 6:
				MenuUtamaView.menuUtama();
				break;
			default:
				System.out.println("input yang dimasukkan salah ");
				break;
			}
			return total;
		}
		
		void viewTotal() {
			System.out.println("Pembayaran");
			System.out.println("Total : Rp."+total);
		}
		
		double hitungKembalian (double byr) {
			bayar = byr;
			kembalian = byr-total;
			return kembalian;
		}
		
		void viewKembalian() {
			System.out.println("Kembalian : Rp."+kembalian);
		}
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			/*int menu;
			Scanner scanner = new Scanner(System.in);
			TransaksiDAO operation = new TransaksiDAOimpl();
			System.out.println();			        
	        System.out.println("              ===================================================                 ");
	        System.out.println("              |            		Data Transaksi    				 |                  ");
	        System.out.println("              ====================================================                  ");
	        System.out.println("              | Pilihan:                              			 |                  ");
	        System.out.println("              |        1. Input Data Transaksi		  		     |  				 ");
	        System.out.println("              |        2. Cari Data Transaksi By No transaksi    |                  ");
	        System.out.println("              |        3. Tampilkan Seluruh Data Transaksi 	     |                  ");
	        System.out.println("              |        4. Perbarui Data Transaksi             	 |                  ");
	        System.out.println("              |        5. Hapus Data Transaksi                	 |                  ");
	        System.out.println("              |        6. Pembayaran               	             |                  ");
	        System.out.println("              |        7. Kembali                   	    	 |                 ");
	        System.out.println("              ====================================================                  ");	
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
	        	FormView.formInsertTransaksi();
	        	break;
	        case 2:
	        	FormView.formSearchTransaksi();
	        	break;
	        case 3:
	        	TableView.displayTabelTransaksi(operation.getAllTransaksi());
	        	break;
	        case 4:
	        	FormView.formUpdateTransaksi();
	        	break;
	        case 5:
	        	FormView.formDeleteTransaksi();
	        	break;
	        case 6:
	        	FormView.formPembayaran();
	        }
	        
	        scanner.close();
	}*/

}