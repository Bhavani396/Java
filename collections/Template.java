package com.collections;

public class Template {

	public static void main(String[] args) {
		
		TemplateClass<String,Integer> obj = new TemplateClass();
		
		obj.setData("Java programming");
		obj.setData2(10);
		
		System.out.println(obj.getData()+ " "+ obj.getData2());
		
		
		TemplateClass<String,Boolean> obj1 = new TemplateClass();
		
		obj1.setData("Java programming");
		obj1.setData2(true);
		
		System.out.println(obj1.getData()+ " "+ obj1.getData2());
		
		}

}

 class TemplateClass<U, V> {
	
	private U data1;
	private V data2;
	

	public V getData2() {
		return data2;
	}

	public void setData2(V data2) {
		this.data2 = data2;
	}

	public U getData() {
		return data1;
	}

	public void setData(U data) {
		this.data1 = data;
	}
	
	
	}





