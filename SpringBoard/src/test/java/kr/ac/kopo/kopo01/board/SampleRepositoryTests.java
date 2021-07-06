package kr.ac.kopo.kopo01.board;

import java.util.HashMap;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import kr.ac.kopo.kopo01.domain.Sample;
import kr.ac.kopo.kopo01.repo.SampleRepository;
import kr.ac.kopo.kopo01.repo.SampleSpecs;

@SpringBootTest
public class SampleRepositoryTests {

	@Autowired
	private SampleRepository sampleRepository;
	
//	@Test
//	public void findAll() {
//		Map<String, Object> filter = new HashMap<String, Object>();
//		filter.put("id", 1);
//		
//		PageRequest pageable = PageRequest.of(0, 2);
//		Page<Sample> page = sampleRepository.findAll(SampleSpecs.search(filter), pageable);
//		
//		for(Sample sample: page) {
//			System.out.println(sample.getTitle());
//		}
//	}
	
	@Test
	void contextLoads() {
		Map<String, Object> filter = new HashMap<String, Object>();
		filter.put("title", "안녕하세영");
		
		PageRequest pageable = PageRequest.of(0, 2);
		Page<Sample> page = sampleRepository.findAll(SampleSpecs.search(filter), pageable);
		
		for(Sample sample: page) {
			System.out.println(sample.getTitle());
		}
	}
}
