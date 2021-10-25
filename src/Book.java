
public class Book {
	
	private int id ;
	private String title ;
	private String author ;
	private String editor ;
	private int pageNb ;
	private String summary  ;
	private String Library  ;
	
	
	public Book() {
	
	}


	public Book(int id, String title, String author, String editor, int pageNb, String summary, String library) {

		this.id = id;
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.pageNb = pageNb;
		this.summary = summary;
		this.Library = library;
	}

	
	public boolean livresEgaux (Book book1, Book book2) {
		
		boolean egaux = false ;
		
		if (book1.toString().equals(book2.toString())) {
			egaux = true ;
		}
		
		return egaux ;
		
	}
	
	
	
	
	
	
	
	
	
	

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", author=" + author + ", editor=" + editor + ", pageNb="
				+ pageNb + ", summary=" + summary + ", Library=" + Library + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	public String getEditor() {
		return editor;
	}


	public void setEditor(String editor) {
		this.editor = editor;
	}


	public int getPageNb() {
		return pageNb;
	}


	public void setPageNb(int pageNb) {
		this.pageNb = pageNb;
	}


	public String getSummary() {
		return summary;
	}


	public void setSummary(String summary) {
		this.summary = summary;
	}


	public String getLibrary() {
		return Library;
	}


	public void setLibrary(String library) {
		Library = library;
	}
	
	
	
	

}
