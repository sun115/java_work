package kopo.git.service;

import java.util.List;

import kopo.git.vo.GitVO;

public interface GitService {

	public void insertGit(GitVO git);
	
	public List<GitVO> getGitList();
	
//	public void deleteUser(String id);
//	
//	public UserVO getUser(String id);
//	
//	public void updateUser(UserVO user);
}

