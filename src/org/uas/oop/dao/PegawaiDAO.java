package org.uas.oop.dao;

import java.util.List;

import org.uas.oop.bean.Pegawai;

public interface PegawaiDAO {
	public Pegawai getPegawaibyId(int idpegawai);
	public Pegawai getPegawaibyNama(String nama);
	public Pegawai getPegawaibyGaji(Double gaji);
	public String getPegawaibyPassword(String password);
	public void getPegawaibyEmail(String email);
	
	public List<Pegawai> getAllpegawai();
	public Pegawai login(String email, String password);
	public void savePegawai(Pegawai pegawai);
	public void updatePegawai(Pegawai pegawai);
	public void deletePegawai(Pegawai pegawai);
	
	
	
	

}
