package com.cg.placement.repository;

import com.cg.placement.entities.Certificate;

public interface ICertificateRepository {
	
	public Certificate addcertificate(Certificate certificate);
	public Certificate updatecertificate(Certificate student);
	public Certificate searchcertificateById(int id);
	public Certificate searchcertificateByHallTicket(int hallTicketno);
	public boolean deleteStudent(int id);
	public Certificate addCertificate(Certificate certificate);
	public Certificate updateCertificate(Certificate certificate);
	
	
public abstract  void beginTransaction();
public abstract void  commitTransaction();

}
