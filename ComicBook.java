package simo20;

public class ComicBook extends Book {
	
	String characterName;
	
    ComicBook(double regularPrice, String publisher, int yearPublished, String charecterName) {
		
		super(regularPrice, publisher, yearPublished);
		this.setCharacterName(charecterName);
        
	}

    public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}
