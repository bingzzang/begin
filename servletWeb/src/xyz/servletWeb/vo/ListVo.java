package xyz.servletWeb.vo;

import java.util.Date;

public class ListVo {

	private int bno;
	private String title;
	private String conts;
	private String writer;
	private Date regdate;
	private int viewcnt;
	
	public ListVo() {
		
	}
	public ListVo(int bno, String title, String conts, String writer, Date regdate, int viewcnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.conts = conts;
		this.writer = writer;
		this.regdate = regdate;
		this.viewcnt = viewcnt;
	}
	
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getConts() {
		return conts;
	}
	public void setConts(String conts) {
		this.conts = conts;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
}
