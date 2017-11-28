package br.ufc.quixada;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import ufc.quixada.ContatoDAO.ContatoDAO;
import ufc.quixada.ContatoDAO.IContatoDAO;
import ufc.quixada.ContatoEntity.Contato;


public class Main {

	public static void main(String[] args) {
		Connection con =  null;

		con = ConnectionFactory.getConnection("localhost", "postgres", "postgres", "alunoufc");

		IContatoDAO contatoDAO = new ContatoDAO(con);
		List<Contato> contatos = contatoDAO.find();

		for(Contato c: contatos) {
			System.out.println(c.getNome());
		}
		
		
		Contato contato = new Contato();
		contato.setNome("jorge");
		contato.setEmail("jorge@gmail.com");
		contato.setEndereco("rua rui barbosa, 123");
		contatoDAO.save(contato);

	}

}
