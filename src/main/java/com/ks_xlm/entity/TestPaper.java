package com.ks_xlm.entity;

/**
 * Created by tianmao on 2018/6/7.
 */
public class TestPaper {
    private Integer id;
    private Integer userId;
    private Integer questionId;
    private String answer;
    private Integer branch;

    public TestPaper() {
    }

    public TestPaper(Integer id, Integer userId, Integer questionId, String answer, Integer branch) {
        this.id = id;
        this.userId = userId;
        this.questionId = questionId;
        this.answer = answer;
        this.branch = branch;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Integer getBranch() {
        return branch;
    }

    public void setBranch(Integer branch) {
        this.branch = branch;
    }

    @Override
    public String toString() {
        return "TestPaper{" +
                "id=" + id +
                ", userId=" + userId +
                ", questionId=" + questionId +
                ", answer='" + answer + '\'' +
                ", branch=" + branch +
                '}';
    }
}
