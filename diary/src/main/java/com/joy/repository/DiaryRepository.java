package com.joy.repository;
import com.joy.diary.Entry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

public interface DiaryRepository extends MongoRepository<Entry, String> {

}
