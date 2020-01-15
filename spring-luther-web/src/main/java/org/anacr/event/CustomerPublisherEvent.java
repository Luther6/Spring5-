package org.anacr.event;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

/**
 * @author liujie
 * @date 2019/12/20 21:28
 */
@Component
public class CustomerPublisherEvent implements ApplicationEventPublisherAware {

	private ApplicationEventPublisher publisher;


	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		publishEvent();
	}

	public void publishEvent() {
		publisher.publishEvent(new CustomerEvent(this, "luther"));
	}
}
