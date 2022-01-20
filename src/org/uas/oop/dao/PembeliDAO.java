package org.uas.oop.dao;

import java.util.List;

import org.uas.oop.bean.Pembeli;

public interface PembeliDAO {
	public void getpembelibyId(int idpembeli);
	public Pembeli getpembelibyNama(String namapembeli);
	public Pembeli getpembelibyAlamat(String alamatpembeli);
	public Pembeli getpembelibyNohp(int nohppembeli);
	
	public List<Pembeli> getAllPembeli();
	public void savePembeli(Pembeli pembeli);
	public void updatePembeli(Pembeli pembeli);
	public void deletePembeli(Pembeli pembeli);

}
