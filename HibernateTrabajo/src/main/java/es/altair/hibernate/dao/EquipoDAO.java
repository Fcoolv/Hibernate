package es.altair.hibernate.dao;

import es.altair.hibernate.bean.Equipos;

public interface EquipoDAO {

	public void save(Equipos equipo);
	
	public void delete(int id);
	
	public void update(int id);
}
