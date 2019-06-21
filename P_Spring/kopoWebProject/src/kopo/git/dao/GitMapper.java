package kopo.git.dao;

import java.util.List;
import kopo.git.vo.GitVO;

@MyMapper
public interface GitMapper {

	
	List<GitVO> selectGitList();
//	UserVO selectUserById(String id);
	void insertGit(GitVO gitVO);
//	void updateUser(UserVO userVO);
//	void deleteUser(String id);
}
