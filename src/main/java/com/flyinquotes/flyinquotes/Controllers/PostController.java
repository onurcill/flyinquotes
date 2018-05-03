package com.flyinquotes.flyinquotes.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import java.util.List;


@RestController
@RequestMapping(PostController.TWITTER_BASE_URI)
public class PostController {
	
	public static final String TWITTER_BASE_URI = "svc/v1/tweets";
	
	@Autowired
	private Twitter twitter;
			
	@RequestMapping(value="{hashTag}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Tweet> getTweets(@PathVariable final String hashTag) {
		List<Tweet> t = twitter.searchOperations().search(hashTag).getTweets();
		for (Tweet te : t) {
			System.out.println(te.getText());
			System.out.println("-------------------------------------------------------------");
		}
		
		return twitter.searchOperations().search(hashTag).getTweets();
	}

}