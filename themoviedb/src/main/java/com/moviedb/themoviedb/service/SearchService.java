package com.moviedb.themoviedb.service;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.client.RestTemplate;

public class SearchService 
{
	public ResponseEntity<String> byActorName(String person)
	{
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("APIKey", "6e8ebaec70f27ea69491b2c5b9d6bf8e");
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			String resourceURL = "https://api.themoviedb.org/3/search/person?api_key=6e8ebaec70f27ea69491b2c5b9d6bf8e&query="+person;
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			
			ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
			
			return response;
	}
	public ResponseEntity<String> byMovieName(String keyword)
	{
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.set("APIKey", "12343b9c442643a0292f6cc5972c77e9");
			headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
			String resourceURL = "https://api.themoviedb.org/3/search/movie?api_key=6e8ebaec70f27ea69491b2c5b9d6bf8e&query="+keyword;
			HttpEntity<String> entity = new HttpEntity<String>(headers);
			
			ResponseEntity<String> response = restTemplate.exchange(resourceURL, HttpMethod.GET, entity, String.class);
			return response;
	}
	
}
