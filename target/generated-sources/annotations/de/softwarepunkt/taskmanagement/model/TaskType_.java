package de.softwarepunkt.taskmanagement.model;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(TaskType.class)
public abstract class TaskType_ {

	public static volatile SingularAttribute<TaskType, Long> id;
	public static volatile SetAttribute<TaskType, Task> tasks;
	public static volatile SingularAttribute<TaskType, String> type;

}

