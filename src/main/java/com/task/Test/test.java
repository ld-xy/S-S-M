package com.task.Test;

import com.task.mapper.UserMapper;
import com.task.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.Reader;

/**
 * @author LD
 * @date 2020/10/5 - 17:30
 **/


public class test {

        @Test
        public void test() throws Exception {
            String resource = "mybatis-conf.xml";
            //1.读取配置文件
            Reader inputStream = Resources.getResourceAsReader(resource);
            //2.创建工厂对象
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
            //3.借助工厂生产session对象
            SqlSession session  = sqlSessionFactory.openSession();
//		try {
//			//4.通过session对象中的selectOne方法，来调用执行定义方法
//			Employee employee =
//					session.selectOne("com.liu.Mapper.EmployeeMapper.getEmployeeById", 1001);
//			System.out.println(employee);
//		} finally {
//			//5.资源关闭
//			session.close();
//		}
            //方法二：
            //4.使用动态代理对象，利用类对象来创建代理对象 Proxy.newProxyInstance()来创建对象
            UserMapper mapper = session.getMapper(UserMapper.class);
            //5.动态代理调用方法
            User user = mapper.selectByPrimaryKey(1);
            System.out.println(user.getUsername());
            //6.关闭资源
            session.close();
        }

    }


