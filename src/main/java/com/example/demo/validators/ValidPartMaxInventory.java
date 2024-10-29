package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PartMaxInventoryValidator.class)
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartMaxInventory {
    String message() default "Inventory is more than Maximum Inventory Level";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
