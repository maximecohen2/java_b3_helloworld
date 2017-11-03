/**
 * Un exemple d'implémentation du Code César.
 *
 * Pour plus d'info, vous pouvez consulter
 * l'<a href="https://fr.wikipedia.org/wiki/Chiffrement_par_d%C3%A9calage">
 * article de Wikipedia</a>.
 *
 * @author David Gayerie
 *
 */
public class AlgoCesar {
	
	public String encrypte(String s) {
		char[] tab = s.toCharArray();
		for (int i = 0; i < tab.length; ++i) {
			if (Character.isLowerCase(tab[i])) {
				if (!Character.isLowerCase(tab[i] + 23)) {
					tab[i] = (char)('a' + (tab[i] + 23 - 'z') - 1);
				} else {
					tab[i] += 23;
				}
			}
			else if (Character.isUpperCase(tab[i])) {
				if (!Character.isUpperCase(tab[i] + 23)) {
					tab[i] = (char)('A' + (tab[i] + 23 - 'Z') - 1);
				} else {
					tab[i] += 23;
				}
			}
		}
		return new String(tab);
	}

	public static void main(String[] args) {
		AlgoCesar algoCesar = new AlgoCesar();

		String resultat = algoCesar.encrypte("");
	    System.out.println("".equals(resultat));
	
	    // étape 2
	    
	    resultat = algoCesar.encrypte("az");
	    System.out.println("xw".equals(resultat));
	
	    // étape 3
	    
	    resultat = algoCesar.encrypte("AZ");
	    System.out.println("XW".equals(resultat));
	
	    // étape 4
	    
	    resultat = algoCesar.encrypte("1,000.00");
	    System.out.println("1,000.00".equals(resultat));
	    
	
	    // étape 5
	    String phrase = "In cryptography, a Caesar cipher is one "
	                    + "of the simplest and most widely known "
	                    + "encryption techniques.";
	    resultat = algoCesar.encrypte(phrase);
	
	    String phraseAttendue = "Fk zovmqldoxmev, x Zxbpxo zfmebo fp lkb "
	                            + "lc qeb pfjmibpq xka jlpq tfabiv hkltk "
	                            + "bkzovmqflk qbzekfnrbp.";
	    System.out.println(phraseAttendue.equals(resultat));
	}
}
