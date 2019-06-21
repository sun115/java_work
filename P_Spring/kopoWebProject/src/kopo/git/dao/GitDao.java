package kopo.git.dao;

import java.util.List;

import kopo.git.vo.GitVO;

public interface GitDao{
	
	public void insert(GitVO git);
	
	public List<GitVO> readAll();
	
//	public void update(UserVO user);
//	
//	public void delete(String id);
//	
//	public UserVO read(String id);
	
}

