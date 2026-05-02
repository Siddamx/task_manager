
package com.taskmanager.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.taskmanager.repository.TaskRepository;
import com.taskmanager.model.Task;
import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository repo;

    public Task create(Task t) { return repo.save(t); }
    public List<Task> getAll() { return repo.findAll(); }

    public Task update(Long id, String status) {
        Task t = repo.findById(id).orElseThrow();
        t.setStatus(status);
        return repo.save(t);
    }
}
