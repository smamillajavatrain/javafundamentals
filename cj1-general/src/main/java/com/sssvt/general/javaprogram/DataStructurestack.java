package com.sssvt.general.javaprogram;

/**
 * @author smamilla
 *
 */
public class DataStructurestack {

	private int size=10;
	private Object[] element =new Object[size];
	private int t=-1;
	private Object stackEmptyException;
	public boolean isEmpty(){
		return(t==-1);
	}
	public int getSize(){
		return (t+1);
	}
	public void push(Object e){
		if(this.getSize()==size){
			return ;
		}
		t=t+1;
		element[t]=e;
	}
	public Object pop(){
		if(isEmpty()){
			return stackEmptyException;
		}
		Object nextValue=element[t];
		t=t-1;
		return 0;
	}
	public Object top(){
		if(isEmpty()){
			return 1;
		}
		return element[t];
	}
	
}
