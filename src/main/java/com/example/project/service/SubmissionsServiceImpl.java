package com.example.project.service;

import com.example.project.model.Submissions;
import com.example.project.repository.SubmissionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SubmissionsServiceImpl implements SubmissionsService {
    @Autowired
    private SubmissionsRepository submissionsRepository;
    @Override
    public List<Submissions> getAll() {
        List<Submissions> list=submissionsRepository.findAll();

        return list;
    }

    @Override
    public Submissions save(Submissions submissions) {
        Submissions submissions1=submissionsRepository.save(submissions);
        return submissions1;
    }

    @Override
    public void updateById(Submissions submissions, Integer id) {
        submissions.setId(id);
        submissionsRepository.save(submissions);

    }

    @Override
    public void deleteById(Integer id) {
        submissionsRepository.deleteById(Long.valueOf(id));

    }

    @Override
    public List<Submissions> getById(Integer id) {
        List<Submissions> list=submissionsRepository.findAllById(id);
        return list;
    }
}
