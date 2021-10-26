import java.awt.List;

import java.util.ArrayList;

public class Library {

	
	private int id ;
	private String lib_name  ;
	private String addresse  ;
	private int numTel  ;
	private ArrayList<Book> listBookLibrary = new ArrayList<Book>();
	private ArrayList<Rent> listRentLibraby = new ArrayList<Rent>();
	
	
	public Library() {

	}

	public Library(int id, String lib_name, String addresse, int numTel) {
		super();
		this.id = id;
		this.lib_name = lib_name;
		this.addresse = addresse;
		this.numTel = numTel;
	}

	public Library(int id, String lib_name, String addresse, int numTel, ArrayList<Book> listBookLibrary,
			ArrayList<Rent> listRentLibraby) {
		super();
		this.id = id;
		this.lib_name = lib_name;
		this.addresse = addresse;
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

	public String getLib_name() {
		return lib_name;
	}

	public void setLib_name(String lib_name) {
		this.lib_name = lib_name;
	}

	public String getAddresse() {
		return addresse;
	}

	public void setAddresse(String addresse) {
		this.addresse = addresse;
	}

	@Override
	public String toString() {
		return "Library [id=" + id + ", lib_name=" + lib_name + ", addresse=" + addresse + ", numTel=" + numTel
				+ ", listBookLibrary=" + listBookLibrary + ", listRentLibraby=" + listRentLibraby + "]";
	}
	
}
