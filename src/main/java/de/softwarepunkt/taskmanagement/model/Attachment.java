package de.softwarepunkt.taskmanagement.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Attachment")
public class Attachment implements Serializable{
	
	@Id
	@GeneratedValue
	@Column(name = "attachment_id")
	private Integer id;
	
	@Column(name = "file_content")
	@Lob
	private byte[] file;
	
	@NotNull
	@Size(min = 1, max = 255)
	private String comment;

	@ManyToMany
	@JoinTable(name = "task_attachment", 
	           joinColumns = { @JoinColumn(name = "attachment_id", referencedColumnName = "attachment_id") }, 
	           inverseJoinColumns = { @JoinColumn(name = "task_id", referencedColumnName = "task_id") })
	private Set<Task> tasks;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public byte[] getFile() {
		return file;
	}

	public void setFile(byte[] file) {
		this.file = file;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
}
