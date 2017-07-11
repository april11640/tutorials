package my.tutorials.mybatis;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TestOneDao {
	
	void save(TestOne testOne);
	
	List<TestOne> list();

}
