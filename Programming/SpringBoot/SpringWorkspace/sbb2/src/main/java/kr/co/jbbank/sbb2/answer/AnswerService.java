package kr.co.jbbank.sbb2.answer;

@RequiredArgsConstructor
@Service
public class AnswerService {

    private final AnswerRepository answerRepository;

    public List<Answer> getList() {
        return this.answerRepository.findAll();
    }

    public Answer getAnswer(Integer id) {
        Optional<Answer> answer = this.answerRepository.findById(id);
        if (question.isPresent()) {
            return question.get();
        }
        else {
            throw new DataNotFoundException("question not");
        }
    }

}