public class Card {
	private String title;
	private String author;
	private String subject;
	public Card() {

	}
	public Card(String title,String author,String subject) {
		this.title=title;
		this.author=author;
		this.subject=subject;
	}
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public String getSubject() {
		return this.subject;
	}

}