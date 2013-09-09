package de.softwarepunkt.taskmanagement.model;

import java.util.Date;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Task.class)
public abstract class Task_ {

	public static volatile SingularAttribute<Task, Integer> id;
	public static volatile SingularAttribute<Task, String> title;
	public static volatile SingularAttribute<Task, User> createUser;
	public static volatile SingularAttribute<Task, Boolean> done;
	public static volatile SingularAttribute<Task, TaskType> taskType;
	public static volatile SingularAttribute<Task, User> recipientUser;
	public static volatile SingularAttribute<Task, Date> date;
	public static volatile SingularAttribute<Task, Date> createDate;

}

