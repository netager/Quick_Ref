package com.mysite.sbb;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJpa() {
		for(int i = 1; i<= 300; i++) {
			String subject = String.format("테스트 데이터입니다:[%03d]", i);
			String content = "내용무";
			this.questionService.create(subject, content);
		}
	}
}

//	@Autowired
//	private QuestionRepository questionRepository;
//
//	@Autowired
//	private AnswerRepository answerRepository;
//
//	@Transactional	// 세션이 유지되도록 함
//	@Test
//	void testJpa() {
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		List<Answer> answerList = q.getAnswerList();
//		assertEquals(1, answerList.size());
//		assertEquals("네 자동으로 생성됩니다.", answerList.get(0).getContent());
//		
//	}
	
//	@Test
//	void testJpa() {
//		Optional<Answer> oa = this.answerRepository.findById(1);
//		assertTrue(oa.isPresent());
//		
//		Answer a = oa.get();
//		assertEquals(2, a.getQuestion().getId());
//	}
	
	
//	@Test
//	void testjpa() {
//		Optional<Question> oq = this.questionRepository.findById(2);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		
//		Answer a = new Answer();
//		a.setContent("네 자동으로 생성됩니다.");
//		a.setQuestion(q);
//		a.setCreateDate(LocalDateTime.now());
//		this.answerRepository.save(a);
//	}
	
	//	@Test
//	void testJpa() {
//		assertEquals(4, this.questionRepository.count());
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		this.questionRepository.delete(q);
//		assertEquals(3, this.questionRepository.count());
//	}

	
	//	@Test
//	void testJpa() {
//		Optional<Question> oq = this.questionRepository.findById(1);
//		assertTrue(oq.isPresent());
//		Question q = oq.get();
//		q.setSubject("수정된 제목1");
//		this.questionRepository.save(q);
//	}

	
//	@Test
//	void testJpa() {
////		Question findBySubject(String subject);
////		Question findBySubjectAndContent(String subject, String content); 
////		Question findBySubjectOrContent(String subject, String content);
////		Question findByCreateDateBetween(LocalDateTime fromDate, LocalDateTime toDate);
////		Question findByIdLessThan(Integer id);
////		Question findByIdGreaterThanEqual(Integer id);
////		Question findBySubjectLike(String subject);
////		Question findBySubjectIn(String[] subjects);
////		Question findBySubjectOrderByCreateDateAsc(String subject);
//		
//
//		Question q1 = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q1.getId());
//		
//		Question q2 = this.questionRepository.findBySubjectOrContent("sbb가 무엇인가요?", "abc");
//		assertEquals(1, q2.getId());
//		
//		// LocalDateTime
//		// -------------
//		// LocalDateTime.now() - 현재 로컬 컴퓨터의 날짜와 시간을 반환
//		// LocalDateTime.now(Clock.systemDefaultZone()); - Clock 에 맞는 현재 날짜와 시간을 반환
//		// LocalDateTime.now(ZoneId.of("Asia/Seoul")); - ZoneId에 해당하는 날짜 시간을 반환
//		// LocalDateTime.of(2021, 1, 1, 0, 0, 0); - 
//		// LocalDateTime localDateTime = LocalDateTime.of(2021, 1, 1, 0, 0, 0);
//		// String localDateTimeFormat1 = localDateTime.format(DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS"));
//		// String localDateTimeFormat2 = localDateTime.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss:SSS"));
//		
//		// LocalDateTime now = LocalDateTime.now();
//		// System.out.println("getYear() = " + now.getYear());
//		// System.out.println("getMonth() = " + now.getMonth());
//		// System.out.println("getDayOfMonth() = " + now.getDayOfMonth());
//		// System.out.println("getDayOfWeek() = " + now.getDayOfWeek());
//		// System.out.println("getDayOfYear() = " + now.getDayOfYear());
//		
//		// LocalDateTime now = LocalDateTime.now();
//		// System.out.println("getHour() = " + now.getHour());
//		// System.out.println("getMinute() = " + now.getMinute());
//		// System.out.println("getSecond() = " + now.getSecond());
//		// System.out.println("getNano() = " + now.getNano());
//		
//		// LocalDateTime now = LocalDateTime.of(2021, 9, 9, 10, 0, 0);
//		// System.out.println("plusYears(3) = " + now.plusYears(3));
//		// System.out.println("plusMonths(3) = " + now.plusMonths(3));
//		// System.out.println("plusDays(3) = " + now.plusDays(3));
//		// System.out.println("plusHours(3) = " + now.plusHours(3));
//		// System.out.println("plusMinutes(3) = " + now.plusMinutes(3));
//		// System.out.println("plusSeconds(3) = " + now.plusSeconds(3));
//		
//		// LocalDateTime now = LocalDateTime.of(2021, 9, 9, 10, 0, 0);
//		// System.out.println("minusYears(3) = " + now.minusYears(3));
//		// System.out.println("minusMonths(3) = " + now.minusMonths(3));
//		// System.out.println("minusDays(3) = " + now.minusDays(3));
//		// System.out.println("minusHours(3) = " + now.minusHours(3));
//		// System.out.println("minusMinutes(3) = " + now.minusMinutes(3));
//		// System.out.println("minusSeconds(3) = " + now.minusSeconds(3));
//		
//		// LocalDateTime localDateTime = LocalDateTime.now();
//		// System.out.println(localDateTime);
//		// System.out.println(localDateTime.toLocalDate());
//		
//		Question q3 = this.questionRepository.findByCreateDateBetween(
//			LocalDateTime.of(2024, 1, 8, 11, 18, 0), 
//			LocalDateTime.of(2024, 1, 8, 11, 19, 0));
//		assertEquals(3, q3.getId());
//		
//		Question q4 = this.questionRepository.findByIdLessThan(2);
//		assertEquals(1, q4.getId());
//		
//		Question q5 = this.questionRepository.findByIdGreaterThanEqual(4);
//		assertEquals(4, q5.getId());
//		
////		Question q6 = this.questionRepository.findBySubjectLike("sbb가%");
////		assertEquals(1, q6.getId());
//
//		List<Question> qList6 = this.questionRepository.findBySubjectLike("sbb%");
//		Question q6_1 = qList6.get(0);
//		assertEquals(1, q6_1.getId());
//		
////		assertEquals(3, qList6.size());
//
//		Question q7 = this.questionRepository.findBySubjectIn(new String[] {"sbb3"});
//		assertEquals(3, q7.getId());
//		
//		Question q8 = this.questionRepository.findBySubjectOrderByCreateDateAsc("sbb4");
//		assertEquals(4, q8.getId());		
//	}

//	@Test
//	void testJpa() {
//		Question q = this.questionRepository.findBySubjectAndContent(
//				"sbb가 무엇인가요?", "sbb에 대해서 알고 싶습니다.");
//		assertEquals(1, q.getId());
//	}
	
//	@Test
//	void testJpa() {
//		Question q = this.questionRepository.findBySubject("sbb가 무엇인가요?");
//		assertEquals(1, q.getId());
//	}

	//	@Test
//	void testJpa() {
//		Optional<Question> oq = this.questionRepository.findById(1);
//		if(oq.isPresent()) {
//			Question q = oq.get();
//			assertEquals("sbb가 무엇인가요?", q.getSubject());
//		}
//	}
		
//	@Test
//	void testJpa() {
//		List<Question> all = this.questionRepository.findAll();
//		assertEquals(2, all.size());
//		
//		Question q = all.get(0);
//		assertEquals("sbb가 무엇인가요?", q.getSubject());
//	}
	
//	@Test
//	void testJpa() {
//		Question q1 = new Question();
//		q1.setSubject("sbb4");
//		q1.setContent("sbb4");
//		q1.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q1);

//		Question q2 = new Question();
//		q2.setSubject("스프링부트 모델 질문입니다.");
//		q2.setContent("id는 자동으로 생성되나요?");
//		q2.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(q2);
//	}

//}
