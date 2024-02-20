package com.innoventes.customanno;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EvenNumberOrZeroValidator  implements ConstraintValidator<EvenNumberOrZero, Number>{

	
	
	@Override
	public void initialize(EvenNumberOrZero constraintAnnotation) {
		// TODO Auto-generated method stub
	}

	@Override
	public boolean isValid(Number value, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		return value == null || value.intValue() % 2 ==0;
	}

}
