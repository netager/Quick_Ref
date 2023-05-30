package kr.co.jbbank.hubproject.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/del-api")
public class DeleteController {

    @DeleteMapping("delete/{variable}")
    public String deleteVariable(@PathVariable String variable) {
        return variable;
    }

    @DeleteMapping("delete1/{variable1}")
    public String deleteVariable1(@PathVariable("variable1") String var) {
        return var;
    }

}
