package com.sukai.demo.caseI;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

/**
 * @author chengsukai
 * @since 2022-08-12 17:18
 */
public class MyMapperProxy<T> implements InvocationHandler {

    private Class<T> mapperInterface;
    private SqlSession sqlSession;

    public MyMapperProxy(Class<T> mapperInterface, SqlSession sqlSession) {
        this.mapperInterface = mapperInterface;
        this.sqlSession = sqlSession;
    }

    // 代理类会执行的方法
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        List<T> list = sqlSession.selectList(mapperInterface.getCanonicalName() + "." + method.getName());

        return list;
    }

    public static void main(String[] args) {
    }
}
