package in.ramesh.entity;

import lombok.Data;

@Data
public class Question {

	private Long id;

	private String question;

	private Long quizId;
}
