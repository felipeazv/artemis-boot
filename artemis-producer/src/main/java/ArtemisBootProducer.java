/*
 * This Java source file was auto generated by running 'gradle buildInit'
 * by 'Felipe' at '02/04/17 11:22' with Gradle 2.14.1
 *
 * @author Felipe, @date 02/04/17 11:22
 */
import org.apache.activemq.artemis.jms.client.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan({"producer"})
@EnableScheduling
public class ArtemisBootProducer {
	public static void main(String[] args) {
		SpringApplication.run(ArtemisBootProducer.class, args);
	}
	
	@Bean
	public ActiveMQQueue queue(){
		return new ActiveMQQueue("artemis-queue-test");
	}
}
