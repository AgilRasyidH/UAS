package org.uas.oop.daoimpl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import org.uas.oop.utils.DatabaseUtil;
import org.uas.oop.views.TableView;
import org.uas.oop.bean.Transaksi;
import org.uas.oop.dao.TransaksiDAO;

public class TransaksiDAOimpl implements TransaksiDAO {

	public class TransaksiDAOImpl implements TransaksiDAO{
		@Override
		public Transaksi getTransaksiBynoTransaksi(int noTransaksi) {
			
			return null;
		}


		@Override
		public void getTransaksiBytglTransaksi(int tglTransaksi) {
			DatabaseUtil db = new DatabaseUtil();
			Transaksi transaksi = new Transaksi();
			try {
				db.connect();
				
				String query = "SELECT * FROM transaksi WHERE tgl_transaksi = '"+ tglTransaksi +"'";
				ResultSet rs = db.readData(query);
				
				if (rs.next()) {
					
					ResultSetMetaData metaData = rs.getMetaData();
					int jumlahkolom = metaData.getColumnCount();
					do {
						for (int i = 1; i <= jumlahkolom; i++) {
							transaksi.setNoTransaksi(Integer.parseInt(rs.getObject(1).toString()));
							transaksi.setTglTransaksi(Integer.parseInt(rs.getObject(2).toString()));
							transaksi.setJmlhBeli(Double.parseDouble(rs.getObject(3).toString()));						
						}
					} while (rs.next());
				} else {
					transaksi.setTglTransaksi(0);
				}
				
				db.disconnect();
			} catch (SQLException ex) {
				System.out.println("The following error has occured : "+ex.getMessage());
			}
			
			TableView.displayTupleTransaksi(transaksi);		
		}

		@Override
		public List<Transaksi> getAllTransaksi() {
			List<Transaksi> listTransaksi = new ArrayList<Transaksi>();
			DatabaseUtil db = new DatabaseUtil();
			try {
				db.connect();
				
				String query = "SELECT * FROM transaksi";
				
				ResultSet rs = db.readData(query);
				
				while (rs.next()) {
					
					Transaksi transaksi = new Transaksi();
					
					transaksi.setNoTransaksi(Integer.parseInt(rs.getObject(1).toString()));
					transaksi.setTglTransaksi(Integer.parseInt(rs.getObject(2).toString()));
					transaksi.setJmlhBeli(Double.parseDouble(rs.getObject(3).toString()));
					
					listTransaksi.add(transaksi);
				}
				db.disconnect();
			
			} catch (SQLException ex) {
				System.out.println("Terjadi error : "+ex.getMessage());
			}
			
			return listTransaksi;
		}
		
		@Override
		public void saveTransaksi(Transaksi transaksi) {
			DatabaseUtil db = new DatabaseUtil();
			String query;
			try {
				db.connect();
				query = "INSERT INTO transaksi (no_transaksi, tgl_transaksi, jmlh_beli)"
						+ "VALUES ("+transaksi.getNoTransaksi()+", '"
						+ transaksi.getTglTransaksi()+"',"
						+ transaksi.getJmlhBeli()+")";
				
				db.executeQuery(query);
				System.out.println("Data berhasil ditambahkan");
			} catch(Exception ex) {
				System.out.println("Terjadi error : "+ex.getMessage());
			}
		}
		
		@Override
		public void updateTransaksi(Transaksi transaksi) {
			DatabaseUtil db = new DatabaseUtil();
			String query;
			try {
				db.connect();
				query = "UPDATE transaksi SET no_transaksi = '"+transaksi.getNoTransaksi()+"',"
				+ "tgl_transaksi = '"+transaksi.getTglTransaksi()+"',"
				+ "jmlh_beli = "+transaksi.getJmlhBeli()+"'";
			
				db.executeQuery(query);
				System.out.println("Data berhasil diperbarui !");
			} catch (Exception e) {
				System.out.println("Terjadi error : "+e.getMessage());
			}
			
		}

		@Override
		public void deleteTransaksi(Transaksi transaksi) {
			DatabaseUtil db = new DatabaseUtil();
			String query;
			try {
				db.connect();
				query = "DELETE FROM transaksi where tgl_transaksi = '"+transaksi.getTglTransaksi()+"'";
				db.executeQuery(query);
				TableView.displayTabelTransaksi(getAllTransaksi());
			} catch (Exception e) {
				System.out.println("Terjadi Error : "+e.getMessage());
			}
		}


		@Override
		public String getTglTransaksiByNoTransaksi(int noTransaksi) {
			// TODO Auto-generated method stub
			return null;
		}
		
	}

	@Override
	public Transaksi getTransaksiBynoTransaksi(int noTransaksi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getTransaksiBytglTransaksi(int tglTransaksi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getTglTransaksiByNoTransaksi(int noTransaksi) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaksi> getAllTransaksi() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveTransaksi(Transaksi transaksi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateTransaksi(Transaksi transaksi) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteTransaksi(Transaksi transaksi) {
		// TODO Auto-generated method stub
		
	}
}
