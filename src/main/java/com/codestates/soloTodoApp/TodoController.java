package com.codestates.soloTodoApp;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class TodoController {
    @GetMapping("/")
    public ResponseEntity Test(){
        return new ResponseEntity("To-do Application !", HttpStatus.OK);
    }
}
