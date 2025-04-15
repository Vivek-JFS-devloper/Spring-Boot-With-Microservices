package in.ramesh.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ramesh.entity.Question;
import in.ramesh.repository.QuestionRepository;

@Service
public class QuestionServiceImpl implements QuestionService{
	
	@Autowired
	private QuestionRepository questionRepository;

	@Override
	public Question add(Question question) {
		// TODO Auto-generated method stub
		return questionRepository.save(question);
	}

	@Override
	public List<Question> getAllQuestions() {
		// TODO Auto-generated method stub
		return questionRepository.findAll();
	}

	@Override
	public Question getQuestionById(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findById(id).orElseThrow(()->new RuntimeException("Not found"));
	}
	
	
	
	@Override
	public List<Question> getQuestionOfQuiz(Long id) {
		// TODO Auto-generated method stub
		return questionRepository.findByQuizId(id);
	}
	
	
	
	@Override
	public void deleteQuestionById(Long id) {
	    if (!questionRepository.existsById(id)) {
	        throw new RuntimeException("Question not found with ID: " + id);
	    }
	    questionRepository.deleteById(id);
	}

	@Override
	public void deleteAllQuestions() {
	    questionRepository.deleteAll();
	}

}
