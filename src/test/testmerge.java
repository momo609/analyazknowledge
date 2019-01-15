package test;

import java.util.ArrayList;
import java.util.Arrays;

public class testmerge {
public static void main(String args[]){
	  ArrayList<Integer> c=new ArrayList();
	  int a[]={1,5,3,7,8};
	  int b[]={2,4,5,9,10,8,11};
	  Arrays.sort(a);
	  Arrays.sort(b);
	  int i=0,j=0;
	  while(i<5&&j<7)
	  {
		  if(a[i]<b[j])
		  {
			  c.add(a[i]);
			  i++;
			  
		  }
		  else if(a[i]>b[j])
		  {
			  c.add(b[j]);
			  j++;
			  
		  }
		  else if(a[i]==b[j])
		  {
			  c.add(a[i]);
			  i++;
			  j++;
			  
		  }
	  }
	  System.out.println(c);
}
}
