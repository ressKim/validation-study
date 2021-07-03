package hello.itemservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.validation.Validator;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class ItemServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ItemServiceApplication.class, args);
	}

	//implements WebMvcConfigurer 설정을 해 주면 글로벌하게 쓸 수 있지만 거의 사용 안한다고 보면 된다.
//	@Override
//	public Validator getValidator() {
//		return WebMvcConfigurer.super.getValidator();
//	}
}
