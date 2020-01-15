package com.luther.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * 对于Spring5.X 以上的日志源码分析。
 * 大体上:Spring5.X 默认使用的是jul 来进行日志的记录。
 *
 *
 * @author liujie
 * @datetime 2019/12/6 23:39
 */
public class LogTest {

	private static final Log log = LogFactory.getLog(LogTest.class);

	public static void main(String[] args) {
		log.info("Hello");
	}

}
