package com.qx.cfg.pojo;

import java.io.Serializable;

public class Comment implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer commentBlogId;

    private String commentContent;

    private Integer commentFromUid;

    private String commentNickname;

    private String commentThumbImg;

    private Integer commentLikeNum;

    private Integer commentReplyNum;

    private Integer commentRewardNum;

    private Integer commentReward;

    private Integer commentCreateTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentBlogId() {
        return commentBlogId;
    }

    public void setCommentBlogId(Integer commentBlogId) {
        this.commentBlogId = commentBlogId;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent == null ? null : commentContent.trim();
    }

    public Integer getCommentFromUid() {
        return commentFromUid;
    }

    public void setCommentFromUid(Integer commentFromUid) {
        this.commentFromUid = commentFromUid;
    }

    public String getCommentNickname() {
        return commentNickname;
    }

    public void setCommentNickname(String commentNickname) {
        this.commentNickname = commentNickname == null ? null : commentNickname.trim();
    }

    public String getCommentThumbImg() {
        return commentThumbImg;
    }

    public void setCommentThumbImg(String commentThumbImg) {
        this.commentThumbImg = commentThumbImg == null ? null : commentThumbImg.trim();
    }

    public Integer getCommentLikeNum() {
        return commentLikeNum;
    }

    public void setCommentLikeNum(Integer commentLikeNum) {
        this.commentLikeNum = commentLikeNum;
    }

    public Integer getCommentReplyNum() {
        return commentReplyNum;
    }

    public void setCommentReplyNum(Integer commentReplyNum) {
        this.commentReplyNum = commentReplyNum;
    }

    public Integer getCommentRewardNum() {
        return commentRewardNum;
    }

    public void setCommentRewardNum(Integer commentRewardNum) {
        this.commentRewardNum = commentRewardNum;
    }

    public Integer getCommentReward() {
        return commentReward;
    }

    public void setCommentReward(Integer commentReward) {
        this.commentReward = commentReward;
    }

    public Integer getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Integer commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }
}