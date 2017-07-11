package my.tutorials.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestOneController implements TestOneDao {
	
	@Autowired
	private TestOneDao testOneDao;

	@RequestMapping(value = "save", method = RequestMethod.POST)
	public void save(@RequestBody TestOne testOne) {
		testOneDao.save(testOne);
	}

	@RequestMapping(value = "list", method = RequestMethod.POST)
	public List<TestOne> list() {
		return testOneDao.list();
	}

}
