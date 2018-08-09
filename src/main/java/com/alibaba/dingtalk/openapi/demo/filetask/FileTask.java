package com.alibaba.dingtalk.openapi.demo.filetask;
import java.util.*;
public class FileTask {
	private String id;//任务id
	private String name;//任务名称
	private String fileno;//发文号
	private Date gotTime;//收文日期
	private String from;//收文机构
	private String advice;//拟办意见
	private String createrId;//创建人id
	private String auditorId;//主审人ID
	private String audAdvice;//主审人意见
	private String leaderId;//负责人id
	private String leaderAdvice;//负责人意见
	private String derecterId;//承办人id
	private String result;//处理结果
	private List<String> coordinators;//协办人ID列表
	private Date dueDate;//截止日期
	private char state;//任务状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFileno() {
		return fileno;
	}
	public void setFileno(String fileno) {
		this.fileno = fileno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getGotTime() {
		return gotTime;
	}
	public void setGotTime(Date gotTime) {
		this.gotTime = gotTime;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getCreaterId() {
		return createrId;
	}
	public void setCreaterId(String createrId) {
		this.createrId = createrId;
	}
	public String getAuditorId() {
		return auditorId;
	}
	public void setAuditorId(String auditorId) {
		this.auditorId = auditorId;
	}
	public String getAudAdvice() {
		return audAdvice;
	}
	public void setAudAdvice(String audAdvice) {
		this.audAdvice = audAdvice;
	}
	public String getLeaderId() {
		return leaderId;
	}
	public void setLeaderId(String leaderId) {
		this.leaderId = leaderId;
	}
	public String getLeaderAdvice() {
		return leaderAdvice;
	}
	public void setLeaderAdvice(String leaderAdvice) {
		this.leaderAdvice = leaderAdvice;
	}
	public String getDerecterId() {
		return derecterId;
	}
	public void setDerecterId(String derecterId) {
		this.derecterId = derecterId;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
	public List<String> getCoordinators() {
		return coordinators;
	}
	public void setCoordinators(List<String> coordinators) {
		this.coordinators = coordinators;
	}
	public Date getDueDate() {
		return dueDate;
	}
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}
}
