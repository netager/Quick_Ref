package kr.co.jbbank.testproject.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.jbbank.testproject.dto.MemberDTO;

@RestController
@RequestMapping("/api/v1/put-api")
public class PutController {

    @PutMapping("/default")
    public String putMethod() {
        return "Hello World!!!!";
    }

    @PutMapping("/member")
    public String postMember(@RequestBody Map<String, Object> postData) {
        StringBuilder sb = new StringBuilder();

        postData.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @PutMapping("/member1")
    public String  postMemberDto1(@RequestBody MemberDTO memberDTO) {
        return memberDTO.toString();

    }
    
    // JSON 형태로 Return
    @PutMapping("/member2")
    public MemberDTO postMemberDto2(@RequestBody MemberDTO memberDTO) {
        return memberDTO; // JSON 형태로 리턴
    }

    // Return Code : 202
    @PutMapping("/member3")
    public ResponseEntity<MemberDTO> postMemberDto3(@RequestBody MemberDTO memberDTO) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(memberDTO);
    }
}
