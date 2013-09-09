package de.softwarepunkt.taskmanagement.model;

import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(User.class)
public abstract class User_ {

	public static volatile SingularAttribute<User, Integer> id;
	public static volatile SetAttribute<User, Task> recipientUserTasks;
	public static volatile SingularAttribute<User, String> email;
	public static volatile SingularAttribute<User, String> name;
	public static volatile SetAttribute<User, Task> createUserTasks;

}

