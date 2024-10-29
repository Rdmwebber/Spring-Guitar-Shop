package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartMaxInventoryValidator implements ConstraintValidator<ValidPartMaxInventory, Part> {

    @Override
    public void initialize(ValidPartMaxInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        return part.getInv() <= part.getMaxInventory();
    }
}
