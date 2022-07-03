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
                    LocalDate.of(1996, Month.DECEMBER,17)
            );
            Student vishnu = new Student(
                    "Vishnu",
                    "Vishnu@gmail.com",
                    LocalDate.of(2003,Month.JANUARY,24)
            );

            repository.saveAll(List.of(ananthakrishnan,vishnu));
        };
    }
}
