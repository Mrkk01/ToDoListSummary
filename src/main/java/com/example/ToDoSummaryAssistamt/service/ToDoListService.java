package com.example.ToDoSummaryAssistamt.service;

import java.util.List;

import com.example.ToDoSummaryAssistamt.entity.ToDoList;

public interface ToDoListService {
	
	public void createTasks(ToDoList toDoList);
	
	public List<ToDoList> getTasks();
	
	void taskCompleted(Integer id);
	void deleteTask(Integer id);

}
