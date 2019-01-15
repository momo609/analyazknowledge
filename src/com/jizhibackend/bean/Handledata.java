package com.jizhibackend.bean;

public class Handledata {
	private int resultid;
	private int testid;
	private int studentid;
	private String answers;
	private String answer_trace;
	private String time;
	private String look_back_times;
	private String collect;
	
	public String getcollect() {
		return collect;
	}
	public void setCollect(String collect) {
		this.collect = collect;
	}
	public String getAnswer_trace() {
		return answer_trace;
	}
	public void setAnswer_trace(String answer_trace) {
		this.answer_trace = answer_trace;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	
	public String getLook_back_times() {
		return look_back_times;
	}
	public void setLook_back_times(String look_back_times) {
		this.look_back_times = look_back_times;
	}

	private int score;
	public int getResultid() {
		return resultid;
	}
	public void setResultid(int resultid) {
		this.resultid = resultid;
	}
	public int getTestid() {
		return testid;
	}
	public void setTestid(int testid) {
		this.testid = testid;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getAnswers() {
		return answers;
	}
	public void setAnswers(String answers) {
		this.answers = answers;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
