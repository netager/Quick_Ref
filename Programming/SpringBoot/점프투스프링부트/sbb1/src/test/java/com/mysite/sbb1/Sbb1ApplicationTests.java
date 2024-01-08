package com.mysite.sbb1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sbb1ApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;
	
	@Test
	void testJpa() {
		List<Question> all = this.questionRepository.findAll();
		assertEquals(2, all.size());
		
		Question q = all.get(0);
		assertEquals("sbb1이 무엇인가요?", q.getSubject());

// Test Data Insert
// ----------------
//	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb1이 무엇인가요?");
//		q1.setContent("sbb1에 대해서 알고 싶습니다.");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);
//		
//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
		
	}

}
