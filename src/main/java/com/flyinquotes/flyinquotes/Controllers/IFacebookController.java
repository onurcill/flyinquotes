package com.flyinquotes.flyinquotes.Controllers;

import org.springframework.http.MediaType;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface IFacebookController {
	
	@RequestMapping(value="{hashTag}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public PagedList<Post> getPosts(@PathVariable final String hashTag);
}
