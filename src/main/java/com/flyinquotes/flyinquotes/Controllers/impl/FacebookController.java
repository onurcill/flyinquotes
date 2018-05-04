package com.flyinquotes.flyinquotes.Controllers.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flyinquotes.flyinquotes.Controllers.IFacebookController;

@RequestMapping(value="facebook", method = RequestMethod.GET)
public class FacebookController implements IFacebookController{

	@Autowired
	private Facebook facebook;
	
	
	@CrossOrigin(origins = "http://localhost:3000")		
	public PagedList<Post> getPosts(@PathVariable final String hashTag) {
		//List<Tweet> t = twitter.searchOperations().search(hashTag).getTweets();
		PagedList<Post> f = facebook.feedOperations().getPosts(hashTag);
		for (Post fe : f) {
			System.out.println(fe.getMessage());
			System.out.println("-------------------------------------------------------------");
		}
		
		return facebook.feedOperations().getPosts();
	}
	
}
