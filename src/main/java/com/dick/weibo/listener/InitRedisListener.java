package com.dick.weibo.listener;

import com.dick.weibo.utils.CacheUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitRedisListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        CacheUtil.setString("onlineCount","0");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
