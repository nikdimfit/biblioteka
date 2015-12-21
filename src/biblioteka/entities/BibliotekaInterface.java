package biblioteka.entities;

import java.util.LinkedList;

public interface BibliotekaInterface {
	public void dodajKnjigu(Knjiga k);
	public void obrisiKnjigu(Knjiga k);
	
	public LinkedList<Knjiga> vratiSveKnjige();
	public LinkedList<Knjiga> pronadjiKnjigu(String naslov, long ISBN, String izdavac, Autor autor);
	
	public void ucitajIzFajla(String putanja);
	public void sacuvajUFajl(String putanja);
}