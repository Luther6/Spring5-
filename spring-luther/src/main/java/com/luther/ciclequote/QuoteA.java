package com.luther.ciclequote;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author liujie
 * @datetime 2019/11/15 22:43
 */
@Component
public class QuoteA {
	/*@Autowired
	public QuoteB quoteB;*/
	@Autowired
	public QuoteC quoteCccccccc;

	public QuoteA() {
		System.out.println("安得广厦千万间");
	}
/*	@Autowired
	public void take(QuoteC quoteC){
		System.out.println("风雨不动安如山");
	}*/
	@PostConstruct
	public void show(){
		System.out.println("大庇天下寒士俱欢颜");
	}

}
