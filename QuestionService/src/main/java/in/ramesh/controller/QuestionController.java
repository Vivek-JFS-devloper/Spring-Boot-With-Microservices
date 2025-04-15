package in.ramesh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.ramesh.entity.Question;
import in.ramesh.service.QuestionService;

@RestController
@RequestMapping("/question")
public class QuestionController {

	@Autowired
	private QuestionService questionService;

	// Add a new question
	@PostMapping
	public ResponseEntity<Question> addQuestion(@RequestBody Question question) {
		if (question == null) {
			return ResponseEntity.badRequest().build();
		}
		Question savedQuestion = questionService.add(question);
		return ResponseEntity.ok(savedQuestion);
	}

	// Get all questions
	@GetMapping
	public ResponseEntity<List<Question>> getAllQuestions() {
		List<Question> questions = questionService.getAllQuestions();
		return ResponseEntity.ok(questions);
	}

	// Get a question by ID
	@GetMapping("/{id}")
	public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
		try {
			Question question = questionService.getQuestionById(id);
			return ResponseEntity.ok(question);
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}

	
	// Get all questions of a specific quiz by quiz ID
    @GetMapping("/quiz/{quizId}")
    public ResponseEntity<List<Question>> getQuestionsOfQuiz(@PathVariable("quizId") Long quizId) {
        List<Question> questions = questionService.getQuestionOfQuiz(quizId);
        return ResponseEntity.ok(questions);
    }
	
	
	
	// Delete a question by ID
	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteQuestionById(@PathVariable Long id) {
		try {
			questionService.deleteQuestionById(id);
			return ResponseEntity.ok("Question with ID " + id + " deleted successfully");
		} catch (RuntimeException e) {
			return ResponseEntity.notFound().build();
		}
	}

	// Delete all questions
	@DeleteMapping
	public ResponseEntity<String> deleteAllQuestions() {
		questionService.deleteAllQuestions();
		return ResponseEntity.ok("All questions deleted successfully");
	}
}