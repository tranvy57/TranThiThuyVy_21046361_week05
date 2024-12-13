package iuh.fit.zy_week05.backend.services;

import org.springframework.stereotype.Service;

@Service
public interface EmailService {
    void sendInvitationEmail(String email, Long jobId);
}
