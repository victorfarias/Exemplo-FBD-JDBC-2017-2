package ufc.quixada.ContatoDAO;

import java.util.List;

import ufc.quixada.ContatoEntity.Contato;

public interface IContatoDAO {

	List<Contato> find();
	boolean save(Contato contato);
	
}
