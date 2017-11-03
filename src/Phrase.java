
public class Phrase {

	private String	words = "";
	private String	separator = " ";
	
	public void ajouter(String... newWords) {
		String[] newTab;
		if (this.words.equals("")) {
			newTab = new String[newWords.length];
			System.arraycopy(newWords, 0, newTab, 0, newWords.length);
		} else {
			newTab = new String[1 + newWords.length];
			newTab[0] = this.words;
			System.arraycopy(newWords, 0, newTab, 1, newWords.length);
		}
		this.words = String.join(separator, newTab);
	}
	
	public void ajouter(String newWord, int iteration) {
		String[] newTab;
		if (this.words.equals("")) {
			newTab =  new String[iteration];
			newTab[0] = newWord;
		} else {
			newTab =  new String[1 + iteration];
			newTab[0] = this.words;
			for (int i = 0; i < iteration; ++i) {
				newTab[1 + i] = newWord;
			}
		}
		this.words = String.join(separator, newTab);
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
