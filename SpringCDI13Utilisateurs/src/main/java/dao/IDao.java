package dao;

import java.util.List;

public interface IDao<T> {

	public List<T> findAll();
	
	public T findOne(T data);
	
	public T findOne(Integer id);
	
	public void insert(T data);
	
	public void update (T data);
	public void update (Integer id);
	
	public void delete (T data);
	public void delete (Integer id);
	
	public void deleteAll();
	
}



