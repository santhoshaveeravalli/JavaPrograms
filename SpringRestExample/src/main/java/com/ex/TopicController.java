package com.ex;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	@Autowired
  private TopicService topicService;
	@RequestMapping("/topics")
  public List<Topic> getAllTopics(){
	 List<Topic> topics = topicService.getAllTopics();
	 return topics;
  }
	@RequestMapping("/topics/{id}")
	  public Topic getTopic(@PathVariable String id){
		Topic topics = topicService.getTopic(id);
		 return topics;
	  }
}
