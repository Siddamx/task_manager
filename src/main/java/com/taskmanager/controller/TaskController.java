
package com.taskmanager.controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.taskmanager.service.TaskService;
import com.taskmanager.model.Task;
import java.util.List;

@RestController
@RequestMapping("/tasks")
public class TaskController {
    @Autowired
    private TaskService service;

    @PostMapping
    public Task create(@RequestBody Task t) { return service.create(t); }

    @GetMapping
    public List<Task> getAll() { return service.getAll(); }

    @PutMapping("/{id}")
    public Task update(@PathVariable Long id, @RequestParam String status) {
        return service.update(id, status);
    }
}
