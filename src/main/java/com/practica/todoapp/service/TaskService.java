package com.practica.todoapp.service;

import com.practica.todoapp.mapper.TaskInDTOToTask;
import com.practica.todoapp.persistence.entity.Task;
import com.practica.todoapp.persistence.repository.TaskRepository;
import com.practica.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private final TaskRepository repository;
    private final TaskInDTOToTask mapper;

    public TaskService(TaskRepository repository, TaskInDTOToTask mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    public Task createTask(TaskInDTO taskInDTO ){
    Task task= mapper.map(taskInDTO);
     return this.repository.save(task);
    }
}
