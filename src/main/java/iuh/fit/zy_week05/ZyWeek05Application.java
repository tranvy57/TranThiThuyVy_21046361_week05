package iuh.fit.zy_week05;

import com.neovisionaries.i18n.CountryCode;
import iuh.fit.zy_week05.backend.entities.*;
import iuh.fit.zy_week05.backend.enums.SkillLevel;
import iuh.fit.zy_week05.backend.enums.SkillType;
import iuh.fit.zy_week05.backend.enums.UserType;
import iuh.fit.zy_week05.backend.ids.JobSkillId;
import iuh.fit.zy_week05.backend.repositories.*;
import net.datafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
	AccountRepository accountRepository;



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
//							.webUrl(faker.internet().url())							.build();
//
//					Account account = Account.builder()
//							.username(company.getEmail())
//							.password("1234")
//							.userType(UserType.COMPANY)
//							.build();
//					Account savedAccount = accountRepository.save(account);
//
//					company.setAccount(savedAccount);
//					Company saveComp = companyRepository.save(company);
//
//
//
//					for (int j = 0; j < 3; j++) {
//						Job job = Job.builder()
//								.company(saveComp)
//								.jobName(faker.job().position())
//								.jobDesc(faker.job().keySkills())
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
