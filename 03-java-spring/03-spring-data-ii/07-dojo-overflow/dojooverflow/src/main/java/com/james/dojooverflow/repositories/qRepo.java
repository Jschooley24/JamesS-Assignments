package com.james.dojooverflow.repositories;

import java.util.List;

import javax.servlet.jsp.tagext.Tag;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.james.dojooverflow.models.Question;

@Repository
public interface qRepo extends CrudRepository<Question, Long> {
	List<Question> findAll();
	List<Question> findAllByTags(Tag tag);

}