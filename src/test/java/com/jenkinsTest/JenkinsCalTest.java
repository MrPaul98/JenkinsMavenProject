package com.jenkinsTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jenkins.JenkinsCalci;

public class JenkinsCalTest {

	@Test
	public void addTest() {
		JenkinsCalci calci= new JenkinsCalci();
		assertEquals(10, calci.addNumber(5, 5));
		
	}
	
	@Test
	public void subTest() {
		JenkinsCalci calci= new JenkinsCalci();
		assertEquals(0, calci.subNumber(5, 5));
		
	}
}
