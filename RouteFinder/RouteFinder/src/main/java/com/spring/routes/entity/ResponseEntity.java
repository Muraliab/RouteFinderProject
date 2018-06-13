package com.spring.routes.entity;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Component
public class ResponseEntity {
	
	@JsonIgnore
	public List<Object> responseList;
	@JsonIgnore
	public Map<Object,Object> responseMap;
	@JsonIgnore
	public Set<Object> responseSet;
	
	public Object response;
	
	
	public Object getResponse() {
		return response;
	}
	public void setResponse(Object response) {
		this.response = response;
	}
	public List<Object> getResponseList() {
		return responseList;
	}
	public void setResponseList(List<Object> responseList) {
		this.responseList = responseList;
	}
	public Map<Object, Object> getResponseMap() {
		return responseMap;
	}
	public void setResponseMap(Map<Object, Object> responseMap) {
		this.responseMap = responseMap;
	}
	public Set<Object> getResponseSet() {
		return responseSet;
	}
	public void setResponseSet(Set<Object> responseSet) {
		this.responseSet = responseSet;
	}
	
}
