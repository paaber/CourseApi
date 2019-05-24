/**
 * 
 */
package com.paaber.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

/**
 * @author botosoftdev
 *
 * 22 May 2019
 */
@Service
public class TopicService {

	private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","SpringFramework","SpringFramework Description"),
			new Topic("Oluwashina","Oriyomi","Paaber Description"),
			new Topic("Python","Python Library","Python Library Description")));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	public Optional<Topic> getTopic(String id)
	{
		return topics.stream().filter(t -> t.getId().equals(id)).findAny();
	}
	
	public void addTopic(Topic topic)
	{
		topics.add(topic);
	}

	public void updateTopic(String id, Topic topic) {
		// TODO Auto-generated method stub
		for(int i=0;i<topics.size();i++)
		{
			Topic t = topics.get(i);
			if(t.getId().equals(id))
			{
				topics.set(i, topic);
			}
		}
	}

	public void deleteTopic(String id, Topic topic) 
	{
		// TODO Auto-generated method stub
		topics.removeIf(t->t.getId().equals(id));
	}
}
