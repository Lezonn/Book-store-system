package model;

public class Pembeli {
	private String nama;
	private String email;
	
	public Pembeli(String nama, String email) {
		this.nama = nama;
		this.email = email;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
