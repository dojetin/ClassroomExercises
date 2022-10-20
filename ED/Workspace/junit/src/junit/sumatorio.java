package junit;

import java.util.Iterator;

public class sumatorio {
	
	
	public int Sumita(int num1) {
	int total=0;	
	while (num1>0) {
		total=total+num1%10;
		num1=num1/10;
	}

	//total=num1%10;
	//total=total+((num1%100-total)/10);
	//total=total+((num1%1000-total)/100);
		return total;
	}
}
