package com.cloud.college.college.service;

import com.cloud.college.college.entity.CollegeEntity;
import com.cloud.college.college.model.College;
import com.cloud.college.college.repository.CollegeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CollegeService  {
	@Autowired
	private CollegeRepository repository;

	public College save(CollegeEntity college) {
		CollegeEntity c = repository.save(college);
		return Optional.of(c).map(mapper).orElse(null);
	}


	public List<College> findAll() {
		return repository.findAll().stream().map(mapper).collect(Collectors.toList());
	}

	public College findById(Long id) {
		return repository.findById(id).map(mapper).orElse(null);
	}

	private Function<? super CollegeEntity, ? extends College> mapper = c -> {
		College response = new College();
		BeanUtils.copyProperties(c, response);
		return response;
	};
}