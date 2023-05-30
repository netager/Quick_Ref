package hello.hellospring;

// import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import hello.hellospring.aop.TimeTraceAop;
// import hello.hellospring.repository.JdbcTemplateMemberRepository;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.service.MemberService;

@Configuration
public class SpringConfig {

    // private EntityManager em;

    // @Autowired
    // public SpringConfig(EntityManager em) {
    //     this.em = em;
    // }

    // private DataSource dataSource;

    // @Autowired
    // public SpringConfig(DataSource dataSource) {
    //     this.dataSource = dataSource;
    // }

    private final MemberRepository memberRepository;

    @Autowired
    public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }
    
    // @Bean
    // public MemberService memberService() {
    //     return new MemberService(memberRepository());
    // }

    @Bean
    public MemberService memberService() {
        return new MemberService(memberRepository);
    }

    /**
     * 메모리에 데이터 저장 ~ spring 이 내려갔다 올라오면 데이터값 clear
     */
    // @Bean
    // public MemberRepository memberRepository() {
    //     return new MemoryMemberRepository();
    // }

    /**
     * 순수 Jdbc를 이용한 DB 핸들링
     */
    // @Bean
    // public MemberRepository memberRepository() {
    //     return new JdbcMemberRepository(dataSource);
    // }


    /**
     * 순수 Jdbc를 이용한 DB 핸들링
     */
    // @Bean
    // public MemberRepository memberRepository() {
    //     return new JdbcTemplateMemberRepository(dataSource);
    // }


    /**
     * JPA를 이용한 DB 핸들링
     */
    // @Bean
    // public MemberRepository memberRepository() {
    //     return new JpaMemberRepository(em);
    // }


    // @Bean
    // public TimeTraceAop timeTraceAop() {
    //     return new TimeTraceAop();
    // }
    

}
