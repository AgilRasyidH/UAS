package org.uas.oop.views;

import java.util.Scanner;

import org.uas.oop.views.TransaksiView;
import org.uas.oop.bean.BarangATK;
import org.uas.oop.bean.Pegawai;
import org.uas.oop.bean.Pembeli;
import org.uas.oop.dao.BarangATKDAO;
import org.uas.oop.daoimpl.BarangATKDAOimpl;
import org.uas.oop.daoimpl.PegawaiDAOimpl;
import org.uas.oop.daoimpl.PembeliDAOimpl;
import org.uas.oop.dao.PegawaiDAO;
import org.uas.oop.dao.PembeliDAO;

public class FormView {
	
	public static void formInsertBarangATK() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("              =========================================                  ");
        System.out.println("              |      Form Insert Data Barang ATK      |                  ");
        System.out.println("              =========================================                  ");
        System.out.print("              | ID Barang		:");
        barangAtk.setIdbarang(scanner.nextInt());
        System.out.print("              | Nama Barang	        :");
        barangAtk.setNamabarang(scanner2.nextLine());
        System.out.print("              | Merek Barang            :");
        barangAtk.setMerekbarang(scanner2.nextLine());
        System.out.print("              | Harga Barang            :");
        barangAtk.setHargabarang(scanner2.nextInt());
        System.out.print("              | Jumlah Barang           :");
        barangAtk.setJumlahbarang(scanner2.nextInt());
        System.out.println("              ==========================================					 ");
        operation.saveBarangatk(barangAtk);
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
	}
	
	public static void formUpdateBarangATK() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String namabarang;
		char back;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("Masukkan nama dari barang yang akan diupdate : ");
		namabarang = scanner.nextLine();
		System.out.println();
		System.out.println("              ===========================================                 ");
        System.out.println("              |       Form Update Data Barang ATK       |      ");
        System.out.println("              ===========================================                ");
        System.out.print("              | Nama Barang		:");
        System.out.println(namabarang);
        barangAtk.setNamabarang(namabarang);
        System.out.print("              | ID Barang		:");
        barangAtk.setIdbarang(scanner.nextInt());
        System.out.print("              | Merek Barang            :");
        barangAtk.setMerekbarang(scanner2.nextLine());
        System.out.print("              | Harga Barang            :");
        barangAtk.setHargabarang(scanner2.nextDouble());
        System.out.print("              | Jumlah Barang           :");
        barangAtk.setJumlahbarang(scanner2.nextInt());
        System.out.println("              ============================================");
        operation.updateBarangatk(barangAtk);;
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	BarangATKView.displaymenuBarangATK();
        }
        
	
	}
	
	public static void formDeleteBarangATK() {
		Scanner scanner = new Scanner(System.in);
		String namabarang;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("Masukkan nama barang yang akan dihapus : ");
		namabarang = scanner.nextLine();
		barangAtk.setNamabarang(namabarang);
		operation.deleteBarangatk(barangAtk);
		
	}
	
	public static void formSearchBarangATK() {
		Scanner scanner = new Scanner(System.in);
		String namabarang;
		BarangATK barangAtk = new BarangATK();
		BarangATKDAO operation = new BarangATKDAOimpl();
		System.out.println("Masukkan nama barang yang akan dicari");
		namabarang = scanner.nextLine();
		barangAtk.setNamabarang(namabarang);
		operation.getbarangatkbynamabarang(namabarang);
		
	}
	
	public static void forminsertPegawai() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		Pegawai pegawai = new Pegawai();
		PegawaiDAO operation = new PegawaiDAOimpl();
		System.out.println("              =========================================                  ");
        System.out.println("              |      Form Insert Data Pegawai         |                  ");
        System.out.println("              =========================================                  ");
        System.out.println("            |                                                             ");
        System.out.print("              |         ID Pegawai   :");
        pegawai.setIdpegawai(scanner.nextInt());
        System.out.print("              |         Nama 	       :");
        pegawai.setNamapegawai(scanner2.nextLine());
        System.out.print("              |         Email        :");
        pegawai.setEmail(scanner2.nextLine());
        System.out.print("              |         Password     :");
        pegawai.setPassword(scanner2.nextLine());
        System.out.print("              |         Gaji     :");
        pegawai.setGaji(scanner2.nextDouble());
        System.out.println("            |                                                             ");
        System.out.println("              ==========================================					 ");
        operation.savePegawai(pegawai);
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PegawaiView.displaymenuPegawai();
        }
	}
	
	public static void formupdatePegawai() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		String email;
		char back;
		Pegawai pegawai = new Pegawai();
		PegawaiDAO operation = new PegawaiDAOimpl();
		System.out.println("Masukkan nama email yang akan diupdate : ");
		email = scanner.nextLine();
		System.out.println();
		System.out.println("              ===========================================                 ");
        System.out.println("              |       Form Update Data Pegawai     |      ");
        System.out.println("              ===========================================                ");
        System.out.print("              | Email		:");
        System.out.println(email);
        pegawai.setEmail(email);
        System.out.print("              | ID Pegawai		:");
        pegawai.setIdpegawai(scanner.nextInt());
        System.out.print("              | Nama            :");
        pegawai.setNamapegawai(scanner2.nextLine());
        System.out.print("              | Password            :");
        pegawai.setPassword(scanner.nextLine());
        System.out.print("              | Gaji            :");
        pegawai.setGaji(scanner2.nextDouble());
        System.out.println("              ============================================");
        operation.updatePegawai(pegawai);;
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PegawaiView.displaymenuPegawai();
        }    
	
	}
	
	public static void formdeletePegawai() {
		Scanner scanner = new Scanner(System.in);
		String email;
		Pegawai pegawai = new Pegawai();
		PegawaiDAO operation = new PegawaiDAOimpl();
		System.out.println("Masukkan alamat email yang akan dihapus : ");
		email = scanner.nextLine();
		pegawai.setEmail(email);
		operation.deletePegawai(pegawai);
		
	}
	
	public static void formsearchPegawai() {
		Scanner scanner = new Scanner(System.in);
		String email;
		Pegawai pegawai = new Pegawai();
		PegawaiDAO operation = new PegawaiDAOimpl();
		System.out.println("Masukkan alamat email yang akan dicari");
		email = scanner.nextLine();
		pegawai.setEmail(email);
		operation.getPegawaibyEmail(email);
		
	}
	
	public static void forminsertPembeli() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		char back;
		Pembeli pembeli = new Pembeli();
		PembeliDAO operation = new PembeliDAOimpl();
		System.out.println("              =========================================                  ");
        System.out.println("              |      Form Insert Data Pembeli         |                  ");
        System.out.println("              =========================================                  ");
        System.out.println("            |                                                             ");
        System.out.print("              |         ID Pembeli   :");
        pembeli.setIdPembeli(scanner.nextInt());
        System.out.print("              |         Nama 	       :");
        pembeli.setNamaPembeli(scanner2.nextLine());
        System.out.print("              |         Alamat       :");
        pembeli.setAlamatPembeli(scanner2.nextLine());
        System.out.print("              |         Nomor handphone     :");
        pembeli.setNoHpPembeli(scanner2.nextInt());
        System.out.println("            |                                                             ");
        System.out.println("              ==========================================					 ");
        operation.savePembeli(pembeli);
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PembeliView.displaymenuPembeli();//PegawaiView.displaymenuPegawai();
        }
	}
	
	public static void formupdatePembeli() {
		Scanner scanner = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		int idpembeli;
		char back;
		Pembeli pembeli = new Pembeli();
		PembeliDAO operation = new PembeliDAOimpl();
		System.out.println("Masukkan id pembeli yang akan diupdate : ");
		idpembeli = scanner.nextInt();
		System.out.println();
		System.out.println("              ===========================================                 ");
        System.out.println("              |       Form Update Data Pembeli     |      ");
        System.out.println("              ===========================================                ");
        System.out.print("              | ID Pembeli		:");
        System.out.println(idpembeli);
        pembeli.setIdPembeli(idpembeli);
        System.out.print("              | Nama		:");
        pembeli.setNamaPembeli(scanner2.nextLine());
        System.out.print("              | Alamat            :");
        pembeli.setAlamatPembeli(scanner2.nextLine());
        System.out.print("              | No Handphone            :");
        pembeli.setNoHpPembeli(scanner2.nextInt());
        System.out.println("              ============================================");
        operation.updatePembeli(pembeli);;
        System.out.println("[V] Tekan tombol V untuk kembali ke menu sebelumnya : ");
        back = scanner2.next().charAt(0);
        if (back == 'V' || back == 'v') {
        	PembeliView.displaymenuPembeli();//PegawaiView.displaymenuPegawai();
        }    
	
	}
	
	public static void formdeletePembeli() {
		Scanner scanner = new Scanner(System.in);
		int idpembeli;
		Pembeli pembeli = new Pembeli();
		PembeliDAO operation = new PembeliDAOimpl();
		System.out.println("Masukkan id pembeli yang akan dihapus : ");
		idpembeli = scanner.nextInt();
		pembeli.setIdPembeli(idpembeli);
		operation.deletePembeli(pembeli);
		
	}
	
	public static void formsearchPembeli() {
		Scanner scanner = new Scanner(System.in);
		int idpembeli;
		Pembeli pembeli = new Pembeli();
		PembeliDAO operation = new PembeliDAOimpl();
		System.out.println("Masukkan id pembeli yang akan dicari");
		idpembeli = scanner.nextInt();
		pembeli.setIdPembeli(idpembeli);
		operation.getpembelibyId(idpembeli);

	}
	
}