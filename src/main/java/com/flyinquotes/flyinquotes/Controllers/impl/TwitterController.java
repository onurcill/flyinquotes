package com.flyinquotes.flyinquotes.Controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flyinquotes.flyinquotes.Controllers.ITwitterController;

import java.util.List;

@RestController
@RequestMapping(value="api", method=RequestMethod.POST)
public class TwitterController implements ITwitterController{
	
	@Autowired
	private Twitter twitter;
	
	
	@CrossOrigin(origins = "http://localhost:3000")		
	public List<Tweet> getTweets(@PathVariable final String hashTag) {
		List<Tweet> t = twitter.searchOperations().search(hashTag).getTweets();
		for (Tweet te : t) {
			System.out.println(te.getText());
			System.out.println("-------------------------------------------------------------");
		}
		
		return twitter.searchOperations().search(hashTag).getTweets();
	}
	
}