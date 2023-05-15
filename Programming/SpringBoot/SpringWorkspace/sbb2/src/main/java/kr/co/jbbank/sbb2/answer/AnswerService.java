package kr.co.jbbank.sbb2.answer;


import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import kr.co.jbbank.sbb2.question.Question;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public void create(Question question, String content) {
        Answer answer = new Answer();
        answer.setContent(content);
        answer.setCreateDate(LocalDateTime.now());
        answer.setQuestion(question);
        this.answerRepository.save(answer);
    }


    // public List<Answer> getList() {
    //     return this.answerRepository.findAll();
    // }

    // public Answer getAnswer(Integer id) {
    //     Optional<Answer> answer = this.answerRepository.findById(id);
    //     if (question.isPresent()) {
    //         return question.get();
    //     }
    //     else {
    //         throw new DataNotFoundException("question not");
    //     }
    // }

}