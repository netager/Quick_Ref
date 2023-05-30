package kr.co.jbbank.testproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/get-api")
public class DeleteController {

    @DeleteMapping("/delete/{variable}")
    public String DeleteVariable(@PathVariable String variable) {
        return variable;
    }
    
}
