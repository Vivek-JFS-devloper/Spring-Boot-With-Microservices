package in.ramesh.service;

import java.util.List;

import in.ramesh.entity.Question;

public interface QuestionService {
	
	Question add(Question question);
	
	List<Question> getAllQuestions();
	
	Question getQuestionById(Long id);
	
	List<Question> getQuestionOfQuiz(Long id);
	
	void deleteQuestionById(Long id);
	
	void deleteAllQuestions();

}
