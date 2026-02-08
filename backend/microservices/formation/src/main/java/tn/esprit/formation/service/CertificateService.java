package tn.esprit.formation.service;

import tn.esprit.formation.entity.Certificate;
import tn.esprit.formation.repository.CertificateRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {

    private final CertificateRepository certificateRepository;

    public CertificateService(CertificateRepository certificateRepository) {
        this.certificateRepository = certificateRepository;
    }

    public List<Certificate> getAllCertificates() {
        return certificateRepository.findAll();
    }

    public Optional<Certificate> getCertificateById(Long id) {
        return certificateRepository.findById(id);
    }

    public Certificate createCertificate(Certificate certificate) {
        return certificateRepository.save(certificate);
    }

    public Certificate updateCertificate(Long id, Certificate certificateDetails) {
        Certificate certificate = certificateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Certificate not found with id " + id));

        certificate.setCertificateName(certificateDetails.getCertificateName());
        certificate.setIssueDate(certificateDetails.getIssueDate());
        certificate.setUserId(certificateDetails.getUserId());
        certificate.setTraining(certificateDetails.getTraining());

        return certificateRepository.save(certificate);
    }

    public void deleteCertificate(Long id) {
        certificateRepository.deleteById(id);
    }

    public List<Certificate> getCertificatesByUserId(Long userId) {
        return certificateRepository.findByUserId(userId);
    }
}