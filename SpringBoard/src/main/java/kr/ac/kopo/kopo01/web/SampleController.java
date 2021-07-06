package kr.ac.kopo.kopo01.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import kr.ac.kopo.kopo01.domain.Sample;
import kr.ac.kopo.kopo01.repo.SampleRepository;

@Controller
public class SampleController {
	
	@Autowired
	private SampleRepository sampleRepository;
	
	@RequestMapping(value = "/sample/list/{id}", method = RequestMethod.GET)
	@ResponseBody
	public Optional<Sample> list(@PathVariable Long id) {			
		return sampleRepository.findById(id);		
	}
	
	@RequestMapping(value = "/sample/list")
	@ResponseBody
	public List<Sample> list(Model model) {
		return sampleRepository.findAll();
	}
	
	@RequestMapping(value = "/sample/pageable")
	@ResponseBody
	public List<Sample> pageable(Model model) {		
		PageRequest pageable = PageRequest.of(0, 3);
		Page<Sample> page = sampleRepository.findAll(pageable);

		return page.getContent();
	}
}
