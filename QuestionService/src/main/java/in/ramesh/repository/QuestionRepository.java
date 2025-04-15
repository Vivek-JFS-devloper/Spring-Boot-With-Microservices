package in.ramesh.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ramesh.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Long>{
	
	Optional<Question> findById(Long id);
	
	List<Question> findByQuizId(Long id);
}	
