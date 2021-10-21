package com.james.dojooverflow.services;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.jsp.tagext.Tag;

import org.springframework.stereotype.Service;

import com.james.dojooverflow.models.Answer;
import com.james.dojooverflow.models.Question;
import com.james.dojooverflow.repositories.aRepo;
import com.james.dojooverflow.repositories.qRepo;
import com.james.dojooverflow.repositories.tRepo;

@Service
public class QuestionService {
	private final aRepo aRepo;
	private final qRepo qRepo;
	private final tRepo tRepo;


	public QuestionService(aRepo aRepo, qRepo qRepo, tRepo tRepo) {
		this.aRepo = aRepo;
		this.qRepo = qRepo;
		this.tRepo = tRepo;
	}

	public ArrayList<Tag> splitTags(String tags) {
		ArrayList<Tag> tagsForQ = new ArrayList<Tag>();
		String[] tagsToProcess = tags.split(", ");
		for(String s : tagsToProcess) {
			if(this.tRepo.existsBySubject(s)) {
				Tag tagToAdd = this.getTag(s);
				tagsForQ.add(tagToAdd);
			}
			else {
				Tag newTag = new Tag();
				newTag.setSubject(s);
				this.tRepo.save(newTag);
				tagsForQ.add(this.getTag(s));
			}
		}
		return tagsForQ;

	}

	public List<Question> allQuestions(){
		return qRepo.findAll();
	}
	public List<Answer> allAnswers(){
		return aRepo.findAll();
	}
	public List<Tag> allTags(){
		return tRepo.findAll();
	}
	public Question newQuestion(Question question) {
		return qRepo.save(question);
	}
	public Answer createAnswer(Answer answer) {
		return aRepo.save(answer);
	}
	public Question createQuestion(Question question) {
		question.setTags(this.splitTags(question.getTagsFrontEnd()));
		return this.qRepo.save(question);
	}
	public Question getQuestion(Long id) {
		return qRepo.findById(id).orElse(null);
	}
	public Answer getAnswer(Long id) {
		return aRepo.findById(id).orElse(null);
	}
	public Tag getTag(String subject) {
		return tRepo.findBySubject(subject);
	}

}