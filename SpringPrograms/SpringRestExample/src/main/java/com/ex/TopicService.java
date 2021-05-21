package com.ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
private List<Topic> topiclist = new ArrayList<Topic>(Arrays.asList(new Topic("1234","Java","Langauge"), new Topic("1235","ORACLE","DBMS"),new Topic("1236","Eclipse","IDE")));

public List<Topic> getAllTopics(){
	return topiclist;
	}
public Topic getTopic(String id) {
	Topic topic = null;
	for(Topic tx: topiclist) {
		if(tx.getId().equals(id)) {
			topic = tx;
		}
	}
	return topic;
}
}
