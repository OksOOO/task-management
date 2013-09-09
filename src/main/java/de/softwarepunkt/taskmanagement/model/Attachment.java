package de.softwarepunkt.taskmanagement.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "attachment")
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
	private String description;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
