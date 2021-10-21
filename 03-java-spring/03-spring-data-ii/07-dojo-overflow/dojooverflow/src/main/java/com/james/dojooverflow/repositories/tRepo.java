package com.james.dojooverflow.repositories;

import java.util.List;

import javax.servlet.jsp.tagext.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.james.dojooverflow.models.Question;

@Repository
public interface tRepo extends CrudRepository<Tag, Long> {
	List<Tag> findAll();
	List<Tag> findAllByQuestions(Question question);
	boolean existsBySubject(String subject);
	Tag findBySubject(String subject);

}