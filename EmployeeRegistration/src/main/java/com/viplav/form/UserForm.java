/**
 * 
 */
package com.viplav.form;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

/**
 * @author Rammohan
 *
 */
public class UserForm {

@NotEmpty
private String userName;
@NotNull
@Size(min=1,max=15)
private String passWord;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() {
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
}
