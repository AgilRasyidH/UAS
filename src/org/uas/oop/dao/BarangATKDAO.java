package org.uas.oop.dao;

import java.util.List;

import org.uas.oop.bean.BarangATK;

public interface BarangATKDAO {
	public BarangATK getbarangatkbyidbarang(int idbarang);
	public void getbarangatkbynamabarang(String namabarang);
	public BarangATK getbarangatkbymerekbarang(String merekbarang);
	
	public List<BarangATK> getAllBarangatk();
	public void saveBarangatk(BarangATK barangatk);
	public void updateBarangatk(BarangATK barangatk);
	public void deleteBarangatk(BarangATK barangatk);
}
