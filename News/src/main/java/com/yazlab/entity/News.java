package com.yazlab.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "news")
public class News {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int NewsId;
	private String date;
	private String type;
	private String content;
	private String title;
	private String image;
	private int likes;
	private int dislikes;
	private int views;
	private int kkk;
	public int getNewsId() {
		return NewsId;
	}
	public void setNewsId(int newsId) {
		NewsId = newsId;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public int getDislikes() {
		return dislikes;
	}
	public void setDislikes(int dislikes) {
		this.dislikes = dislikes;
	}
	public int getViews() {
		return views;
	}
	public void setViews(int views) {
		this.views = views;
	}
	public int getKkk() {
		return kkk;
	}
	public void setKkk(int kkk) {
		this.kkk = kkk;
	}
	@Override
	public String toString() {
		return "News [NewsId=" + NewsId + ", date=" + date + ", type=" + type + ", content=" + content + ", title="
				+ title + ", image=" + image + ", likes=" + likes + ", dislikes=" + dislikes + ", views=" + views
				+ ", kkk=" + kkk + "]";
	}
	public News(int newsId, String date, String type, String content, String title, String image, int likes,
			int dislikes, int views, int kkk) {
		super();
		NewsId = newsId;
		this.date = date;
		this.type = type;
		this.content = content;
		this.title = title;
		this.image = image;
		this.likes = likes;
		this.dislikes = dislikes;
		this.views = views;
		this.kkk = kkk;
	}
	public News(String date, String type, String content, String title, String image, int likes, int dislikes,
			int views, int kkk) {
		super();
		this.date = date;
		this.type = type;
		this.content = content;
		this.title = title;
		this.image = image;
		this.likes = likes;
		this.dislikes = dislikes;
		this.views = views;
		this.kkk = kkk;
	}
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
}
