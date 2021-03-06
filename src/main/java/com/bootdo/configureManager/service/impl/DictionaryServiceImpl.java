package com.bootdo.configureManager.service.impl;

import com.bootdo.configureManager.dao.self.DictionarySelfDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.bootdo.common.controller.BaseController;
import com.bootdo.common.domain.PageDO;
import com.bootdo.configureManager.dao.DictionaryDao;
import com.bootdo.configureManager.domain.DictionaryDO;
import com.bootdo.configureManager.service.DictionaryService;



@Service
public class DictionaryServiceImpl implements DictionaryService {
	@Autowired
	private DictionaryDao dictionaryDao;
	@Autowired
	private DictionarySelfDao dictionarySelfDao;
	
	@Override
	public DictionaryDO get(int dictId){
		return dictionarySelfDao.get(dictId);
	}
	
	@Override
	public List<DictionaryDO> list(Map<String, Object> map){
		return dictionarySelfDao.list(map);
	}
	
	@Override
	public int count(Map<String, Object> map){
		return dictionaryDao.count(map);
	}
	
	@Override
	public int save(DictionaryDO dictionary){
		
		return dictionaryDao.save(dictionary);
	}
	
	@Override
	public int update(DictionaryDO dictionary){
	
		return dictionaryDao.update(dictionary);
	}
	
	@Override
	public int remove(int dictId){
		return dictionaryDao.remove(dictId);
	}
	
	@Override
	public int batchRemove(int[] dictIds){
		return dictionaryDao.batchRemove(dictIds);
	}


	@Override
	public List<DictionaryDO> list1() {
		// TODO Auto-generated method stub
		return dictionarySelfDao.list1();
	}
	
}
