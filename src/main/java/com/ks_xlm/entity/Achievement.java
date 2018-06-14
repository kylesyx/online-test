package com.ks_xlm.entity;

/**
 * Created by tianmao on 2018/6/7.
 */
public class Achievement {
    private Integer id;
    private Integer userId;
    private Integer testPaperId;
    private Integer total;

    public Achievement() {
    }

    public Achievement(Integer id, Integer userId, Integer testPaperId, Integer total) {
        this.id = id;
        this.userId = userId;
        this.testPaperId = testPaperId;
        this.total = total;
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

    public Integer getTestPaperId() {
        return testPaperId;
    }

    public void setTestPaperId(Integer testPaperId) {
        this.testPaperId = testPaperId;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public String toString() {
        return "Achievement{" +
                "id=" + id +
                ", userId=" + userId +
                ", testPaperId=" + testPaperId +
                ", total=" + total +
                '}';
    }
}
