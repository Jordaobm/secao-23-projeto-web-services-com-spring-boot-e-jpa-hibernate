package com.webservices.course.resources.exceptions;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.webservices.course.services.exceptions.DatabaseException;
import com.webservices.course.services.exceptions.ResourceNotFoundException;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<StandardError> resourceNotFound(ResourceNotFoundException resourceNotFoundException,
      HttpServletRequest httpServletRequest) {
    String error = "Resource not found";
    HttpStatus httpStatus = HttpStatus.NOT_FOUND;

    StandardError standardError = new StandardError(Instant.now(), httpStatus.value(), error,
        resourceNotFoundException.getMessage(), httpServletRequest.getRequestURI());

    return ResponseEntity.status(standardError.getStatus()).body(standardError);

  }

  @ExceptionHandler(DatabaseException.class)
  public ResponseEntity<StandardError> database(DatabaseException databaseException,
      HttpServletRequest httpServletRequest) {
    String error = "Database error";
    HttpStatus httpStatus = HttpStatus.BAD_REQUEST;

    StandardError standardError = new StandardError(Instant.now(), httpStatus.value(), error,
        databaseException.getMessage(), httpServletRequest.getRequestURI());

    return ResponseEntity.status(standardError.getStatus()).body(standardError);

  }

}
