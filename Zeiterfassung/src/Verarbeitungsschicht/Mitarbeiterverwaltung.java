package Verarbeitungsschicht;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Mitarbeiterverwaltung implements IF_Mitarbeiterverwaltung{
	
	private ArrayList <Mitarbeiter> MAlist = new ArrayList <Mitarbeiter>();
	
	public Mitarbeiter login (String name, String passwort){
		
		//Abgleich der User-Credentials: Die Mitarbeiter werden in den Onboarding-Maﬂnahmen dahingehend geschult, dass als Accountname die MitarbeiterID zu verwenden ist.
		for(int i=0; i<MAlist.size(); i++){
			if(MAlist.get(i).getName().equals(name) && MAlist.get(i).getPassword().equals(passwort)) return MAlist.get(i);
		
		}
		JOptionPane.showMessageDialog(null,"Falscher Benutzername beziehungsweise falsches Passwort eingegeben!","Login-Fehler", JOptionPane.ERROR_MESSAGE);
		return null;
	}
	
	
	public boolean addMA (String name, Position pos, String password, double budget) throws FileNotFoundException, IOException{
		
		//Bei der Neuerstellung eines Mitarbeiters im System wird die ID fortlaufend vergeben und daher automatisch ermittelt.
		MAlist.add(new Mitarbeiter(MAlist.size()+1,name, pos , password, budget ));
		speicher("MAListe1");
		return true;
	}
	
	public boolean deleteMA (String ID){
		for(int i=0; i<MAlist.size(); i++){
			if(MAlist.get(i).getMA_ID() == Integer.parseInt(ID)){
				MAlist.remove(i);
				return true;
			}
		}
		JOptionPane.showMessageDialog(null,"Mitarbeiter wurde nicht gefunden!","Lˆschen fehlgeschlagen", JOptionPane.ERROR_MESSAGE);
		return false;
	}
	
	public void speicher (String Datei) throws FileNotFoundException, IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Datei+".dat"));
		out.writeObject(MAlist);
		out.close();
		
	}
	
	public void lesen(String Datei) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream (new FileInputStream(Datei+".dat"));
		MAlist=(ArrayList<Mitarbeiter>) in.readObject();
		 in.close();
	}

	public void display() {
		
		for(int i= 0; i< MAlist.size(); i++){
			System.out.println(MAlist.get(i).toString());
		}
		
	}

	@Override
	public ArrayList<Mitarbeiter> getMAlist() {
		// TODO Auto-generated method stub
		return MAlist;
	}
	
	

}
