package iuh.fit.zy_week05.backend.services.impl;

import iuh.fit.zy_week05.backend.entities.Job;
import iuh.fit.zy_week05.backend.repositories.JobRepository;
import iuh.fit.zy_week05.backend.repositories.JobSkillRepository;
import iuh.fit.zy_week05.backend.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JobRepository jobRepository;

    @Value("${spring.mail.username}")
    private String senderEmail;

    @Autowired
    private JavaMailSender javaMailSender;

    @Override
    public void sendInvitationEmail(String email, Long jobId) {
        Job job = jobRepository.findById(jobId).get();
        try {

            String body = "Kính gửi bạn,\n\n" +
                    "Chúng tôi rất vui khi được mời bạn tham gia một cơ hội nghề nghiệp tuyệt vời tại " + job.getCompany().getCompName() + ".\n\n" +
                    "Dưới đây là thông tin về công việc:\n\n" +
                    "Vị trí: " + job.getJobName() + "\n" +
                    "Mô tả công việc: " + job.getJobDesc() + "\n\n" +
                    "Công ty: " + job.getCompany().getCompName() + "\n" +
                    "Địa chỉ: " + job.getCompany().getAddress().getStreet() + job.getCompany().getAddress().getCity() + "\n" +
                    "Email liên hệ: " + job.getCompany().getEmail() + "\n\n" +
                    "Nếu bạn cảm thấy đây là cơ hội phù hợp với kỹ năng và sở thích của bạn, vui lòng liên hệ với chúng tôi qua email hoặc đăng nhập vào hệ thống của chúng tôi để biết thêm chi tiết.\n\n" +
                    "Chúng tôi mong được hợp tác với bạn.\n\n" +
                    "Trân trọng,\n" +
                    job.getCompany().getCompName() + " Team";

            SimpleMailMessage mailMessage = new SimpleMailMessage();
            mailMessage.setFrom(senderEmail);
            mailMessage.setTo(email);

            mailMessage.setSubject("Lời mời tham gia công việc tại: " + job.getCompany().getCompName());
            mailMessage.setText(body);
            javaMailSender.send(mailMessage);
            System.out.println("Mail send successfully");
        } catch (MailException e) {
            throw new RuntimeException(e);
        }

    }
}
