package com.qx.cfg.pojo;

import java.io.Serializable;

public class UserCollection implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer userId;

    private Integer blogId;

    private Integer collectionCreateTime;

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

    public Integer getBlogId() {
        return blogId;
    }

    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    public Integer getCollectionCreateTime() {
        return collectionCreateTime;
    }

    public void setCollectionCreateTime(Integer collectionCreateTime) {
        this.collectionCreateTime = collectionCreateTime;
    }
}