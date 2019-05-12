package com.yazlab.news;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yazlab.entity.News;
import com.yazlab.service.NewsService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	@Autowired
	NewsService newsService= new NewsService();
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	@RequestMapping(value = "/error_404", method = RequestMethod.GET)
	public String error(Model model) {
		
		return "error_404";
	}
	
	
	
	@RequestMapping(value="/addNews", method=RequestMethod.POST)
	public ResponseEntity<String> addNote(@RequestBody News news, HttpServletRequest request){
		
		System.out.println(news.toString());
		
		newsService.insert(news,request);
		
		return new ResponseEntity<>("OK",HttpStatus.CREATED);
		
	}
	@RequestMapping(value = "/insert", method = RequestMethod.GET)
	public String insert(Locale locale, Model model) {
		model.addAttribute("news",newsService.getAll());
		//for(News news : newsService.getAll());
		return "addNews";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public ResponseEntity<ArrayList<News>> getNotes(HttpServletRequest request){
		
		return new ResponseEntity<>(newsService.getAll(),HttpStatus.CREATED);
		
	}
	
	@RequestMapping(value = "/blog/{NewsId}", method = RequestMethod.GET)
	public String blog(@PathVariable("NewsId") int NewsId , Model model) {
		News oldNews = newsService.getFindById(NewsId);
		oldNews.setViews(oldNews.getViews()+1);		
		model.addAttribute(newsService.update(oldNews,null));
		model.addAttribute("news",newsService.getFindById(NewsId));
		
		
		return "blog";
	}
	@RequestMapping(value = "/blog/{NewsId}t", method = RequestMethod.POST)
	public String blog(@PathVariable("NewsId") int NewsId ,Locale locale, Model model) {
		model.addAttribute("news",newsService.getAll());
		//for(News news : newsService.getAll());
		return "blog";
	}
	@RequestMapping(value = "/likes/{NewsId}", method = RequestMethod.GET)
	public String likes(@PathVariable("NewsId") int NewsId, Model model) {
		
		News oldNews = newsService.getFindById(NewsId);
		oldNews.setLikes(oldNews.getLikes()+1);		
		model.addAttribute(newsService.update(oldNews,null));		
		model.addAttribute("news",newsService.getFindById(NewsId));
		return "likes";
	}
	@RequestMapping(value = "/dislikes/{NewsId}", method = RequestMethod.GET)
	public String dislikes(@PathVariable("NewsId") int NewsId, Model model) {
		
		News oldNews = newsService.getFindById(NewsId);
		oldNews.setDislikes(oldNews.getDislikes()+1);		
		model.addAttribute(newsService.update(oldNews,null));		
		model.addAttribute("news",newsService.getFindById(NewsId));
		return "dislikes";
	}
	@RequestMapping(value = "/deleteNews/{NewsId}", method = RequestMethod.GET)
	public String delete(@PathVariable("NewsId") int NewsId , Model model) {
		
		News oldNews = newsService.getFindById(NewsId);
		
		newsService.delete(oldNews,null);
		
		return "deleteNews";
	}
	
	
	@RequestMapping(value = "/sports", method = RequestMethod.GET)
	public String sports(Locale locale, Model model) {
		model.addAttribute("news",newsService.getFindByTypeArray("sports"));
		//for(News news : newsService.getAll());
		return "sports";
	}
	@RequestMapping(value = "/agenda", method = RequestMethod.GET)
	public String agenda(Locale locale, Model model) {
		model.addAttribute("news",newsService.getFindByTypeArray("agenda"));
		//for(News news : newsService.getAll());
		return "agenda";
	}
	@RequestMapping(value = "/economy", method = RequestMethod.GET)
	public String economy(Locale locale, Model model) {
		model.addAttribute("news",newsService.getFindByTypeArray("economy"));
		//for(News news : newsService.getAll());
		return "economy";
	}
	@RequestMapping(value = "/education", method = RequestMethod.GET)
	public String education(Locale locale, Model model) {
		model.addAttribute("news",newsService.getFindByTypeArray("economy"));
		//for(News news : newsService.getAll());
		return "education";
	}
	
}
