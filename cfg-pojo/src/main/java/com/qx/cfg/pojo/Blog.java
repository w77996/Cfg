package com.qx.cfg.pojo;

public class Blog {
    private Integer id;

    private Integer userId;

    private String blogDescription;

    private String blogContent;

    private String blogTitle;

    private Byte blogType;

    private Integer blogCreateTime;

    private Integer blogView;

    private String blogImageUrl;

    private String blogVideoUrl;

    private Integer blogRewardNum;

    private Integer blogReward;

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

    public String getBlogDescription() {
        return blogDescription;
    }

    public void setBlogDescription(String blogDescription) {
        this.blogDescription = blogDescription == null ? null : blogDescription.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public Byte getBlogType() {
        return blogType;
    }

    public void setBlogType(Byte blogType) {
        this.blogType = blogType;
    }

    public Integer getBlogCreateTime() {
        return blogCreateTime;
    }

    public void setBlogCreateTime(Integer blogCreateTime) {
        this.blogCreateTime = blogCreateTime;
    }

    public Integer getBlogView() {
        return blogView;
    }

    public void setBlogView(Integer blogView) {
        this.blogView = blogView;
    }

    public String getBlogImageUrl() {
        return blogImageUrl;
    }

    public void setBlogImageUrl(String blogImageUrl) {
        this.blogImageUrl = blogImageUrl == null ? null : blogImageUrl.trim();
    }

    public String getBlogVideoUrl() {
        return blogVideoUrl;
    }

    public void setBlogVideoUrl(String blogVideoUrl) {
        this.blogVideoUrl = blogVideoUrl == null ? null : blogVideoUrl.trim();
    }

    public Integer getBlogRewardNum() {
        return blogRewardNum;
    }

    public void setBlogRewardNum(Integer blogRewardNum) {
        this.blogRewardNum = blogRewardNum;
    }

    public Integer getBlogReward() {
        return blogReward;
    }

    public void setBlogReward(Integer blogReward) {
        this.blogReward = blogReward;
    }
}