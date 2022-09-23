package com.cb.office.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.cb.office.model.TaskModel;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "task")
@JsonIdentityInfo(
		  generator = ObjectIdGenerators.PropertyGenerator.class, 
		  property = "taskId")
@EqualsAndHashCode(exclude = "employees")
public class Task 
{
	public Task(TaskModel taskModel) {
		this.taskTitle = taskModel.getTitle();
		this.description = taskModel.getDescription();
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "task_id")
	private Integer taskId;
	
	
	@Column(name = "task_title")
	private String taskTitle;
	
	@Column(name = "description")
	private String description;
	
	@ManyToMany(mappedBy = "tasks")    
	private Set<Employee> employees = new HashSet<Employee>();
}
