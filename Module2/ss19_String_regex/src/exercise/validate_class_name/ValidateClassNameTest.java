package exercise.validate_class_name;

import exercise.validate_class_name.ValidateClassName;

public class ValidateClassNameTest {
    public static void main(String[] args) {
        ValidateClassName validateClassName = new ValidateClassName();
        boolean isValid;
//        isValid = validateClassName.validateClassName("C2209G");
//        System.out.println(isValid);
//        isValid = validateClassName.validateClassName("A2209M");
//        System.out.println(isValid);
//        isValid = validateClassName.validateClassName("P0123K");
//        System.out.println(isValid);
//        isValid = validateClassName.validateClassName("H0123K");
//        System.out.println(isValid);
//        isValid = validateClassName.validateClassName("123555");
//        System.out.println(isValid);
//        isValid = validateClassName.validateClassName("a1234G");
//        System.out.println(isValid);
        isValid = validateClassName.validateClassName("C0318G");
        System.out.println(isValid);
    }
}
