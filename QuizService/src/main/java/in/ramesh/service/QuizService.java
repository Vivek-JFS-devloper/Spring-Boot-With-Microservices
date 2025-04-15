package in.ramesh.service;

import java.util.List;

import in.ramesh.entity.Quiz;

public interface QuizService {
	
	Quiz add(Quiz quiz);
	
	List<Quiz> getAllQuizs();
	
	Quiz getQuiz(Long id);
	
	void deleteQuizById(Long id);
	
	void deleteAllQuiz();

}
