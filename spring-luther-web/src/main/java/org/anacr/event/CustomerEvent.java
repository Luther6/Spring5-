package org.anacr.event;

import org.springframework.context.ApplicationEvent;

/**
 * @author liujie
 * @date 2019/12/20 21:25
 */
public class CustomerEvent extends ApplicationEvent {

	private final String username;

	public CustomerEvent(Object source, String username) {
		super(source);
		this.username = username;
		System.out.println("自定义的Event");
	}

	public String getUsername() {
		return username;
	}
}
