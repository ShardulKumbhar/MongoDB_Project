package com.mango.example.mangodbexample.repo;

import com.mango.example.mangodbexample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,Integer> {
}
