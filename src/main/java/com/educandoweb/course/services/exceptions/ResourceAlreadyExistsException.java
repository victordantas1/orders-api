package com.educandoweb.course.services.exceptions;

public class ResourceAlreadyExistsException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public ResourceAlreadyExistsException(Object id) {
        super("Resource already exists. Id " + id);
    }

}
