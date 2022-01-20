package org.uas.oop.views;

import java.util.List;
import java.util.Scanner;


import org.uas.oop.bean.Transaksi;
import org.uas.oop.views.TransaksiView;
import org.uas.oop.bean.BarangATK;
import org.uas.oop.bean.Pegawai;
import org.uas.oop.bean.Pembeli;
import org.uas.oop.dao.BarangATKDAO;
import org.uas.oop.dao.PegawaiDAO;
import org.uas.oop.dao.PembeliDAO;
import org.uas.oop.daoimpl.BarangATKDAOimpl;
import org.uas.oop.daoimpl.PegawaiDAOimpl;
import org.uas.oop.daoimpl.PembeliDAOimpl;

public class TableView {
	public static void main(String[] args) {
		BarangATKDAO operation = new BarangATKDAOimpl();
		displayBarangATK(operation.getAllBarangatk());
		PegawaiDAO operation1 = new PegawaiDAOimpl();
		displaytablePegawai(operation1.getAllpegawai());
		PembeliDAO operation2 = new PembeliDAOimpl();
		displaytablePembeli(operation2.getAllPembeli());
		
	}
	
	public static void displayBarangATK(List<BarangATK> listBarangATK) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ====================================================================================================================================");
		System.out.println("    |							DATA Barang ATK				     |");
		System.out.println("     ====================================================================================================================================");
		System.out.println("    |\tID Barang\t|\tNama Barang\t|       Merek Barang     |       Harga Barang   |          Jumlah Barang   |");
		System.out.println("     ====================================================================================================================================");
		for (BarangATK bATK : listBarangATK) {
			System.out.println("	|\t"+bATK.getIdbarang()+"\t 	| 	"+bATK.getNamabarang()+"\t 	| 	"+bATK.getMerekbarang()+"\t 	| 	"+bATK.getHargabarang()+"\t 	| 	"+bATK.getJumlahbarang()+"    |");
		}
		System.out.println("     ====================================================================================================================================");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
	}
	
	public static void displayTupleBarangATK(BarangATK barangAtk) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("    =============================================");
		System.out.println("    ||		DATA Barang ATK		       ||");
		System.out.println("    =============================================");
		System.out.println("    |ID Barang\t\t\t: " + barangAtk.getIdbarang()+"\t\t|");
		System.out.println("    |Nama Barang\t\t: " + barangAtk.getNamabarang()+"\t\t|");
		System.out.println("    |Merek Barang\t\t: " + barangAtk.getMerekbarang()+"\t\t|");
		System.out.println("    |Harga Barang\t\t: " + barangAtk.getHargabarang()+"\t\t|");
		System.out.println("    |Jumlah Barang\t\t: " + barangAtk.getJumlahbarang()+"\t\t|");
		System.out.println("    =============================================");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
	}
	
	public static void displaytablePegawai(List<Pegawai> listPegawai) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ====================================================================================================================================");
		System.out.println("    |			  DATA Pegawai              				                                                        |");
		System.out.println("     ====================================================================================================================================");
		System.out.println("    |\t\tID Pegawai\t|\t\tNama\t\t|\t\tEmail\t\t|\tPassword\t|\tGaji\t| ");
		for (Pegawai pgwai : listPegawai) {
			System.out.println("    |\t\t"+pgwai.getIdpegawai()+"\t\t|\t\t"+pgwai.getNamapegawai()+"\t\t|  "+pgwai.getEmail()+"\t|\t"+pgwai.getPassword()+"\t\t| "+pgwai.getGaji()+"\t|");
		}
		System.out.println("     ====================================================================================================================================");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PegawaiView.displaymenuPegawai();;
        }
	}
	
	public static void displaytuplePegawai(Pegawai pegawai) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("    =============================================");
		System.out.println("    ||		         DATA Pegawai			   ||");
		System.out.println("    =============================================");
		System.out.println("    ||                                                        ");
		System.out.println("    ||   ID Pegawai\t\t\t:                     ||" + pegawai.getIdpegawai()+"\t\t|");
		System.out.println("    ||   Nama \t\t: " + pegawai.getNamapegawai()+"\t\t|");
		System.out.println("    ||   Email\t\t: " + pegawai.getEmail()+"\t\t|");
		System.out.println("    ||   Password\t\t: " + pegawai.getPassword()+"\t\t|");
		System.out.println("    ||   Gaji \t\t: " + pegawai.getGaji()+"\t\t|");
		System.out.println("    ||                                                       ");
		System.out.println("     ===========================================");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PegawaiView.displaymenuPegawai();
        }
	}
	
	public static void displaytablePembeli(List<Pembeli> listpembeli) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ====================================================================================================================================");
		System.out.println("    |							DATA Pembeli				     |");
		System.out.println("     ====================================================================================================================================");
		System.out.println("    |\t\tID Pembeli\t|\tNama\t\t|\t\tAlamat\t|\t\tNo Handphone\t|");
		for (Pembeli pmbli : listpembeli) {
			System.out.println("    |\t"+pmbli.getIdPembeli()+"\t\t        |     \t"+pmbli.getNamaPembeli()+"\t        |     \t"+pmbli.getAlamatPembeli()+"\t     |     \t"+pmbli.getNoHpPembeli()+"\t|");
		}
		System.out.println("     ====================================================================================================================================");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PembeliView.displaymenuPembeli();//PegawaiView.displaymenuPegawai();;
        }
	}
	
	public static void displaytuplePembeli(Pembeli pembeli) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("    =============================================");
		System.out.println("    ||		         DATA Pembeli			   ||");
		System.out.println("    =============================================");
		System.out.println("    ||                                                        ");
		System.out.println("    ||   ID Pembeli\t\t\t:                     ||" + pembeli.getIdPembeli()+"\t\t|");
		System.out.println("    ||   Nama \t\t: " + pembeli.getNamaPembeli()+"\t\t|");
		System.out.println("    ||   Alamat\t\t: " + pembeli.getAlamatPembeli()+"\t\t|");
		System.out.println("    ||   No Handphone\t\t: " + pembeli.getNoHpPembeli()+"\t\t|");
		System.out.println("    ||                                                       ");
		System.out.println("     ===========================================");
		System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	 PembeliView.displaymenuPembeli();//PegawaiView.displaymenuPegawai();
        }
	}
	
	public static void displayTabelTransaksi(List<Transaksi> listTransaksi) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |							DATA TRANSAKSI					    		 |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.println("    |\tNo Transaksi\t\t|\tTanggal Transaksi\t\t\t|       Jumlah Beli      			 |");
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		for (Transaksi Tr : listTransaksi) {
			System.out.println("    |\t"+Tr.getNoTransaksi()+"\t|       "+Tr.getTglTransaksi()+"\t        |       "+Tr.getJmlhBeli()+"\t|");
		}
		System.out.println("     ----------------------------------------------------------------------------------------------------------------");
		System.out.print("    | [V] Tekan Tombol V untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'V' || back == 'b') {
			TransaksiView.displaymenuTransaksi();;
		}
	}
	
	public static void displayTupleTransaksi(Transaksi transaksi) {
		char back;
		Scanner scanner = new Scanner(System.in);
		System.out.println();
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |		DATA TRANSAKSI				|");
		System.out.println("     -----------------------------------------------------------");
		System.out.println("    |No Transaksi\t\t: " + transaksi.getNoTransaksi()+"\t\t\t\t|");
		System.out.println("    |Tanggal Transaksi\t\t: " + transaksi.getTglTransaksi()+"\t\t\t|");
		System.out.println("    |Jumlah Beli\t\t: " + transaksi.getJmlhBeli()+"\t\t|");
		System.out.println("     -----------------------------------------------------------");
		System.out.print("    | [V] Tekan Tombol V untuk kembali ke menu sebelumnya: ");
		back = scanner.next().charAt(0);
		if (back == 'V' || back == 'v') {
			TransaksiView.displaymenuTransaksi();
		}
	}
	

}
