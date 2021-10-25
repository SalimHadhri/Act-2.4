import java.awt.List;
import java.util.ArrayList;

public class Library {

	
	private int id ;
	private String name ;
	private String address ;
	private int numTel ;

	
	
	private ArrayList<Book> listBookLibrary = new ArrayList<Book>();
	private ArrayList<Rent> listRentLibraby = new ArrayList<Rent>();
	
	
	public Library() {

	}

	
	
	public Library(int id, String name, String address, int numTel, ArrayList<Book> listBookLibrary,
			ArrayList<Rent> listRentLibraby) {

		this.id = id;
		this.name = name;
		this.address = address;
		this.numTel = numTel;
		this.listBookLibrary = listBookLibrary;
		this.listRentLibraby = listRentLibraby;
	}



	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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



	public ArrayList<Book> getListBookLibrary() {
		return listBookLibrary;
	}



	public void setListBookLibrary(ArrayList<Book> listBookLibrary) {
		this.listBookLibrary = listBookLibrary;
	}



	public ArrayList<Rent> getListRentLibraby() {
		return listRentLibraby;
	}



	public void setListRentLibraby(ArrayList<Rent> listRentLibraby) {
		this.listRentLibraby = listRentLibraby;
	}



	@Override
	public String toString() {
		return "Library [id=" + id + ", name=" + name + ", address=" + address + ", numTel=" + numTel
				+ ", listBookLibrary=" + listBookLibrary + ", listRentLibraby=" + listRentLibraby + "]";
	}

	
	
	
	


	
	
	
	
}
