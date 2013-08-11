package de.softwarepunkt.taskmanagement.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.io.Serializable;
import java.sql.Clob;

@Entity
public class Task implements Serializable{
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "type_id")
	private TaskType taskType;
	
	@ManyToOne
	@JoinColumn(name = "create_user_id")
	private User createUser;
	
	@ManyToOne
	@JoinColumn(name = "recipient_user_id")
	private User recipientUser;
	
	@Column(name = "create_date", nullable = false)
	private Date createDate;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "content")
	private Clob content;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "done", nullable = false)
	private Boolean done;

	@OneToMany
	@JoinTable(name = "task_attachment", 
	           joinColumns = { @JoinColumn(name = "ta_task_id", referencedColumnName = "task_id") }, 
	           inverseJoinColumns = { @JoinColumn(name = "ta_attachment_id", referencedColumnName = "attachment_id") })
	private Set<Task> tasks;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TaskType getTaskType() {
		return taskType;
	}

	public void setTaskType(TaskType taskType) {
		this.taskType = taskType;
	}

	public User getCreateUser() {
		return createUser;
	}

	public void setCreateUser(User createUser) {
		this.createUser = createUser;
	}

	public User getRecipientUser() {
		return recipientUser;
	}

	public void setRecipientUser(User recipientUser) {
		this.recipientUser = recipientUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Clob getContent() {
		return content;
	}

	public void setContent(Clob content) {
		this.content = content;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Boolean getDone() {
		return done;
	}

	public void setDone(Boolean done) {
		this.done = done;
	}

	public Set<Task> getTasks() {
		return tasks;
	}

	public void setTasks(Set<Task> tasks) {
		this.tasks = tasks;
	}
	
}
