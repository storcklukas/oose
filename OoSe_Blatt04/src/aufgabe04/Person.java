package aufgabe04;

public class Person implements Comparable<Object> {
	String name;
	String vorname;
	int postleitzahl;
	String straße;
	int hausnummer;
	
	/*
	 * Das hier zur Aufgabe ist sicherlich nicht das geforderte... kein Plan
	 * Die Idee war bei den ints einen Vergleich durchzuführen (mit -1 bei this < zweitePerson, 0 bei == und 1 bei this > zweitePerson) und bei den Strings ein -2 bei ungleichheit zurückzugeben.
	 * einzige Möglichkeit die Strings auf größer/kleiner zu vergleichen wäre in dem man Buchstabe für Buchstabe den String abläuft... 
	 * (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Object o) {
		if (o instanceof Person) {
			Person zweitePerson = (Person)o;
			if (this.name.equals(zweitePerson.name)) {
				if (this.vorname.equals(zweitePerson.vorname)) {
					if (this.postleitzahl == zweitePerson.postleitzahl) {
						if (this.straße.equals(zweitePerson.straße)) {
							if (this.hausnummer == zweitePerson.hausnummer) return 0;
							else {
								if (this.hausnummer > zweitePerson.hausnummer) return 1;
								else return -1;
							}
						} else return -2;
					} else {
						if (this.postleitzahl > zweitePerson.postleitzahl) return 1;
						else return -1;
					}
				} else return -2;
			} else return -2;
		} else return -2;
	}
}
