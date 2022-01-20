package org.uas.oop.dao;

import java.util.List;

import org.uas.oop.bean.Transaksi;

public interface TransaksiDAO {

		public Transaksi getTransaksiBynoTransaksi(int noTransaksi);
	    public void getTransaksiBytglTransaksi(int tglTransaksi);
	    public String getTglTransaksiByNoTransaksi(int noTransaksi);
	    
	    public List<Transaksi> getAllTransaksi();
	    public void saveTransaksi(Transaksi transaksi);
	    public void updateTransaksi(Transaksi transaksi);
	    public void deleteTransaksi(Transaksi transaksi);
}
