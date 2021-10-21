package com.james.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.james.dojooverflow.models.Answer;

@Repository
public interface aRepo extends CrudRepository<Answer, Long> {
	List<Answer> findAll();

}