package de.softwarepunkt.taskmanagement.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Task {
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private TaskType taskType;

}
