package org.uas.oop.daoimpl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.uas.oop.bean.BarangATK;
import org.uas.oop.bean.Pembeli;
import org.uas.oop.dao.PembeliDAO;
import org.uas.oop.utils.DatabaseUtil;
import org.uas.oop.views.TableView;

public class PembeliDAOimpl implements PembeliDAO {

	@Override
	public void getpembelibyId(int idpembeli) {
		DatabaseUtil db = new DatabaseUtil();
		Pembeli pembeli = new Pembeli();
		try {
			db.connect();
			
			String query = "SELECT * FROM pembeli WHERE id_pembeli = '"+idpembeli+"'";
			ResultSet rs = db.readData(query);
			
			if (rs.next()) {
				
				ResultSetMetaData metaData = rs.getMetaData();
				int jumlahkolom = metaData.getColumnCount();
				do {
					for (int i = 1; i <= jumlahkolom; i++) {
						pembeli.setIdPembeli(Integer.parseInt(rs.getObject(1).toString()));
						pembeli.setNamaPembeli(rs.getObject(2).toString());
						pembeli.setAlamatPembeli(rs.getObject(3).toString());
						pembeli.setNoHpPembeli(Integer.parseInt(rs.getObject(4).toString()));
						
												
					}
				} while (rs.next());
			} else {
				pembeli.setIdPembeli(0);
			}
			
			db.disconnect();
		} catch (SQLException ex) {
			System.out.println("The following error has occured : "+ex.getMessage());
		}
		
		TableView.displaytuplePembeli(pembeli);//org.uas.oop.views.TableView.displayTupleBarangATK(barangAtk);
		
	}
		
	

	@Override
	public Pembeli getpembelibyNama(String emailpembeli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pembeli getpembelibyAlamat(String alamatpembeli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pembeli getpembelibyNohp(int nohppembeli) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Pembeli> getAllPembeli() {
		List<Pembeli> listPembeli = new ArrayList<Pembeli>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			
			String query = "SELECT * FROM pembeli";
			
			ResultSet rs = db.readData(query);
			
			while (rs.next()) {
				
				Pembeli pembeli = new Pembeli();
				
				pembeli.setIdPembeli(Integer.parseInt(rs.getObject(1).toString()));
				pembeli.setNamaPembeli(rs.getObject(2).toString());
				pembeli.setAlamatPembeli(rs.getObject(3).toString());
				pembeli.setNoHpPembeli(Integer.parseInt(rs.getObject(4).toString()));
				
				listPembeli.add(pembeli);
			}
			db.disconnect();
		
		} catch (SQLException ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		
		
		return listPembeli;

	}

	@Override
	public void savePembeli(Pembeli pembeli) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO pembeli (id_pembeli, nama_pembeli, alamat_pembeli, nohp_pembeli)"
					+ "VALUES ("+pembeli.getIdPembeli()+", '"
					+ pembeli.getNamaPembeli()+"', '"
					+ pembeli.getAlamatPembeli()+"',"
					+ pembeli.getNoHpPembeli()+")";             //", "
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan");
		} catch(Exception ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		
	}

	@Override
	public void updatePembeli(Pembeli pembeli) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE pembeli set nama_pembeli='"+pembeli.getNamaPembeli()+"',"
					+ "alamat_pembeli='"+pembeli.getAlamatPembeli()+"',"
					+ "nohp_pembeli="+pembeli.getNoHpPembeli()+" WHERE id_pembeli='"+pembeli.getIdPembeli()+"'";
		
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui !");
		} catch (Exception e) {
			System.out.println("Terjadi error : "+e.getMessage());
		}
		
	}

	@Override
	public void deletePembeli(Pembeli pembeli) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM pembeli where id_pembeli='"+pembeli.getIdPembeli()+"'";
			db.executeQuery(query);
			TableView.displaytablePembeli(getAllPembeli());//org.uas.oop.views.TableView.displayBarangATK(getAllBarangatk());
		} catch (Exception e) {
			System.out.println("Terjadi Error : "+e.getMessage());
		}
		
	}
	
}
