package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartMinInventoryValidator implements ConstraintValidator<ValidPartMinInventory, Part> {

    @Override
    public void initialize(ValidPartMinInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

        return part.getInv() >= part.getMinInventory();
    }
}
