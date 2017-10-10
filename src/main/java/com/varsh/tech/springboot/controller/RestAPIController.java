package com.varsh.tech.springboot.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.varsh.tech.springboot.model.User;
import com.varsh.tech.springboot.service.UserService;
import com.varsh.tech.springboot.util.CustomErrorType;

@RestController
@RequestMapping("/api")
public class RestAPIController {

	public static final Logger logger = LoggerFactory.getLogger(RestAPIController.class);
	 
    @Autowired
    UserService userService; 
    
    /*
     * Retrive all users
     */
    
    @RequestMapping(value="/user/", method = RequestMethod.GET)
    public ResponseEntity<List<User>> listAllUsers(){
    	List<User> userList = userService.findAllUsers();
    	if(userList.isEmpty()){
    		return new ResponseEntity(HttpStatus.NO_CONTENT);
    	}
    	return new ResponseEntity<List<User>>(userList, HttpStatus.OK);
    }
    
 // -------------------Retrieve Single User------------------------------------------
    
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ResponseEntity<?> getUser(@PathVariable("id") long id) {
        logger.info("Fetching User with id {}", id);
        User user = userService.findById(id);
        if (user == null) {
            logger.error("User with id {} not found.", id);
            return new ResponseEntity(new CustomErrorType("User with id " + id 
                    + " not found"), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
