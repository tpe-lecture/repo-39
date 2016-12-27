package tpe.testate.fixkomma;


/**
 * die Klasse Festkommazahl berechnet die Addition 
 * sowie Subtraktion von long-Werten
 * sowie die Ausgaben der nach/vor-Kommastellen
 * 
 * der Konstruktor erzeugt ein Objekt, bei dem man 2 long- 
 * Zahlen als vor/nach-Kommazahlen eingibt
 * 
 * 
 *
 */
public class Festkommazahl {
	long vorkomma;
	long nachkomma;
	Festkommazahl(long vor, long nach) {
		this.vorkomma=Math.abs(vor);
		for(int x=0; nach>=100; x++){
			nach = nach/10;
		}
		this.nachkomma=Math.abs(nach * 100);
	}
	
	
	/**
	 * die Methode gibt die vor-Kommastelle
	 * 
	 * @return die vor-Kommastellen
	 */
	public long getVorkommaStellen(){
		return vorkomma;
	}
	/**
	 * die Methode gibt mir die nach Kommastelle
	 * 
	 * @return  nach Komma
	 */
	public long getNachkommaStellen(){
		return nachkomma /100;
		
	}
	/**
	 *  die Addition von vor+vor und nach+nach der
	 * Kommastellen
	 * @param z2 
	 * @return gibt den addierten Wert zurück 
	 * 
	 */
	public Festkommazahl addiere(Festkommazahl z2) {
		return new Festkommazahl(z2.vorkomma + vorkomma + Math.round((z2.nachkomma + nachkomma)/10000), (z2.nachkomma + nachkomma)/100%100);
	} 
	/**
	 *  die Subtraktion von vor+vor und nach+nach der 
	 * Kommastellen
	 * @param z2
	 * @return  gibt den subtrahierten Wert zurück
	 * 
	 */
	public Festkommazahl subtrahiere(Festkommazahl z2) {
		return new Festkommazahl(z2.vorkomma - vorkomma - Math.round((z2.nachkomma - nachkomma)/10000), (z2.nachkomma - nachkomma)/100%100);
	}


	
	/**
	 * den gesamten Wert als String einlesen und zurückgeben
	 * 
	 * @return  String orkomma + nachkomma
	 */
	
	public String toString() {
		long temp = nachkomma/100;
		Math.round(temp);
		String ausgabe;
		if(temp < 10){
			ausgabe = vorkomma + ",0" + temp;

		} else {
			ausgabe = vorkomma + "," + temp;

		}
		return ausgabe;
	}




	/**
	 * vergleich zweier Zahlen auf Gleichheit die 
	 * Zahlen stimmen dann überein, wenn alle Stellen übereinstimmen
	 * @return wahr oder falsch
	 * 
	 */
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Festkommazahl other = (Festkommazahl) obj;
		if (nachkomma != other.nachkomma)
			return false;
		if (vorkomma != other.vorkomma)
			return false;
		return true;
	}
}
	