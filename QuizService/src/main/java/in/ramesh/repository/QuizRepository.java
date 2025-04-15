package in.ramesh.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.ramesh.entity.Quiz;

public interface QuizRepository extends JpaRepository<Quiz, Long>{
	
	Optional<Quiz> findById(Long id);

}
