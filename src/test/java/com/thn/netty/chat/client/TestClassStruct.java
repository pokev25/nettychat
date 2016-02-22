package com.thn.netty.chat.client;

import org.junit.Test;

import com.thn.netty.chat.primitive.CommandType;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestClassStruct {
	@Test
	public void CommandTypeTest(){

		for(CommandType type : CommandType.values()){
			log.info(type.toString());
		}
	}
	
	
}
