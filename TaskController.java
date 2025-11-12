package com.example.taskmanagementapi;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    List<Task> tasks = new ArrayList<>();

    @GetMapping
    public List<Task> getAllTasks() {
        return tasks;
    }

    @PostMapping
    public String addTask(@RequestBody Task task) {
        tasks.add(task);
        return "Task added!";
    }

    @DeleteMapping("/{id}")
    public String deleteTask(@PathVariable int id) {
        tasks.removeIf(t -> t.getId() == id);
        return "Task deleted!";
    }
}
