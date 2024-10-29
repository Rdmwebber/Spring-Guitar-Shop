package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = PartMinInventoryValidator.class)
@Target({ElementType.FIELD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ValidPartMinInventory {
    String message() default "Inventory is less than Minimum Inventory Level";
    Class<?> [] groups() default {};
    Class<? extends Payload> [] payload() default {};

}
