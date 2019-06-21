package kopo.git.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import kopo.git.service.GitService;
import kopo.git.vo.GitVO;
import kopo.user.vo.UserVO;

@Controller
public class GitController {
	@Autowired
	private GitService gitService;
	
	@RequestMapping("/getGitList.do")
	// model 객체에 데이터 저장
	public String getGitList(Model model) {
		// user 목록을 리스트에 담는다
		List<GitVO> gitList = gitService.getGitList();
		// userList 객체를 모델에 저장
		model.addAttribute("gitList", gitList);
		// userList.jsp 호출
		return "gitList";
	}
	
	@RequestMapping("/insertGitForm.do")
	public ModelAndView insertUserForm() {	
		
		// user 목록을 리스트에 담는다
		List<GitVO> gitList = gitService.getGitList();
		

		
		List<String> idList = new ArrayList<String>();
		
		for (int i = 0; i < gitList.size(); i++) {
			idList.add(gitList.get(i).getUserId());
		}
	
		
		Map<String, List<String>> map = new HashMap<>();
		map.put("idList", idList);
		
		return new ModelAndView("gitInsert", "map", map);
	}
	@RequestMapping("/insertGit.do")
	public String insertGit(@ModelAttribute GitVO git) {		
		if (git != null)
			gitService.insertGit(git);
		return "redirect:/getGitList.do";
	}	
	@ExceptionHandler
	public String handleException(Exception e) {
		return "viewError";
	}
}














