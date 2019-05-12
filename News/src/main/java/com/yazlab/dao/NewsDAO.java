package com.yazlab.dao;

import java.util.ArrayList;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.yazlab.entity.News;

@Repository
public class NewsDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	public int insert(News news){
		sessionFactory.getCurrentSession().save(news);
		update(news);
		return 2 ;
	}
	
	public void update(News news){
		news.setKkk(news.getNewsId());
		sessionFactory.getCurrentSession().update(news);
	}
	
	public void persist(News news){
		sessionFactory.getCurrentSession().persist(news);
	}
	
	public void delete(News news){
		sessionFactory.getCurrentSession().delete(news);
	}
	
	
	//READ
	public News getFindById(int NewsId){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM News WHERE NewsId=:NewsId")
				.setInteger("NewsId", NewsId);
		return (News) query.getSingleResult();
	}
	
	public ArrayList<News> getAll(){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM News");
		return (ArrayList<News>) query.getResultList();
	}
	
	
	/*public ArrayList<News> getFindByIdArray(int NewsId){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM News WHERE NewsId=:NewsId")
				.setInteger("NewsId", NewsId);
		return (ArrayList<News>) query.getResultList();
	}*/
	public ArrayList<News> getNewsWithType(String type){
		Query query = sessionFactory.getCurrentSession().createQuery("FROM News WHERE type=:type")
				.setString("type", type);
		return (ArrayList<News>) query.getResultList();
	}
	
}
