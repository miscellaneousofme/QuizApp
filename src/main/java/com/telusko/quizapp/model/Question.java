package com.telusko.quizapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
@Entity

public class Question {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String questionTitle;
    private String option1;
    private String option2;
    private String option3;
    private String option4;
    private String rightAnswer;
    private String difficultyLevel;
    private String category;
    @OneToMany(mappedBy = "questions")
    private Collection<Quiz> quiz;

    public Collection<Quiz> getQuiz() {
        return quiz;
    }

    public void setQuiz(Collection<Quiz> quiz) {
        this.quiz = quiz;
    }
}
