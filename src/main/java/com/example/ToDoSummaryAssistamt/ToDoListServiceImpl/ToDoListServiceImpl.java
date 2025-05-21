package com.example.ToDoSummaryAssistamt.ToDoListServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ToDoSummaryAssistamt.entity.ToDoList;
import com.example.ToDoSummaryAssistamt.repo.ToDoListRepo;
import com.example.ToDoSummaryAssistamt.service.ToDoListService;
@Service
public class ToDoListServiceImpl implements ToDoListService {
	
	@Autowired
	ToDoListRepo repo;
	
	@Override
	public void createTasks(ToDoList toDoList) {
		repo.save(toDoList);
	}

	@Override
	public List<ToDoList> getTasks() {
		List<ToDoList> dosDoLists = repo.findAll();
		return dosDoLists;
	}

	@Override
	public void deleteTask(Integer id) {
		
		repo.deleteById(id);
		
	}

	@Override
	public void taskCompleted(Integer id){
		ToDoList toDoList = repo.findById(id).get();
		
		toDoList.setTaskCompleted(true);
		
		repo.save(toDoList);
		
	}

	
		
		
	

}
