package com.behavioranalysis.pojo;

public class SessionRandomExtract {
    private Integer taskId;

    private String sessionId;

    private String startTime;

    private String searchKeywords;

    private String clickCategoryIds;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId == null ? null : sessionId.trim();
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime == null ? null : startTime.trim();
    }

    public String getSearchKeywords() {
        return searchKeywords;
    }

    public void setSearchKeywords(String searchKeywords) {
        this.searchKeywords = searchKeywords == null ? null : searchKeywords.trim();
    }

    public String getClickCategoryIds() {
        return clickCategoryIds;
    }

    public void setClickCategoryIds(String clickCategoryIds) {
        this.clickCategoryIds = clickCategoryIds == null ? null : clickCategoryIds.trim();
    }
}