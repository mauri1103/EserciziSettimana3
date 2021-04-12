package giorno1.Eccezioni;

import java.io.FileNotFoundException;
import java.sql.SQLException;

import java.util.Random;

public class EsempiBasiEcezzioni {

	public static void main(String[] args) {

		System.out.println("inizio programma");
		try {
			funzione1();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("eccezione SQL");
			e.printStackTrace();
		}
		System.out.println("fine programma");

	}

	public static void funzione1()throws SQLException {
		System.out.println("Inizio funzione1 ");
		try {
			funzione2();
		} catch (FileNotFoundException x) {
			System.out.println("Ho gestito l'eccezione");
			System.out.println(x.getMessage()); //getMessage viene preso dalla funzione 3 
//		funzione2();
			
//		}
//		catch (SQLException e) {
//			System.out.println("eccezione2 gestita");
//			System.out.println(e.g);
//			
		}
		finally {
			System.out.println("Funzione 1 questa linea la vediamo sempre");
		}
		System.out.println("finita funzione1");

	}

	public static void funzione2() throws FileNotFoundException, SQLException {
		System.out.println("Inizio funzione2 ");
		funzione3();
		System.out.println("finita funzione2");

	}

	public static void funzione3() throws FileNotFoundException, SQLException {
		Random r = new Random();
		int dado = r.nextInt(2);
		if (dado == 0) {
			throw new FileNotFoundException("file non trovato");	
		}else {
			throw new SQLException("Errore SQL");// le dichiarazioni possono essere aggiunte fino a quando sono necessarie
			
		}
		
		
//		System.out.println("Inizio funzione3 ");
//		throw new FileNotFoundException("Non ho trovato il File");

		// System.out.println("Finita funzione3"); il codice non raggiunge mai questa
		// riga di codice perche viene lanciata l'eccezione.

	}

}
