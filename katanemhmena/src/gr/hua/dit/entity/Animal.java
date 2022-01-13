package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "animal")
public class Animal {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "animal_id")
	private int animal;

	@OneToOne(mappedBy = "animal", cascade = CascadeType.ALL)
	private Citizen citizen;

	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public int getAnimal() {
		return animal;
	}



	public void setAnimal(int animal) {
		this.animal = animal;
	}



	public Citizen getCitizen() {
		return citizen;
	}



	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}



	@Override
	public String toString() {
		return "Points [Animal=" + animal + ", Citizen=" + citizen + "]";
	}

}
