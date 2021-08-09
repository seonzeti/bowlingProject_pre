package com.comin.bowling.maria;


import javax.inject.Inject;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@WebAppConfiguration 
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})

public class MyBatisTest {
	private static final Logger logger = LoggerFactory.getLogger(MyBatisTest.class);
	
	@Inject private SqlSessionFactory sqlFactory;
	
	@Test
	public void testFactory() {
		logger.info("sqlFactory:" + sqlFactory);
	}
	
	@Test
	public void testSession() {
		try(SqlSession sqlSession = sqlFactory.openSession()) {
			logger.info("sqlSession : " + sqlSession);
			logger.info("mybatis 연결 성공");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
