package com.yazlab.endpoint;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yazlab.NewsDTO.newsDTO;
import com.yazlab.entity.News;
import com.yazlab.service.NewsService;

@RestController
@RequestMapping(value = "/rest")
public class NewsEndPoint {

	@Autowired
	private NewsService newsService;

	@RequestMapping(value = "/getAll", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<News>> getNotes() {

		return new ResponseEntity<>(newsService.getAll(), HttpStatus.OK);

	}
	@RequestMapping(value = "/blog", method = RequestMethod.POST)
	public ResponseEntity<ArrayList<News>> getNotes(@RequestBody newsDTO news) {

		return new ResponseEntity<>(newsService.getAll(news), HttpStatus.OK);

	}
	
}
