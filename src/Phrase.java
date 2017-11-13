
public class Phrase {

	private String	words = "";
	private String	separator = " ";
	
	public void ajouter(String newWord) {
		this.words += (this.words.equals("")) ? newWord : this.separator + newWord;
	}
	
	public void ajouter(String... newWords) {
		for (String newWord : newWords) {
			this.ajouter(newWord);
		}
	}
	
	public void ajouter(String newWord, int iteration) {
		for (int i = 0; i < iteration; ++i) {
			this.ajouter(newWord);
		}
	}
	
	public void setSeparateur(String separator) {
		this.separator = separator;
	}
	
	public void setSeparateur(char separator) {
		this.separator = String.valueOf(separator);
	}
	
	public int getNbLettres() {
		int nb = 0;
		char[] tab = this.words.toCharArray();
		for (int i = 0; i < this.words.length(); ++i) {
			if (Character.isAlphabetic(tab[i])) {
				++nb;
			}
		}
		return (nb);
	}
	
	public String toString() {
	    return this.words + ".";
	  }
	
	public static void main(String[] args) {
		Phrase phrase = new Phrase();
		phrase.ajouter("Une");
		phrase.ajouter("classe");
		phrase.ajouter("pour");
		phrase.ajouter("ajouter");
		phrase.ajouter("des mots");
		phrase.setSeparateur(" et encore ");
		phrase.ajouter("des mots", 3);
		phrase.setSeparateur(' ');
		phrase.ajouter("toujours", "et", "encore");

		System.out.println(phrase);
		System.out.println(phrase.getNbLettres());
	}
}
