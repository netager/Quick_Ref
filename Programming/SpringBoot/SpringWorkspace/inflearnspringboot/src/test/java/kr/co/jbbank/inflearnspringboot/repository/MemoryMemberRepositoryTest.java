package kr.co.jbbank.inflearnspringboot.repository;

import static org.assertj.core.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
// import org.junit.jupiter.api.As
import org.junit.jupiter.api.Test;

import kr.co.jbbank.inflearnspringboot.domain.Member;

class MemoryMemberRepositoryTest {
    
    MemoryMemberRepository repository = new MemoryMemberRepository();

    @AfterEach    // 각 메소드 실행후 실행되는 어노테이션
    public void afterEach() {
        repository.clearStore();
    }

    @Test
    public void save() {
        
        Member member = new Member();
        member.setName("Spring");

        repository.save(member);
        Member result = repository.findById(member.getId()).get();
        // System.out.println("result = " + (result == member));
        // Assertions.assertEquals(member, member);   // org.junit.jupiter.api.Assertions
        assertThat(member).isEqualTo(result);
    }

    @Test
    public void findByName() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        Member result = repository.findByName("spring1").get();
        assertThat(result).isEqualTo(member1);

    }

    @Test
    public void findAll() {
        Member member1 = new Member();
        member1.setName("spring1");
        repository.save(member1);

        Member member2 = new Member();
        member2.setName("spring2");
        repository.save(member2);

        List<Member> result = repository.findAll();

        assertThat(result.size()).isEqualTo(2);
    }

}
