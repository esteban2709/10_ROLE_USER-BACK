package co.project.proyecto.services.interfaces;

import java.util.Optional;

public interface CommonService <E>{

	public Iterable<E> findAll();

	public Optional<E> findById(Long id);
	
	public E save(E entity);
	
	public void delete(Long id);
}
