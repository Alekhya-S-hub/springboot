package com.example.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.model.Users;

@Repository
public interface UsersRepo extends JpaRepository<Users, Integer>
{
}