package com.qualityOfLife.seguroDeVida.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.qualityOfLife.seguroDeVida.web.forms.EmpleadoForm;

public class EmpleadoFormValidator  implements Validator{
	
	public boolean supports(Class<?> clazz){
		return EmpleadoForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors){
		//RegisterEmployeeForm registerEmployeeForm = (RegisterEmployeeForm)target;
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "mandatoryField");
		if(errors.hasErrors())return;
		}

}
