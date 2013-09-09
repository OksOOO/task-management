package de.softwarepunkt.taskmanagement.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@NotNull
	@Size(min = 1, max = 45)
    @Pattern(regexp = "[A-Za-z ]*", message = "must contain only letters and spaces")	
	private String name;

	@NotNull
	@NotEmpty
	@Email
	private String email;
	
	@OneToMany(mappedBy="createUser")
	private Set<Task> createUserTasks;
	
	@OneToMany(mappedBy="recipientUser")
	private Set<Task> recipientUserTasks;

	public Set<Task> getCreateUserTasks() {
		return createUserTasks;
	}

	public void setCreateUserTasks(Set<Task> createUserTasks) {
		this.createUserTasks = createUserTasks;
	}

	public Set<Task> getRecipientUserTasks() {
		return recipientUserTasks;
	}

	public void setRecipientUserTasks(Set<Task> recipientUserTasks) {
		this.recipientUserTasks = recipientUserTasks;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
