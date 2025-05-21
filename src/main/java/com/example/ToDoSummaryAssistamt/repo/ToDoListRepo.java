package com.example.ToDoSummaryAssistamt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ToDoSummaryAssistamt.entity.ToDoList;

public interface ToDoListRepo extends JpaRepository<ToDoList, Integer> {

}
