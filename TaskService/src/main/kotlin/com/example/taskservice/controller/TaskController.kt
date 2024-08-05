package com.example.taskservice.controller

import com.example.taskservice.model.Task
import com.example.taskservice.service.TaskService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/tasks")
class TaskController(private val taskService: TaskService) {

    @GetMapping
    fun getAllTasks(): List<Task> {
        return taskService.getAllTasks()
    }

    @PostMapping
    fun addTask(@RequestBody task: Task): Task {
        return taskService.addTask(task)
    }
}