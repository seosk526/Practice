package kr.ac.kopo.kopo01.sample.repo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import kr.ac.kopo.kopo01.repo.SampleRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class SampleRepositoryTest {
    
    @Autowired
    private MockMvc mockMvc;
    
    @Test
    public void shouldReturnDefaultMessage() throws Exception {
        this.mockMvc.perform(get("/sample/findAll")).andDo(print())
            .andExpect(status().isOk())
            .andExpect(content().string(containsString("title")));
    }
    
    /*
    @Autowired
    private SampleRepository sampleRepository;
    
    @Before
    public void before() {
        System.out.println("before");
    }
    
    @After
    public void after() {
        System.out.println("after");
    }
    
    @Test
    public void findAll() {
        assertEquals(18, sampleRepository.count());
    }
    
    @Test
    public void equalTest() {
        assertEquals("안녕하세영", "안녕하세영");
    }
    
    @Test
    @Ignore
    public void notEqualTest() {
        assertEquals("안녕하세영", "이리오세영");
    }
    */
}
