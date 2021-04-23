package com.studentsregister.ws.exceptions;

import java.util.Locale;

import com.studentsregister.ws.response.errors.ErrorMessage;
import com.studentsregister.ws.util.ApplicationConstants;
import com.studentsregister.ws.util.ExceptionsConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class AppExceptionsHandler extends ResponseEntityExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @Autowired
    private Environment env;

    @ExceptionHandler(value = { Exception.class })
    public ResponseEntity<Object> handleAnyException(Exception exception, WebRequest request) {

        ErrorMessage errorMessage = new ErrorMessage();

        errorMessage.setMessage(getMessage());

        return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.INTERNAL_SERVER_ERROR);

    }

    private String getMessage() {
        String message = "";

        String applicationlanguage = env.getProperty(ApplicationConstants.APPLICATION_LANGUAGE);

        System.out.println(Locale.forLanguageTag(applicationlanguage));

        message = messageSource.getMessage(ExceptionsConstants.GENERAL_ERROR_MESSAGE, null,
                Locale.forLanguageTag(applicationlanguage));

        return message;
    }
}
