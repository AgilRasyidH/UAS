package org.uas.oop.daoimpl;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.uas.oop.bean.Pegawai;
import org.uas.oop.dao.PegawaiDAO;
import org.uas.oop.utils.DatabaseUtil;
import org.uas.oop.views.TableView;
import org.uas.oop.utils.DatabaseUtil;

public class PegawaiDAOimpl implements PegawaiDAO {

	@Override
	public Pegawai getPegawaibyId(int idpegawai) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pegawai getPegawaibyNama(String nama) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Pegawai getPegawaibyGaji(Double gaji) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public String getPegawaibyPassword(String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getPegawaibyEmail(String email) {
		DatabaseUtil db = new DatabaseUtil();
		Pegawai pegawai = new Pegawai();
		try {
			db.connect();
			
			String query = "SELECT *from pegawai where email ='"+email+"'";
			ResultSet rs = db.readData(query);
			
			if(rs.next()) {
				ResultSetMetaData metaData = rs.getMetaData();
				int jumlahkolom = metaData.getColumnCount();
				do {
					for (int i = 1; i <= jumlahkolom; i++) {
						pegawai.setIdpegawai(Integer.parseInt(rs.getObject(1).toString()));
						pegawai.setNamapegawai(rs.getObject(2).toString());
						pegawai.setEmail(rs.getObject(3).toString());
						pegawai.setPassword(rs.getObject(4).toString());
						pegawai.setGaji(Double.parseDouble(rs.getObject(5).toString()));
					}
				} while (rs.next());
			} else {
				pegawai.setIdpegawai(0);
			}
			
			db.disconnect();
		} catch (SQLException ex) {
			System.out.println("The following error has occured : "+ex.getMessage());
		}
		
		TableView.displaytuplePegawai(pegawai);
		
	}

	@Override
	public List<Pegawai> getAllpegawai() {
		List<Pegawai> listPegawai = new ArrayList<Pegawai>();
		DatabaseUtil db = new DatabaseUtil();
		try {
			db.connect();
			
			String query = "SELECT * FROM pegawai";
			
			ResultSet rs = db.readData(query);
			
			while (rs.next()) {
				
				Pegawai pegawai = new Pegawai();
				
				pegawai.setIdpegawai(Integer.parseInt(rs.getObject(1).toString()));
				pegawai.setNamapegawai(rs.getObject(2).toString());
				pegawai.setEmail(rs.getObject(3).toString());
				pegawai.setPassword(rs.getObject(4).toString());
				pegawai.setGaji(Double.parseDouble(rs.getObject(5).toString()));
				
				listPegawai.add(pegawai);
			
			}
			db.disconnect();
		} catch(SQLException ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		return listPegawai;
	}

	@Override
	public Pegawai login(String email, String password) {
		DatabaseUtil db = new DatabaseUtil();
		Pegawai pegawai = new Pegawai();
		pegawai = null;
		try {
			db.connect();
			
			String query = "SELECT * FROM pegawai where email = '"+email+"' AND password='"+password+"'";
			
			ResultSet rs = db.readData(query);
			
			List<Pegawai> listpegawai = new ArrayList<Pegawai>();
			
			while (rs.next()) {
				Pegawai lgn = new Pegawai();
				lgn.setIdpegawai(Integer.parseInt(rs.getObject(1).toString()));
				lgn.setNamapegawai(rs.getObject(2).toString());
				lgn.setEmail(rs.getObject(3).toString());
				lgn.setPassword(rs.getObject(4).toString());
				lgn.setGaji(Double.parseDouble(rs.getObject(5).toString()));
				
				listpegawai.add(lgn);
				
				for(Pegawai lg : listpegawai) {
					if (email.equals(lgn.getEmail()) && password.equals(lg.getPassword())) {
						pegawai = lg;
						
					}
				}
			}
			
				db.disconnect();
		} catch (SQLException ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		return pegawai;
	}

	@Override
	public void savePegawai(Pegawai pegawai) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "INSERT INTO pegawai (id_pegawai, nama_pegawai, email, password, gaji_pegawai)"
					+ "VALUES ("+pegawai.getIdpegawai()+", '"
					+ pegawai.getNamapegawai()+"', '"
					+ pegawai.getEmail()+"', '"
					+ pegawai.getPassword()+"', "
					+ pegawai.getGaji()+")";
			
			db.executeQuery(query);
			System.out.println("Data berhasil ditambahkan");
		} catch(Exception ex) {
			System.out.println("Terjadi error : "+ex.getMessage());
		}
		
	}

	@Override
	public void updatePegawai(Pegawai pegawai) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "UPDATE pegawai SET id_pegawai='"+pegawai.getIdpegawai()+"',"
			+ "nama_pegawai='"+pegawai.getNamapegawai()+"',"
			+ "password="+pegawai.getPassword()+","
			+ "gaji_pegawai="+pegawai.getGaji()+" WHERE email='"+pegawai.getEmail()+"'";
		
			db.executeQuery(query);
			System.out.println("Data berhasil diperbarui !");
		} catch (Exception e) {
			System.out.println("Terjadi error : "+e.getMessage());
		}
		
	}
		

	@Override
	public void deletePegawai(Pegawai pegawai) {
		DatabaseUtil db = new DatabaseUtil();
		String query;
		try {
			db.connect();
			query = "DELETE FROM pegawai where email='"+pegawai.getEmail()+"'";
			db.executeQuery(query);
			TableView.displaytablePegawai(getAllpegawai());
		} catch (Exception e) {
			System.out.println("Terjadi Error : "+e.getMessage());
	}
			
	}
}
