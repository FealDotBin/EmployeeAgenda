package com.example.ws;
/**
 * 
 * @author CATELLO
 * Classe che contiene metodi di utilità necessari alla sanificazione dell'input proveniente
 * dall'interfaccia utente.
 */
public class InputValidator {

	/**
	 * Controlla che la stringa non sia null, vuota o composta da soli caratteri di escpape. Se tutti
	 * i controlli hanno esito positivo viene restituita la stringa in input ma eliminando gli spazi che
	 * la precedono e la seguono
	 * @param string Stringa da controllare e sanificare
	 * @param variableName campo dell'impiegato a cui la stringa dell'impiegato appartiene
	 * @return la stringa in input ma eliminando gli spazi che
	 * la precedono e la seguono
	 * @throws EmptyStringException Lanciata quando la stringa string è null, vuota o composta da soli
	 * caratteri di escape.
	 */
	public static String sanitizeString(String string, String variableName) throws EmptyStringException {
		if (string == null) {
			throw new EmptyStringException("Field " + variableName + " is mandatory");
		}
		string = string.trim();
		if (string.isEmpty()) {
			throw new EmptyStringException("Field " + variableName + " cannot be empty");
		}
		return string;
	}
	/**
	 * Se la stringa in input è nulla restituisce una stringa vuota, se non lo è restituisce la stringa
	 * in input ma eliminando gli spazi che la precedono e la seguono
	 * @param string Stringa da controllare e sanificare.
	 * @return restituisce una stringa vuota se la stringa in input è null, se non lo è restituisce la stringa
	 * in input ma eliminando gli spazi che la precedono e la seguono.
	 */
	public static String sanitizeStringCanBeNull(String string) {
		if (string == null) {
			string = "";
		} else {
			string = string.trim();
		}
		return string;
	}
}
