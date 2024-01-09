package com.mysite.sbb.question;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer>{

	// Repository 메서드
	// ---------------
	//	And					findBySubjectAndContent(String subject, String content)					Subject, Content 열과 일치하는 데이터를 조회
	//	Or					findBySubjectOrContent(String subject, String content)					Subject열 또는 Content 열과 일치하는 데이터를 조회
	//	Between				findByCreateDateBetween(LocalDateTime fromDate, LocalDateTime toDate)	CreateDate 열의 데이터 중 정해진 범위 내에 있는 데이터를 조회
	//	LessThan			findByIdLessThan(Integer id)											Id 열에서 조건보다 작은 데이터를 조회
	//	GreaterThanEqual	findByIdGreaterThanEqual(Integer id)									Id 열에서 조건보다 크거나 같은 데이터를 조회
	//	Like				findBySubjectLike(String subject)										Subject 열에서 문자열 ‘subject’와 같은 문자열을 포함한 데이터를 조회
	//	In					findBySubjectIn(String[] subjects)										Subject 열의 데이터가 주어진 배열에 포함되는 데이터만 조회
	//	OrderBy				findBySubjectOrderByCreateDateAsc(String subject)						Subject 열 중 조건에 일치하는 데이터를 조회하여 CreateDate 열을 오름차순으로 정렬하여 반환
	// -------------------------------------------------------------------------------------------------------------------------------
	Question findBySubject(String subject);
	Question findBySubjectAndContent(String subject, String content); 
	Question findBySubjectOrContent(String subject, String content);
	Question findByCreateDateBetween(LocalDateTime fromDate, LocalDateTime toDate);
	Question findByIdLessThan(Integer id);
	Question findByIdGreaterThanEqual(Integer id);
	List<Question> findBySubjectLike(String subject);
	Question findBySubjectIn(String[] subjects);
	Question findBySubjectOrderByCreateDateAsc(String subject);
	
	// Paging 처리를 위한 것
	Page<Question> findAll(Pageable pageable);
	
	
}
