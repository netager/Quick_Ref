package com.mysite.sbb.user;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class UserService {
	
	private final UserRepository userRepository;
	private final PasswordEncoder passwordEncoder;

	public SiteUser create(String username, String password, String email) {
		SiteUser user = new SiteUser();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(passwordEncoder.encode(password));	
		this.userRepository.save(user);
		return user;
	}

	
//	public List<Question> getList() {
//		return this.questionRepository.findAll();
//	}
//
//	// Question 데이터에 대한 Paging 처리
//	// ----------------------------
//	public Page<Question> getList(int page) {
//		List<Sort.Order> sorts = new ArrayList<>();	// 최신 Date로 sort
//		sorts.add(Sort.Order.desc("createDate"));
//		Pageable pageable = PageRequest.of(page, 10, Sort.by(sorts));
//		return this.questionRepository.findAll(pageable);
//	}
//	
//	public Question getQuestion(Integer id) {
//		Optional<Question> question = this.questionRepository.findById(id);
//		if(question.isPresent()) {
//			return question.get();
//		}else {
//			throw new DataNotFoundException("question not found");
//		}
//		
//	}
//	
//	public void create(String subject, String content) {
//		Question question = new Question();
//		question.setSubject(subject);
//		question.setContent(content);
//		question.setCreateDate(LocalDateTime.now());
//		this.questionRepository.save(question);
//		
//	}
//
//
}
