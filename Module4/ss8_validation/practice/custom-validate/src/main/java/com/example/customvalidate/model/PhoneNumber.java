package com.example.customvalidate.model;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

public class PhoneNumber implements Validator {
    private String number;

    public PhoneNumber() {
    }

    public PhoneNumber(String number) {
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        PhoneNumber phoneNumber = (PhoneNumber) target;
        ValidationUtils.rejectIfEmpty(errors,"number","number.empty");
        if (phoneNumber.number.length()>11||phoneNumber.number.length()<10){
            errors.rejectValue("number","number.length");
        }
        if (!phoneNumber.number.startsWith("0")){
            errors.rejectValue("number","number.startWith");
        }
        if (!phoneNumber.number.matches("(^$|[0-9]*$)")){
            errors.rejectValue("number","number.matches");
        }
     }
}
