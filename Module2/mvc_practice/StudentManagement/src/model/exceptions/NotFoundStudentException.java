package model.exceptions;

public class NotFoundStudentException extends Exception {
    public NotFoundStudentException(){
        System.err.println("Can't find the student");

    }
}
