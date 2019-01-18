package com.madusha.spring.romeo.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("Spring", "Spring Framework", "Spring Framework description"),
			new Topic("Java", "Java core", "Java core description"),
			new Topic("Java script", "Java Script", "Java Script description")
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}

}
