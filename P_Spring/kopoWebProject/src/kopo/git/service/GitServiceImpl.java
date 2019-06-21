package kopo.git.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kopo.git.dao.GitDao;
import kopo.git.vo.GitVO;

@Service("gitService")
public class GitServiceImpl implements GitService{

	@Autowired
	GitDao gitdao;

	@Override
	public void insertGit(GitVO git) {
		gitdao.insert(git);
	}
	public List<GitVO> getGitList() {
		return gitdao.readAll();
	}
//	@Override
//	public void deleteUser(String id) {
//		userdao.delete(id);
//	}
//	@Override
//	public UserVO getUser(String id) {
//		return userdao.read(id);
//	}
//	@Override
//	public void updateUser(UserVO user) {
//		userdao.update(user);
//	}
}

