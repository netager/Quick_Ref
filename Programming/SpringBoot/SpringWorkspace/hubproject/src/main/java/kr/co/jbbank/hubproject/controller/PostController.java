package kr.co.jbbank.hubproject.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jbbank.hubproject.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/post-api")
public class PostController {

    @PostMapping("/default")
    public String postMethod() {
        return "Hello World!";
    }

    @PostMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }
    
    @PostMapping("/member2")
    public String postMember(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}
