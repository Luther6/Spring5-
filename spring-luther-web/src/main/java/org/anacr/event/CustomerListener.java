package org.anacr.event;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @date 2019/12/20 21:32
 */
@Component
public class CustomerListener implements ApplicationListener<CustomerEvent> {


	@Override
	public void onApplicationEvent(CustomerEvent event) {
		System.out.println("接收到该Event并做出回应		"+ event.getUsername());
	}
}
