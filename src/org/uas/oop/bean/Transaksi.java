package org.uas.oop.bean;

import java.util.Scanner;


public class Transaksi extends BarangATK {
	private int noTransaksi;
	private int tglTransaksi;
	private double jmlhBeli;
	
	
	public int getNoTransaksi() {
		return noTransaksi;
	}
	public void setNoTransaksi(int noTransaksi) {
		this.noTransaksi = noTransaksi;
	}
	public int getTglTransaksi() {
		return tglTransaksi;
	}
	public void setTglTransaksi(int tglTransaksi) {
		this.tglTransaksi = tglTransaksi;
	}
	public double getJmlhBeli() {
		return jmlhBeli;
	}
	public void setJmlhBeli(double jmlhBeli) {
		this.jmlhBeli = jmlhBeli;
	}
	
	public void totalHarga() {
		double totalHarga;
		double uang;
		double kembalian;
		
		Scanner scanner = new Scanner(System.in);                //Scanner sc = new Scanner();
		
		totalHarga = getJmlhBeli() * getHargabarang();
		System.out.println("Total Harga : Rp." + totalHarga);
		
		System.out.println("Masukan Uang Anda :Rp.");
		uang = scanner.nextDouble();
		
		if(totalHarga> 50000) {
			totalHarga = totalHarga - (totalHarga*0.05);
			System.out.println("Total Harga setelah dikurangi diskon : Rp." + totalHarga);
		}
		
		if(uang > totalHarga) {
			kembalian = uang - totalHarga;
			System.out.println("Kembalian anda :Rp." +kembalian);
		}
	}
	}

	

