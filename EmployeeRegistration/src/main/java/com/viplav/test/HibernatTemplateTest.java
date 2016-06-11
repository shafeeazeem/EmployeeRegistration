package com.viplav.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.viplav.dao.impl.PersonDAOImpl;
import com.viplav.form.PersonForm;
import com.viplav.model.PersonEntity;

public class HibernatTemplateTest {
public static void main(String args[])
{
//	HibernateDAOImpl hibernateDAOImpl = new HibernateDAOImpl();
	ApplicationContext  context = new ClassPathXmlApplicationContext("applicationContext.xml");
	PersonDAOImpl daoImpl = (PersonDAOImpl) context.getBean("personDAOImpl", PersonDAOImpl.class);
//	System.out.println(daoImpl.getAllPsersons());
//	PersonForm person = new PersonForm();
	PersonEntity person = new PersonEntity();
	person.setFirstName("Viplav2");
	person.setLastName("kallam");
	/*Employee emp = new Employee();
	emp.setFirstName("viplav");
	emp.setLastName("kallam");
//	emp.setEmpId(005);
*/	/*City city = new City();
	city.setCityId(003);
	emp.setCityId(city);*/
	

	/*City city = new City();
	city.setCityId(004);city.setCityName("Delhi");city.setCityState("UP");
	city.setEmpploye_city_id(emp);*/
	daoImpl.addPerson(person);
//	System.out.println(daoImpl.listEmployees());


}
}
