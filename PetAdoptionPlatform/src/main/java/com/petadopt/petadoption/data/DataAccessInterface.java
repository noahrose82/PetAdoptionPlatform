/**
 * Generic Data Access Interface defining standard CRUD operations.
 * 
 * @param <T> The type of entity the operations apply to.
 */
package com.petadopt.petadoption.data;

import java.util.List;

//Main class or interface for dataaccessinterface operations
/**
 * Interface defining standard CRUD methods for data persistence.
 */
public interface DataAccessInterface <T> {
// Method to handle findall functionality
	public List<T> findAll();
	public T findById(int id);
	public boolean create(T t);
	public boolean update(T t);
	public boolean delete(T t);
}
