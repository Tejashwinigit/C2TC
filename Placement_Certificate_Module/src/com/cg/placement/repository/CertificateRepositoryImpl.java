package com.cg.placement.repository;

import javax.persistence.EntityManager;

import com.cg.placement.entities.Certificate;

public class CertificateRepositoryImpl implements ICertificateRepository{

private static final Object Certificate = null;
private EntityManager entityManager;
public CertificateRepositoryImpl()
{
	entityManager = JPAUtil.getEntityManager();
}
@Override
public Certificate addcertificate(Certificate certificate) {
	entityManager.persist(certificate);
	return certificate;
}
@Override
public Certificate updatecertificate(Certificate student) {
	entityManager.merge(Certificate);
	return  Certificate;
}
@Override
public Certificate searchcertificateById(int id) {
	Certificate certificate = entityManager.find(Certificate.class,id);
	return certificate;
}
@Override
public Certificate searchcertificateByHallTicket(int hallTicketno) {
	Certificate certificate=entityManager.find(certificate.class, hallticketNo);
	return certificate;
}
@Override
public certificate deleteCertificate(Certificate Certificate) {
	entityManager.remove(Certificate);
	return Certificate;
}

@Override
public Certificate addCertificate(Certificate certificate) {
	entityManager.persist(certificate);
	return certificate;
}
@Override
public Certificate updatecertificate(Certificate student) {
	entityManager.merge(Certificate);
	return  Certificate;
}
@Override
public Certificate searchcertificateById(int id) {
	Certificate certificate = entityManager.find(Certificate.class,id);
	return certificate;
}
@Override
public Certificate searchcertificateByHallTicket(int hallTicketno) {
	Certificate certificate=entityManager.find(certificate.class, hallticketNo);
	return certificate;
}
@Override
public certificate deleteCertificate(Certificate Certificate) {
	entityManager.remove(Certificate);
	return Certificate;
}
@Override
public void beginTransaction() {
	entityManager.getTransaction().begin();

	
	
}
@Override
public void commitTransaction() {
	entityManager.getTransaction().commit();
	


@Override
public void deleteStudent(int id) {
	certificate certificate = entityManager.find(certificate.class, id);
	entityManager.remove(certificate);
}