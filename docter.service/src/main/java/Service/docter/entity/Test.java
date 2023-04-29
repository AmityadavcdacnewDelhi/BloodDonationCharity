package Service.docter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	 private int TestId;
	private int patientId;
	 private String TestName;
	 public int getTestId() {
		return TestId;
	}
	public void setTestId(int testId) {
		TestId = testId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getTestName() {
		return TestName;
	}
	public void setTestName(String testName) {
		TestName = testName;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
