package tn.esprit.formation.service;

import tn.esprit.formation.entity.Certificate;

import java.util.List;

public interface CertificateServiceImpl {
    List<Certificate> getAllCertificates();

    Certificate getCertificateById(Long id);

    Certificate createCertificate(Certificate certificate);

    Certificate updateCertificate(Long id, Certificate certificate);

    void deleteCertificate(Long id);

    List<Certificate> getCertificatesByUserId(Long userId);
}