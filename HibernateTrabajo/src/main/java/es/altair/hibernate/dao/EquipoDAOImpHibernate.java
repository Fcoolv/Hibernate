package es.altair.hibernate.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import es.altair.hibernate.bean.Equipos;

public class EquipoDAOImpHibernate implements EquipoDAO {

	public void save(Equipos equipo) {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session sesion = sf.openSession();
		
		try {
			sesion.beginTransaction();
			sesion.save(equipo);
			sesion.getTransaction().commit();
		} catch (Exception e) {
			e.getMessage();
		} finally {
			sesion.close();
			sf.close();
        }

	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(int id) {
		// TODO Auto-generated method stub
		
	}

}
