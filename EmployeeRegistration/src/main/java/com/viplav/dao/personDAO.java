/**
 * 
 */
package com.viplav.dao;

import java.util.List;

import com.viplav.form.PersonForm;
import com.viplav.model.PersonEntity;

/**
 * @author Rammohan
 *
 */
public interface personDAO {
//	 public void addPerson(PersonForm person);
	    public List<PersonForm> getAllPsersons();
	    public void deletePerson(Integer personId);
		public void addPerson(PersonEntity person);
}
