package gr.hua.dit.dao;

import gr.hua.dit.entity.*;

public interface AdminDAO {

	public void addAdmin(Admin admin);

	public void addVeget(Veget veget);

	public void addEmployee(Employee employee);

	public void deleteAdmin(Admin admin);

	public void deleteVeget(Veget veget);

	public void deleteEmployee(Employee employee);

	public void alterAdmin(Admin admin);

	public void alterVeget(Veget veget);

	public void alterEmployee(Employee employee);

	public Admin getAdmin(int id);

	public Employee getEmployee(int id);
	
	public Veget getVeget(int id);

}
