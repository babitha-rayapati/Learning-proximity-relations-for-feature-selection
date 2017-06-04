package com.Interface;

import com.Bean.Bean;
import com.Bean.Uploadbean;

public interface Interface {
	
	public int register(Bean b);
	public boolean login(Bean b);
public  int upload(Uploadbean be,String username);	

}
