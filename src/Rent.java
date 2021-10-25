import java.util.Date;

public class Rent {

	
	private int id ;
	private User userRent ;
	private Book bookRent ;
	private Date DatePret ;
	private Date DateFin ;
	public Rent() {

	}
	public Rent(int id, User userRent, Book bookRent, Date datePret, Date dateFin) {

		this.id = id;
		this.userRent = userRent;
		this.bookRent = bookRent;
		DatePret = datePret;
		DateFin = dateFin;
	}
	
	public boolean rentEgaux ( Rent r1, Rent r2) {
		
		boolean egaux = false ;
		
		if (r1.toString().equals(r2.toString())) {
			
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
	public User getUserRent() {
		return userRent;
	}
	public void setUserRent(User userRent) {
		this.userRent = userRent;
	}
	public Book getBookRent() {
		return bookRent;
	}
	public void setBookRent(Book bookRent) {
		this.bookRent = bookRent;
	}
	public Date getDatePret() {
		return DatePret;
	}
	public void setDatePret(Date datePret) {
		DatePret = datePret;
	}
	public Date getDateFin() {
		return DateFin;
	}
	public void setDateFin(Date dateFin) {
		DateFin = dateFin;
	}
	@Override
	public String toString() {
		return "Rent [id=" + id + ", userRent=" + userRent + ", bookRent=" + bookRent + ", DatePret=" + DatePret
				+ ", DateFin=" + DateFin + "]";
	}
	
	
	
	
}
