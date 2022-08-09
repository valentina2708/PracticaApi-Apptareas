package com.practica.todoapp.mapper;

import com.practica.todoapp.persistence.entity.Task;
import com.practica.todoapp.service.dto.TaskInDTO;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class TaskInDTOToTask  implements IMapper<TaskInDTO,Task>{
    @Override
    public Task map(TaskInDTO in) {
        Task task=new Task();
        task.setTitle(in.getTitle());
        task.setDescription(in.getDescription());
        task.setCreatedDate(LocalDateTime.now());
        task.setFinished(false);
        return task;
    }
}
