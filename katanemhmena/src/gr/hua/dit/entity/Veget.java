package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "veget")
public class Veget extends User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "veget_id")
	private int veget_id;

	@Column(name = "town")
	private String town;

	@Column(name = "date_of_birth")
	private String date_of_birth;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "veget_points_id")
	private Form form;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH })
	@JoinColumn(name = "veget_form_id")
	private Animal animal;

	public Veget() {
		// TODO Auto-generated constructor stub
	}
	
	

	public int getVeget_id() {
		return veget_id;
	}



	public void setVeget_id(int veget_id) {
		this.veget_id = veget_id;
	}



	public String getTown() {
		return town;
	}



	public void setTown(String town) {
		this.town = town;
	}



	public String getDate_of_birth() {
		return date_of_birth;
	}



	public void setDate_of_birth(String date_of_birth) {
		this.date_of_birth = date_of_birth;
	}



	public Form getForm() {
		return form;
	}



	public void setForm(Form form) {
		this.form = form;
	}



	public Animal getAnimal() {
		return animal;
	}



	public void setAnimal(Animal animal) {
		this.animal = animal;
	}



	@Override
	public String toString() {
		return "Vegeterian [veget_id=" + veget_id + ", town=" + town + ", date_of_birth=" + date_of_birth
				+ ", Animal=" + animal + ", form="
				+ form + "]";
	}

}
