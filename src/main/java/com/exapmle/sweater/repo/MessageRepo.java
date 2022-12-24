package com.exapmle.sweater.repo;

import com.exapmle.sweater.domain.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageRepo extends CrudRepository<Message, Long> {

    Iterable<Message> findByTag(String filter);
}
