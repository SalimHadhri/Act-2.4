import java.util.ArrayList;

public class User {

	
	
	private int id ;
	private String prenom ;
	private String nom ;
	private String address ;
	private int numTel ;
	private String mail  ;
	
	private ArrayList<Rent> listRentUser = new ArrayList<Rent>();

	public User() {

	}

	public boolean usersEgaux ( User u1 , User u2) {
		
		boolean egaux = false ;
		if (u1.toString().equals(u2.toString())) {
				
			egaux = true  ;
		
		}
		return egaux ;
	}
	
	public User(int id, String prenom, String nom, String address, int numTel, String mail,
			ArrayList<Rent> listRentUser) {

		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.address = address;
		this.numTel = numTel;
		this.mail = mail;
		this.listRentUser = listRentUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public ArrayList<Rent> getListRentUser() {
		return listRentUser;
	}

	public void setListRentUser(ArrayList<Rent> listRentUser) {
		this.listRentUser = listRentUser;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", address=" + address + ", numTel=" + numTel
				+ ", mail=" + mail + ", listRentUser=" + listRentUser + "]";
	}
	
	
	
	
	
}
