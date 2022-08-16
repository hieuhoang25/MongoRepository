package com.hicode.mongodb;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import com.hicode.mongodb.model.Address;
import com.hicode.mongodb.model.Gender;
import com.hicode.mongodb.model.Student;
import com.hicode.mongodb.repository.ItemRepository;
import com.hicode.mongodb.repository.StudentRepository;

@SpringBootApplication
public class MongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(MongodbApplication.class, args);
	}

	// @Bean
	// CommandLineRunner runner(StudentRepository repository, MongoTemplate mongoTemplate) {
	// 	return args -> {
	// 		Address address = new Address("England", "London", "N69");
	// 		Student student = new Student("Hiếu", "Hoàng Văn", "hieuhoang2001td@gmail.com");
	// 		// MongoTemplate
	// 		// repository.findStudentByEmail("hieuhoang2510td@gmail.com").ifPresentOrElse(s ->{
	// 		// 		System.out.println("Inserting failed" +s);
	// 		// }, (
				
	// 		// ) ->{
	// 		// 	System.out.println("Inserting student"+student);
	// 			repository.insert(student);
	// 		// });
	// 	};

	// }

	private void usingMongoTempaleAndQuery(StudentRepository repository, MongoTemplate mongoTemplate, Student student){
		Query query = new Query();
		query.addCriteria(Criteria.where("email").is("hieuhoang251001td"));
		List<Student> students = mongoTemplate.find(query, Student.class);
		if (students.size() > 1) {
			throw new IllegalStateException("Found many students wwith email: ");
		}
		if (students.isEmpty()) {
			System.out.println("Insert success");
			repository.insert(student);
		}
	}
}
