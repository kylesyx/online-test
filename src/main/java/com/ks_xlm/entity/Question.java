package com.ks_xlm.entity;

/**
 * Created by tianmao on 2018/6/7.
 */
public class Question {
    private Integer id;
    private String problem;
    private Integer answer;

    public Question() {
    }

    public Question(Integer id, String problem, Integer answer) {
        this.id = id;
        this.problem = problem;
        this.answer = answer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Question{" +
                "id=" + id +
                ", problem='" + problem + '\'' +
                ", answer=" + answer +
                '}';
    }
}
