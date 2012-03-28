package com.qualityOfLife.seguroDeVida.web.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.qualityOfLife.seguroDeVida.web.forms.BeneficiarioForm;


public class BeneficiarioFormValidator implements Validator {
	
	public boolean supports(Class<?> clazz){
		return BeneficiarioForm.class.equals(clazz);
	}

	public void validate(Object target, Errors errors){
		//RegisterEmployeeForm registerEmployeeForm = (RegisterEmployeeForm)target;
		//ValidationUtils.rejectIfEmptyOrWhitespace(errors, "name", "mandatoryField");
		if(errors.hasErrors())return;
		}

}
