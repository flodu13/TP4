package fr.pizzeria.model;

public class Pizza {

	public int id;
	public String code;
	public String libelle;
	public double prix;
	public static int idPizz =0;
	
	
	public Pizza(String code, String libelle, double prix) {
		this.id = idPizz++;
		
		this.code= code;
		this.libelle= libelle;
		this.prix= prix;
		
	}
	
	public Pizza( int id, String code, String libelle, double prix) {
		this.id= id;
		this.code= code;
		this.libelle= libelle;
		this.prix= prix;
}
}