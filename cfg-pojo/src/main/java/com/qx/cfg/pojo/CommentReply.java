package com.qx.cfg.pojo;

import java.io.Serializable;

public class CommentReply implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer commentId;

    private Byte commentReplyType;

    private Integer commentReplyId;

    private String commentReplyContent;

    private Integer commentToUid;

    private Integer commentFromUid;

    private String commentFromThumbImg;

    private String commentFromNickname;

    private Integer commentCreateTime;

    private String commentToNickname;

    private Integer commentReplyRewardNum;

    private Integer commentReplyReward;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Byte getCommentReplyType() {
        return commentReplyType;
    }

    public void setCommentReplyType(Byte commentReplyType) {
        this.commentReplyType = commentReplyType;
    }

    public Integer getCommentReplyId() {
        return commentReplyId;
    }

    public void setCommentReplyId(Integer commentReplyId) {
        this.commentReplyId = commentReplyId;
    }

    public String getCommentReplyContent() {
        return commentReplyContent;
    }

    public void setCommentReplyContent(String commentReplyContent) {
        this.commentReplyContent = commentReplyContent == null ? null : commentReplyContent.trim();
    }

    public Integer getCommentToUid() {
        return commentToUid;
    }

    public void setCommentToUid(Integer commentToUid) {
        this.commentToUid = commentToUid;
    }

    public Integer getCommentFromUid() {
        return commentFromUid;
    }

    public void setCommentFromUid(Integer commentFromUid) {
        this.commentFromUid = commentFromUid;
    }

    public String getCommentFromThumbImg() {
        return commentFromThumbImg;
    }

    public void setCommentFromThumbImg(String commentFromThumbImg) {
        this.commentFromThumbImg = commentFromThumbImg == null ? null : commentFromThumbImg.trim();
    }

    public String getCommentFromNickname() {
        return commentFromNickname;
    }

    public void setCommentFromNickname(String commentFromNickname) {
        this.commentFromNickname = commentFromNickname == null ? null : commentFromNickname.trim();
    }

    public Integer getCommentCreateTime() {
        return commentCreateTime;
    }

    public void setCommentCreateTime(Integer commentCreateTime) {
        this.commentCreateTime = commentCreateTime;
    }

    public String getCommentToNickname() {
        return commentToNickname;
    }

    public void setCommentToNickname(String commentToNickname) {
        this.commentToNickname = commentToNickname == null ? null : commentToNickname.trim();
    }

    public Integer getCommentReplyRewardNum() {
        return commentReplyRewardNum;
    }

    public void setCommentReplyRewardNum(Integer commentReplyRewardNum) {
        this.commentReplyRewardNum = commentReplyRewardNum;
    }

    public Integer getCommentReplyReward() {
        return commentReplyReward;
    }

    public void setCommentReplyReward(Integer commentReplyReward) {
        this.commentReplyReward = commentReplyReward;
    }
}