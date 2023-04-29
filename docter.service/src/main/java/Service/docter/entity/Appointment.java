package Service.docter.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Appointment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int AppointmentId;
	private String Problem;
	private int patientId;
	private String DocterName;
	private int DocterID;
	private String Doctertype;
	private String Qualification;
	private int DocterFee;
	private String paymentStatus;
	private String Appointment_Status;
	public int getAppointmentId() {
		return AppointmentId;
	}
	public void setAppointmentId(int appointmentId) {
		AppointmentId = appointmentId;
	}
	public String getProblem() {
		return Problem;
	}
	public void setProblem(String problem) {
		Problem = problem;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getDocterName() {
		return DocterName;
	}
	public void setDocterName(String docterName) {
		DocterName = docterName;
	}
	public int getDocterID() {
		return DocterID;
	}
	public void setDocterID(int docterID) {
		DocterID = docterID;
	}
	public String getDoctertype() {
		return Doctertype;
	}
	public void setDoctertype(String doctertype) {
		Doctertype = doctertype;
	}
	public String getQualification() {
		return Qualification;
	}
	public void setQualification(String qualification) {
		Qualification = qualification;
	}
	public int getDocterFee() {
		return DocterFee;
	}
	public void setDocterFee(int docterFee) {
		DocterFee = docterFee;
	}
	public String getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public String getAppointment_Status() {
		return Appointment_Status;
	}
	public void setAppointment_Status(String appointment_Status) {
		Appointment_Status = appointment_Status;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	
}
