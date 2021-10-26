
public class Book {
	
	private int id ;
	private String title ;
	private String author ;
	private String editor ;
	private String summary  ;
	private int pageNb ;	
	private int library_id  ;
	
	
	public Book() {
	
	}
	
	public Book(int id) {
		super();
		this.id = id;
	}

	public Book(String title, String author, String editor, String summary, int pageNb, int library_id) {
		super();
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.summary = summary;
		this.pageNb = pageNb;
		this.library_id = library_id;
	}

	public boolean livresEgaux (Book book1, Book book2) {
		
		boolean egaux = false ;
		
		if (book1.toString().equals(book2.toString())) {
			egaux = true ;
		}
		
		return egaux ;
		
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


	public int getLibrary_id() {
		return library_id;
	}


	public void setLibrary_id(int library_id) {
		this.library_id = library_id;
	}


	public Book(int id, String title, String author, String editor, String summary, int pageNb, int library_id) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.editor = editor;
		this.summary = summary;
		this.pageNb = pageNb;
		this.library_id = library_id;
	}
	

}
