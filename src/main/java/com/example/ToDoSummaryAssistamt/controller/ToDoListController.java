package com.example.ToDoSummaryAssistamt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ToDoSummaryAssistamt.ToDoListServiceImpl.ToDoListServiceImpl;
import com.example.ToDoSummaryAssistamt.entity.ToDoList;

@RestController
public class ToDoListController {
	@Autowired
	ToDoListServiceImpl toDoListServiceImpl;
	
	@PostMapping ("/todos")
	public ResponseEntity<ToDoList> createTask(@RequestBody ToDoList toDoList) {
		toDoListServiceImpl.createTasks(toDoList);
		
		return new ResponseEntity<ToDoList>(toDoList,HttpStatus.CREATED); 
	}
	
	@GetMapping("/todos")
	public ResponseEntity<List<ToDoList>> createTask() {
		List<ToDoList> list = toDoListServiceImpl.getTasks();
		return new ResponseEntity<List<ToDoList>>(list,HttpStatus.CREATED); 
	}
	
	@DeleteMapping("delete/{id}")
	public ResponseEntity<String> deleteById(@PathVariable("id") Integer id){
		toDoListServiceImpl.deleteTask(id);
		return new ResponseEntity<String>("Deleted Succesfully",HttpStatus.OK);
		
	}
	
	@PatchMapping("/update/{id}")
	public ResponseEntity<Void> taskCompleted(@PathVariable("id") Integer id){
		toDoListServiceImpl.taskCompleted(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
	
	
}
