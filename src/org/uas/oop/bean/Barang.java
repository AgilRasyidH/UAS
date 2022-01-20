package org.uas.oop.bean;

abstract class Barang {
	int idbarang;
	String namabarang;
	String merekbarang;
	
	public int getIdbarang() {
		return idbarang;
	}
	public void setIdbarang(int idbarang) {
		this.idbarang = idbarang;
	}
	public String getNamabarang() {
		return namabarang;
	}
	public void setNamabarang(String namabarang) {
		this.namabarang = namabarang;
	}
	public String getMerekbarang() {
		return merekbarang;
	}
	public void setMerekbarang(String merekbarang) {
		this.merekbarang = merekbarang;
	}
	
	
}
