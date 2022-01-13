package gr.hua.dit.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "citizens")
public class Citizen {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "citizen_id")
	private int citizen_id;


	@Column(name = "name")
	private String name;

	@OneToMany(mappedBy = "citizen_id")
	private List<Animal> animals;

	public Citizen() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public int getCitizen_id() {
		return citizen_id;
	}



	public void setCitizen_id(int citizen_id) {
		this.citizen_id = citizen_id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public List<Animal> getAnimals() {
		return animals;
	}



	public void setAnimals(List<Animal> animals) {
		this.animals = animals;
	}



	@Override
	public String toString() {
		return "Departement [citizen_id=" + citizen_id + ", Animals=" + animals + "]";
	}

}
