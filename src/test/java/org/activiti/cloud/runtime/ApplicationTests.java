package org.activiti.cloud.runtime;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
@DirtiesContext
public class ApplicationTests {

	@Test
	public void contextLoads() throws Exception {
		//check variable has been resolved for path to processes (actually startup would fail if it hadn't but nice to illustrate)
		Assert.assertNotNull(System.getenv("PROCESSESPATH"));
		Assert.assertNotEquals(System.getenv("PROCESSESPATH"),"${PROCESSESPATH}");
	}

}