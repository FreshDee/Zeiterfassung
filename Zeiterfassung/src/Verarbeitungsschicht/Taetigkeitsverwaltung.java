package Verarbeitungsschicht;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Taetigkeitsverwaltung implements IF_Taetigkeitsverwaltung {
	
	private ArrayList<Taetigkeit>ExerciseList= new ArrayList<Taetigkeit>();
	
public boolean addMA ( boolean isbillable, Zeit start, Zeit end) throws FileNotFoundException, IOException{
		
		//Bei der Neuerstellung eines Mitarbeiters im System wird die ID fortlaufend vergeben und daher automatisch ermittelt.
		ExerciseList.add(new Taetigkeit(ExerciseList.size()+1, isbillable, start, end));
		speicher("MAListe1");
		return true;
	}
	
	public boolean deleteMA (String ID){
		for(int i=0; i<ExerciseList.size(); i++){
			if(ExerciseList.get(i).getTatigkeitsID() == Integer.parseInt(ID)){
				ExerciseList.remove(i);
				return true;
			}
		}
		JOptionPane.showMessageDialog(null,"Tätigkeit wurde nicht gefunden!","Löschen fehlgeschlagen", JOptionPane.ERROR_MESSAGE);
		return false;
	}
	
	public void speicher (String Datei) throws FileNotFoundException, IOException{
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(Datei+".dat"));
		out.writeObject(ExerciseList);
		out.close();
		
	}
	
	public void lesen(String Datei) throws FileNotFoundException, IOException, ClassNotFoundException{
		ObjectInputStream in = new ObjectInputStream (new FileInputStream(Datei+".dat"));
		ExerciseList=(ArrayList<Taetigkeit>) in.readObject();
		 in.close();
	}

	public void display() {
		
		for(int i= 0; i< ExerciseList.size(); i++){
			System.out.println(ExerciseList.get(i).toString());
		}
		
	}


	@Override
	public ArrayList<Taetigkeit> getExerciseList() {
		// TODO Auto-generated method stub
		return ExerciseList;
	}
	

}
