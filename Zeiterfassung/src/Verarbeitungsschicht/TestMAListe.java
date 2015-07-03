package Verarbeitungsschicht;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestMAListe {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		Mitarbeiterverwaltung list = new Mitarbeiterverwaltung();
		//list.addMA("MA1", new Projektleiter(), "pp", 40);
		//list.addMA("MA2", new Projektleiter(), "pw", 40);
		list.lesen("MAListe1");
		//list.display();
		Mitarbeiter m1=list.login("MA1", "pp");
		if(m1!=null)System.out.println(m1.toString());
		m1 =list.login("MA2","pr");
		if(m1!=null)System.out.println(m1.toString());
		
//		Mitarbeiter n= list.login("2", "pp");
//		if(n!=null)System.out.println(n.getName());
	}
	
}
