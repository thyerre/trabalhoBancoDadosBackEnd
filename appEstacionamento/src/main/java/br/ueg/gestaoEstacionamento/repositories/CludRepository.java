package br.ueg.gestaoEstacionamento.repositories;

import java.io.Serializable;

import org.springframework.data.repository.Repository;

public interface CludRepository <T, id_login extends Serializable> extends Repository<T, id_login>
{

	<S extends T>S save(S var1);
	
	<S extends T>Iterable<S> save(Iterable<S> var1);
 
	T findOne(id_login var1);
	
	boolean exists(id_login var1);

	Iterable<T> findAll();
	
	Iterable<T> findAll(Iterable<id_login> var1);
	
	long count();
	
	void delete(id_login var1);
	 
	void delete (T var1);
	
	void delete(Iterable<? extends T> var1);
	
	void deleteAll();
}
