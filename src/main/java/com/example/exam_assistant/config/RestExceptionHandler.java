package com.example.exam_assistant.config;

import com.example.exam_assistant.app.exception.ExceptionBody;
import com.example.exam_assistant.app.exception.GeneralException;
import com.example.exam_assistant.app.user.exception.UserAlreadyExistsException;
import com.example.exam_assistant.app.user.exception.UserNotFoundException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import static org.springframework.http.HttpStatus.BAD_REQUEST;
import static org.springframework.http.HttpStatus.NOT_FOUND;

@ControllerAdvice
class RestExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler({UserNotFoundException.class})
    public ResponseEntity<Object> handleNotFound(GeneralException exception, WebRequest request) {
        ExceptionBody body = exception.getBody();
        return handleExceptionInternal(exception, body, new HttpHeaders(), NOT_FOUND, request);
    }

    @ExceptionHandler({UserAlreadyExistsException.class})
    public ResponseEntity<Object> handleAlreadyExists(GeneralException exception, WebRequest request) {
        ExceptionBody body = exception.getBody();
        return handleExceptionInternal(exception, body, new HttpHeaders(), BAD_REQUEST, request);
    }

}
