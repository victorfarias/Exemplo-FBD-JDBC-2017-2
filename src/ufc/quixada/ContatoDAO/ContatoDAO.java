package ufc.quixada.ContatoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ufc.quixada.ContatoEntity.Contato;

public class ContatoDAO implements IContatoDAO {
	private Connection con;
	
	public ContatoDAO(Connection con) {
		this.con = con;
	}
	
	public List<Contato> find() {
		
		try {
			String sql = "select * from contatos";
			PreparedStatement ps = this.con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			ArrayList<Contato> contatos = new ArrayList<Contato>();
			while(rs.next()) {
				Contato c = new Contato(
						rs.getInt(1),
						rs.getString(2),
						rs.getString(3),
						rs.getString(4));
				contatos.add(c);
			}
			rs.close();
			ps.close();
			return contatos;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public boolean save(Contato contato) {
		String sql = "insert into contatos (nome, email, endereco) "
				+ "values (?,?,?)";

		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement(sql);
			ps.setString(1, contato.getNome());
			ps.setString(2, contato.getEmail());
			ps.setString(3, contato.getEndereco());
			ps.executeUpdate();
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(ps!=null) {
					ps.close();	
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		return false;
	}
	
}
