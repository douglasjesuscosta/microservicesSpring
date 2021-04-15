/**
 * 
 * package com.studentsregister.ws.validator;
 * 
 * import com.studentsregister.ws.request.UserRequest;
 * 
 * import org.springframework.validation.Errors; import
 * org.springframework.validation.ValidationUtils; import
 * org.springframework.validation.Validator;
 * 
 * public class UserValidator implements Validator {
 * 
 * @Override public boolean supports(Class<?> clazz) { return
 *           UserRequest.class.equals(clazz); }
 * 
 * @Override public void validate(Object target, Errors errors) {
 *           ValidationUtils.rejectIfEmpty(errors, "firstName", "name.empty"); }
 *           }
 */