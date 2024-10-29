package com.example.demo.validators;

import com.example.demo.domain.Part;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PartInventoryValidator implements ConstraintValidator<ValidPartInventory, Part> {

    @Override
    public void initialize(ValidPartInventory constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Part part, ConstraintValidatorContext constraintValidatorContext) {

       // System.out.println("Min " + part.getMinInventory() + " Max" + part.getMaxInventory() + " Inventory" + part.getInv());
        //if (part.getInv() < part.getMinInventory()) {}

        return part.validInventory();
    }
}
