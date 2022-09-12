package com.cb.spring;

public class Test 
{
	private Demo demo;
	private Sample sample;
		
	public Test() {}
	
	
	public Test(Demo demo, Sample sample) {
		super();
		this.demo = demo;
		this.sample = sample;
	}

	public Demo getDemo() {
		return demo;
	}
	public void setDemo(Demo demo) {
		this.demo = demo;
	}
	public Sample getSample() {
		return sample;
	}
	public void setSample(Sample sample) {
		this.sample = sample;
	}
	@Override
	public String toString() {
		return "Test [demo=" + demo + ", sample=" + sample + "]";
	}
	
	
}
