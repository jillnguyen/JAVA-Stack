package com.jillnguyen.course.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.jillnguyen.course.models.Application;

@Repository
public interface ApplicationRepository extends CrudRepository<Application, Long> {
    Optional<Application> findById(Long id);
}
