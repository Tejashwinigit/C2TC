package com.cg.placement.service;

import com.cg.placement.entities.Certificate;

public interface ICertificateService {
	
public Certificate addStudent (Certificate Student);
public Certificate updateStudent(Certificate student);
public Certificate searchStudentById(long id);

public Certificate searchStudentByHallTicket (long id);

public Certificate addCertificate(Certificate certificate);
public Certificate updateCertificate(Certificate certificate);
public boolean deleteStudent(long id);
Certificate addcertificate(Certificate certificate);
Certificate searchStudentByHallTicket(int id);

