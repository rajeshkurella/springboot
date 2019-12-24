package com.rajeshkurell.springBootStart.topic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService{
	
	@Autowired
	private TopicRepository topicRepository;
	
	List<Topic> topics=new ArrayList<>();
	
	public List<Topic> getAllTopics()
	{
		return (List<Topic>) this.topicRepository.findAll();
		
	}
	
	public Optional<Topic> getTopic(String id) {
		
		return  this.topicRepository.findById(id);
	}
	
	public void addTopic(Topic topic) {
		this.topicRepository.save(topic);
	}
	
	public void updateTopic(String id,Topic topic) {
		this.topicRepository.save(topic);
	}
	
	public void deleteTopic(String id) {
		this.topicRepository.deleteById(id);
	}

}
