package com.alibaba.dingtalk.openapi.demo.filetask;
import java.util.*;
public class FileTask {
	private String id;//任务id
	private String name;//任务名称
	private String fileno;//发文号
	private Date gottime;//收文日期
	private String place;//收文机构
	private String advice;//拟办意见
	private String createrid;//创建人id
	private String auditorid;//主审人ID
	private String audadvice;//主审人意见
	private String leaderid;//负责人id
	private String leaderadvice;//负责人意见
	private String derecterid;//承办人id
	private String result;//处理结果
	private List<String> coordinators;//协办人ID列表
	private Date duedate;//截止日期
	private char state;//任务状态
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFileno() {
		return fileno;
	}
	public void setFileno(String fileno) {
		this.fileno = fileno;
	}
	public Date getGottime() {
		return gottime;
	}
	public void setGottime(Date gottime) {
		this.gottime = gottime;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAdvice() {
		return advice;
	}
	public void setAdvice(String advice) {
		this.advice = advice;
	}
	public String getCreaterid() {
		return createrid;
	}
	public void setCreaterid(String createrid) {
		this.createrid = createrid;
	}
	public String getAuditorid() {
		return auditorid;
	}
	public void setAuditorid(String auditorid) {
		this.auditorid = auditorid;
	}
	public String getAudadvice() {
		return audadvice;
	}
	public void setAudadvice(String audadvice) {
		this.audadvice = audadvice;
	}
	public String getLeaderid() {
		return leaderid;
	}
	public void setLeaderid(String leaderid) {
		this.leaderid = leaderid;
	}
	public String getLeaderadvice() {
		return leaderadvice;
	}
	public void setLeaderadvice(String leaderadvice) {
		this.leaderadvice = leaderadvice;
	}
	public String getDerecterid() {
		return derecterid;
	}
	public void setDerecterid(String derecterid) {
		this.derecterid = derecterid;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public List<String> getCoordinators() {
		return coordinators;
	}
	public void setCoordinators(List<String> coordinators) {
		this.coordinators = coordinators;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
	
}
