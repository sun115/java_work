package kopo.git.vo;

public class GitVO {
	
	private String userId;
	private String gitId;
	private String gitAddress;
	private String name;
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public GitVO(String userId, String gitId, String gitAddress) {
		
		this.userId = userId;
		this.gitId = gitId;
		this.gitAddress = gitAddress;
		this.name = name;
	}


	
	public GitVO() {
		// TODO Auto-generated constructor stub
	}

	public String getUserId() {
		return userId;
	}



	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGitId() {
		return gitId;
	}



	public void setGitId(String gitId) {
		this.gitId = gitId;
	}



	public String getGitAddress() {
		return gitAddress;
	}



	public void setGitAddress(String gitAddress) {
		this.gitAddress = gitAddress;
	}
	
	@Override
	public String toString() {
		return "GitVO [userId=" + userId + ", gitId=" + gitId + ", gitAddress=" + gitAddress + "]";
	}
	
}
