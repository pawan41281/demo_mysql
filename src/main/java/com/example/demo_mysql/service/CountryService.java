package com.example.demo_mysql.service;

import java.util.List;

import com.example.demo_mysql.vo.CountryVo;

public interface CountryService {

	public List<CountryVo> findAll();

	public CountryVo find(Long id);

	public CountryVo save(CountryVo CountryVo);

}
