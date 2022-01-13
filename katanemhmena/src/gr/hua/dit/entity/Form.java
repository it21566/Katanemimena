package gr.hua.dit.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "form")
public class Form {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "form_id")
	private int form_id;

	@OneToOne(mappedBy = "form", cascade = { CascadeType.ALL })
	private Citizen citizen;

	@OneToOne(cascade = { CascadeType.ALL })
	@JoinColumn(name = "check_id")
	private Check check;

	
	
	public int getForm_id() {
		return form_id;
	}

	public void setForm_id(int form_id) {
		this.form_id = form_id;
	}

	public Citizen getCitizen() {
		return citizen;
	}

	public void setCitizen(Citizen citizen) {
		this.citizen = citizen;
	}

	public Check getCheck() {
		return check;
	}

	public void setCheck(Check check) {
		this.check = check;
	}

	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Form [Form_id=" + form_id + ", Citizen=" + citizen + ", check="
				+ check + "]";
	}

}
