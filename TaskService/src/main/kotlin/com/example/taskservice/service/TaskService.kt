package com.example.taskservice.service

import com.example.taskservice.model.Task
import org.springframework.stereotype.Service

@Service
class TaskService {

    private val tasks = mutableListOf<Task>()

    fun getAllTasks(): List<Task> {
        return tasks
    }

    fun addTask(task: Task): Task {
        tasks.add(task)
        return task
    }
}