package com.flyinquotes.flyinquotes.Controllers;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface ITwitterController {
	
	@RequestMapping(value="{hashTag}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public List<Tweet> getTweets(@PathVariable final String hashTag);
	
}
