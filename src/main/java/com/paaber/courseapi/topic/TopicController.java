/**
 * 
 */
package com.paaber.courseapi.topic;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author botosoftdev
 *
 * 22 May 2019
 */

@RestController
@RequestMapping("/")
public class TopicController {   
	@Autowired
	private TopicService topicservice;
	
	@RequestMapping("topic")
	public List<Topic> getAllTopics()
	{
		return topicservice.getAllTopics();
	}
	@RequestMapping("topic/{id}")
	public Optional<Topic> getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	@PostMapping("topic")
	public void addTopic(@RequestBody Topic topic)
	{
		topicservice.addTopic(topic);
	}
	@PutMapping("topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topicservice.updateTopic(id,topic);
	}
	@DeleteMapping("topic/{id}")
	public void deleteTopic(@RequestBody Topic topic,@PathVariable String id)
	{
		topicservice.deleteTopic(id,topic);
	}
}
