package iuh.fit.zy_week05;

import com.neovisionaries.i18n.CountryCode;
import iuh.fit.zy_week05.backend.entities.*;
import iuh.fit.zy_week05.backend.enums.Role;
import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.enums.SkillType;

import iuh.fit.zy_week05.backend.ids.JobSkillId;
import iuh.fit.zy_week05.backend.repositories.*;
import iuh.fit.zy_week05.backend.services.RegistrationService;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

@SpringBootApplication
public class ZyWeek05Application {

	public static void main(String[] args) {
		SpringApplication.run(ZyWeek05Application.class, args);
	}

	@Autowired
	CompanyRepository companyRepository;
	@Autowired
	JobRepository jobRepository;
	@Autowired
	SkillRepository skillRepository;
	@Autowired
	JobSkillRepository jobSkillRepository;
	@Autowired
	CandidateRepository candidateRepository;
	@Autowired
	CandidateSkillRepository candidateSkillRepository;
	@Autowired
	AddressRepository addressRepository;
	@Autowired
	RegistrationService registrationService;

	@Autowired
	PasswordEncoder passwordEncoder;



//	@Bean
//	CommandLineRunner initData(AddressRepository addressRepository){
//		Faker faker = new Faker();
//		return args -> {
//				for(int i = 0; i < 10; i++){
//					Address address = Address.builder()
//							.city(faker.address().city())
//							.country(CountryCode.VN)
//							.zipcode(faker.address().zipCode())
//							.street(faker.address().streetName())
//							.number(faker.address().buildingNumber())
//							.build();
//
//					Address saveAdd = addressRepository.save(address);
//
//					Company company = Company.builder()
//							.compName(faker.company().name())
//							.about(faker.company().industry())
//							.address(saveAdd)
//							.phone(faker.phoneNumber().cellPhone())
//							.email(faker.internet().emailAddress())
//							.webUrl(faker.internet().url())
//							.password(passwordEncoder.encode("12345678"))
//							.role(Role.COMPANY)
//							.build();
//
//
//					Company saveComp = companyRepository.save(company);
//
//
//
//					for (int j = 0; j < 3; j++) {
//						Job job = Job.builder()
//								.company(saveComp)
//								.jobName(faker.job().position())
//								.jobDesc(faker.weather().description())
//								.expiredDate(LocalDateTime.now().plusDays(30))
//								.build();
//						Job saveJob = jobRepository.save(job);
//
//						for (int k = 0; k<3; k++){
//							Skill skill = Skill.builder()
//									.skillName(faker.job().keySkills())
//									.skillDescription(faker.job().keySkills())
//									.type(SkillType.TECHNICAL_SKILL)
//									.build();
//							Skill saveSkill = skillRepository.save(skill);
//
//							JobSkillId jobSkillId = JobSkillId.builder()
//									.jobId(saveJob)
//									.skillId(saveSkill)
//									.build();
//
//							JobSkill jobSkill = JobSkill.builder()
//									.id(jobSkillId)
//									.skillLevel(SkillLevel.PROFESSIONAL)
//									.moreInfos(faker.job().keySkills())
//									.build();
//
//							jobSkillRepository.save(jobSkill);
//						}
//					}
//				}
//
//		};
//	}

}
