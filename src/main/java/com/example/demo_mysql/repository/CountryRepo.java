package com.example.demo_mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo_mysql.vo.CountryVo;

@Repository
public interface CountryRepo extends JpaRepository<CountryVo, Long> {

}
