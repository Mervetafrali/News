package com.yazlab.service;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yazlab.NewsDTO.newsDTO;
import com.yazlab.dao.NewsDAO;
import com.yazlab.entity.News;

@Service
@Transactional
public class NewsService {
	
	
	@Autowired
	private NewsDAO newsDAO;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public int insert(News news, HttpServletRequest request){
		newsDAO.insert(news);
		newsDAO.update(news);
	return 1;
	}
	
	public int update(News news, HttpServletRequest request){
		news.setKkk(news.getNewsId());
		newsDAO.update(news);
		 return 1;
	}

	public int delete(News news, HttpServletRequest request){
		 newsDAO.delete(news);
		 return 1;
	}
	public News getFindById(int NewsId){
		return newsDAO.getFindById(NewsId);
	}

	public ArrayList<News> getAll(){
		return newsDAO.getAll();
	}
	public ArrayList<News> getFindByTypeArray(String type){
		return newsDAO.getNewsWithType(type);
	}
	public ArrayList<News> getAll(newsDTO n){
		News newsm = new News();
		newsm.setViews(n.getViews()+1);
		newsm.setLikes(n.getLikes()+1);
		newsm.setDislikes(n.getDislikes()+1);
		
		return newsDAO.getAll();
	}

	

	


	
	/*
	
	public ArrayList<News> getAll(UserLoginDTO login){
	//	User userm = new User();
		userm.setUsername(login.getUsername());
		userm.setPassword(login.getPassword());
		User user = UserService.getFindByUsernameAndPass(userm);
		return noteDAO.getAll(user.getId());
	}*/

}
