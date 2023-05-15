package com.example.project.service;

import com.example.project.model.Assignments;
import com.example.project.repository.AssignmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AssignmentsServiceImpl implements AssignmentsService{
    @Autowired
    AssignmentsRepository assignmentsRepository;
    @Override
    public List<Assignments> getAll() {
        List<Assignments> assignments=assignmentsRepository.findAll();
        return assignments;
    }

    @Override
    public Assignments save(Assignments assignments) {
        Assignments assignments1=assignmentsRepository.save(assignments);
        return assignments1;
    }

    @Override
    public void updateById(Assignments assignments, Integer id) {
        assignments.setId(id);
        assignmentsRepository.save(assignments);

    }

    @Override
    public void deleteById(Integer id) {
        assignmentsRepository.deleteById(Long.valueOf(id));

    }

    @Override
    public List<Assignments> getById(Integer id) {
        List<Assignments> assignments=assignmentsRepository.findAllById(id);
        return assignments;
    }
}
