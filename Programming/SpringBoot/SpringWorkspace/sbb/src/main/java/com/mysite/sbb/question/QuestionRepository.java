package com.mysite.sbb.question;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{
	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content);
	List<Question> findBySubjectLike(String subject);									// Like
	Page<Question> findAll(Pageable pageable);
//	Question findBySubjectOrContent(String subject, String content);					// And
//	Question findByCreateDateBetween(LocalDateTime fromDate, LocalDateTime toDate); 	// Or
//	Question findByIdLessThan(Integer id);												// LessThan
//	Question findByIdGraterThanEqual(Integer id);										// GreaterThanEqual
//	Question findBySubjectIn(String[] subjects);    									// In
//	Question findBySubjectOrderByCreateDateAsc(String subject);							//OrderBy 
}
