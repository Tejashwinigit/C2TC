package com.cg.placement.service;

import com.cg.placement.entities.Certificate;
import com.cg.placement.repository.CertificateRepositoryImpl;
import com.cg.placement.repository.ICertificateRepository;
import com.cg.placement.repository.certificate;

public abstract class CertificateServiceImpl implements ICertificateService{

	private static final Certificate Certificate = null;
	private ICertificateRepository dao;
	
	
	public CertificateServiceImpl() {
		dao= new CertificateRepositoryImpl();
		
		
	}

	@Override
	public Certificate addcertificate(Certificate certificate) {
		dao.beginTransaction();
		
		dao.addcertificate(Certificate);
		dao.commitTransaction();
		return (Certificate);
	}

	@Override
	public Certificate updateStudent(Certificate certificate) {
        dao.beginTransaction();
		
		dao.updatecertificate(addCertificate(null));
		dao.commitTransaction(); 
		return Certificate;
	}

	@Override
	public Certificate searchcertificateById(int id) {
		certificate certificate =dao.searchCertificateById(id);
		
		return Certificate;
	}

	@Override
	public Certificate searchStudentByHallTicket(long id) {
	Certificate certificate = dao.searchcertificateById(id);
	
		return Certificate;
	}

	@Override
	public Certificate addcertificate(Certificate certificate) {
		dao.beginTransaction();
		
		dao.addcertificate(Certificate);
		dao.commitTransaction();
		return (Certificate);
	}

	@Override
	public Certificate updateStudent(Certificate certificate) {
        dao.beginTransaction();
		
		dao.updatecertificate(addCertificate(null));
		dao.commitTransaction(); 
		return Certificate;
	}

	
	
	@Override
	public Certificate deletecertificate(certificate certificate)  {
	
dao.beginTransaction();
		
		dao.deletecertificate(Certificate();
		dao.commitTransaction(); 
		return Certificate;
		
	

}
