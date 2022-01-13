package gr.hua.dit.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import gr.hua.dit.entity.*;
import javax.transaction.Transactional;

import org.hibernate.Session;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	@Transactional
	public void addAdmin(Admin admin) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(admin);

	}

	@Override
	@Transactional
	public void addVeget(Veget veget) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(veget);

	}

	@Override
	@Transactional
	public void addEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.save(employee);

	}

	@Override
	@Transactional
	public void deleteAdmin(Admin admin) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.delete(admin);

	}

	@Override
	@Transactional
	public void deleteVeget(Veget veget) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.delete(veget);

	}

	@Override
	@Transactional
	public void deleteEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.delete(employee);

	}

	@Override
	@Transactional
	public void alterAdmin(Admin admin) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.update(admin);

	}

	@Override
	@Transactional
	public void alterVeget(Veget veget) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.update(veget);

	}

	@Override
	@Transactional
	public void alterEmployee(Employee employee) {
		Session currentSession = sessionFactory.getCurrentSession();

		currentSession.update(employee);

	}

	@Override
	@Transactional
	public Admin getAdmin(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Admin.class, id);
	}

	@Override
	@Transactional
	public Veget getVeget(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Veget.class, id);
	}

	@Override
	@Transactional
	public Employee getEmployee(int id) {
		Session currentSession = sessionFactory.getCurrentSession();
		return currentSession.get(Employee.class, id);
	}

}
