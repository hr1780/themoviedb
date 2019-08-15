package com.moviedb.themoviedb.contoller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.moviedb.themoviedb.service.DiscoverService;
import com.moviedb.themoviedb.service.FindService;
import com.moviedb.themoviedb.service.SearchService;

@RestController
@RequestMapping("/movies")
public class FrontController 
{
	@RequestMapping("/trendingmovies")
	public ResponseEntity<String> trendingmovies()
	{
		FindService findService = new FindService();
		return findService.trendingmovies();
	}
	@RequestMapping("/upcomingmovies")
	public ResponseEntity<String> upcomingmovies()
	{
		DiscoverService discoverService = new DiscoverService();
		return discoverService.upcomingmovies();
	}
	@RequestMapping("/searchperson/{person}")
	public ResponseEntity<String> byActorName(@PathVariable("person") String person)
	{
		SearchService searchService = new SearchService();
		return searchService.byActorName(person);
	}
	@RequestMapping("/searchmovies/{movie}")
	public ResponseEntity<String> byMovieName(@PathVariable("movie") String movie)
	{
		SearchService searchService = new SearchService();
		return searchService.byMovieName(movie);
	}
}
