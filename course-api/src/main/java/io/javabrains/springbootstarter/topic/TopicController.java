package io.javabrains.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopic() {
		//TODO
		return Arrays.asList(
				new Topic("Spring" , "Spring Framwork" , "Spring framework discription"),
				new Topic("KRunal" , "KK Framwork" , "KK framework discription"),
				new Topic("AArav" , "AArsh Framwork" , "Shubhechha framework discription")
				
				);
	}

}
