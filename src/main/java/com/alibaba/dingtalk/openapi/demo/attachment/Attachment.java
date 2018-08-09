package com.alibaba.dingtalk.openapi.demo.attachment;

public class Attachment {
	private String id;//附件id
	private String url;//附件储存路径
	private String taskId;//所属任务号
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getTaskId() {
		return taskId;
	}
	public void setTaskId(String taskId) {
		this.taskId = taskId;
	}
}
