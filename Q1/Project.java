package Q1;

import java.io.Serializable;

public class Project implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -4169457614992460957L;
	String projectCode;
	String projectName;
	int projectStrength;

	public Project(String projectCode, String projectName, int projectStrength) {
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}

	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}
}
