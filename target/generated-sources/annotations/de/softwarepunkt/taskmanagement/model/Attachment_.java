package de.softwarepunkt.taskmanagement.model;

import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@StaticMetamodel(Attachment.class)
public abstract class Attachment_ {

	public static volatile SingularAttribute<Attachment, Integer> id;
	public static volatile SingularAttribute<Attachment, String> description;
	public static volatile SingularAttribute<Attachment, byte[]> file;

}

