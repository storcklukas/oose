package aufgabe04;

import java.util.concurrent.ExecutionException;

public class Person implements Comparable<Object> {
	String name;
	String vorname;
	int postleitzahl;
	String stra�e;
	int hausnummer;
	
	/*
	 * Ich vermute mal so war das ganze gemeint.
	 * Soweit ich das verstanden habe ist das Compareable Interface f�rs sortieren gedacht, gibt also letztendlich zur�ck ob das Objekt in frage dr�ber drunter oder auf der gleichen Stelle stehen muss.
	 * F�r die Strings habe ich einfach die bereits bei denen eingebaute compareTo Funktion benutzt (sind auch Compareable) und f�r Integer habe ich einfach nach der Wertigkeit geguckt
	 * Die Abfragen gucken einfach nur immer ob es kleiner ist (also drunter eingeordnet werden muss), wenn dies nicht der Fall ist wird eine positive Zahl ausgegeben. Ist dies jedoch der Fall wird das n�chste Atribut angeguckt um 
	 * danach zu ordnen bis am Ende nurnoch die Gleichheitsabfrage bleibt
	 */
	@Override
	public int compareTo(Object o) {
	
		Person target = (Person)o;
		if(this.name.compareTo(target.name)<=0) {
			if(this.vorname.compareTo(target.vorname)<=0) {
				if(this.postleitzahl<=target.postleitzahl) {
					if(this.stra�e.compareTo(target.stra�e)<=0) {
						if(this.hausnummer<=target.hausnummer) {
							if(this.hausnummer==target.hausnummer) {
								return 0;
							}
						}
						return target.hausnummer;
					}
					return this.stra�e.compareTo(target.stra�e);
				}
				return target.postleitzahl;
			}
			return this.vorname.compareTo(target.vorname);
		}
		return this.name.compareTo(target.name);
	}
	
}
