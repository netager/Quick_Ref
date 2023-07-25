package kr.co.jbbank.inflearnspringboot.repository;

import java.util.List;
import java.util.Optional;

import kr.co.jbbank.inflearnspringboot.domain.Member;

public interface MemberRepository {
    
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
