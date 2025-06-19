package com.petadopt.petadoption.data;

import java.util.List;

public interface DataAccessInterface <T> {
	
	public List<T> findAll();
	public T findById(int id);
	public boolean create(T t);
	public boolean update(T t, int id);
	public boolean delete(int id);
}
