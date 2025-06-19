package com.petadopt.petadoption.data; // Package declaration

import java.util.List; // Import required class

public interface DataAccessInterface <T> { // Interface declaration
	
	public List<T> findAll();
	public T findById(int id);
	public boolean create(T t);
	public boolean update(T t, int id);
	public boolean delete(int id);
}
