package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student ananthakrishnan = new Student(
                    "Ananthakrishnan",
                    "ananthakrishnan1996@gmail.com",
                    21,
                    LocalDate.of(1996, Month.JANUARY,17)
            );
            Student vishnu = new Student(
                    "Vishnu",
                    "Vishnu@gmail.com",
                    21,
                    LocalDate.of(2017,Month.JANUARY,24)
            );

            repository.saveAll(List.of(ananthakrishnan,vishnu));
        };
    }
}
