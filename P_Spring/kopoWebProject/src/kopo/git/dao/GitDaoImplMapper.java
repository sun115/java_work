package kopo.git.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kopo.git.vo.GitVO;

@Repository("gitDao")
public class GitDaoImplMapper implements GitDao {
	@Autowired
	private GitMapper gitMapper;	
	
//	@Override
//	public UserVO read(String id) {
//		UserVO user  = userMapper.selectUserById(id);
//		return user;
//	}
	
	public List<GitVO> readAll() {
		List<GitVO> gitList = gitMapper.selectGitList();
		return gitList;
	}

	public void insert(GitVO git) {
		gitMapper.insertGit(git);
		System.out.println("Record UserId=" + git.getUserId() + 
				" Name=" + git.getUserId());
	}
//
//	@Override
//	public void update(UserVO user) {
//		userMapper.updateUser(user);
//	}
//	
//	@Override
//	public void delete(String id) {
//		userMapper.deleteUser(id);
//		System.out.println("Record with ID = " + id ); 
//	}
}










