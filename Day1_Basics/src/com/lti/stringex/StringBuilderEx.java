package com.lti.stringex;

public class StringBuilderEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		String sb1=new String("animals");
//		
//		StringBuilder sb=new StringBuilder("animals");
//		System.out.println(sb.indexOf("al"));
//
//		sb=new StringBuilder().append(1).append('c');
//		System.out.println(sb);
//		sb.append("-").append(true);
//		System.out.println(sb);
//		
//		System.out.println("a"+"b"+3);
		
		int three=3;
		String four="4";
		
		System.out.println(1+2+three+four);
		
		String sb1= new String("animals");   	    	

        StringBuilder sb = new StringBuilder("animals");
        System.out.println(sb.indexOf("al"));
        
        //charAt(), indexOf(), length(), and substring()
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);//

        //append()
        sb = new StringBuilder().append(1).append('c');
        sb.append("-").append(true);   // sb1.concat(true); String can;t cancat int 
        
        
        StringBuilder ms = new StringBuilder("mansi");
        ms= new StringBuilder().append(1).append('c').append(true);
        
        System.out.println(sb); 
        System.out.println("----------------");
        System.out.println(ms);
        
         //a n  i  m  a l s 
    	//0 1 2   3  4 5 6
        
        //insert()
        sb = new StringBuilder("animals");
        sb.insert(7, "-"); //-ani-mals-
        sb.insert(0, "-");        
        sb.insert(4, "-"); 
        System.out.println(sb); // 

        //delete() and deleteCharAt()
        sb = new StringBuilder("abcdef");
        sb.delete(1, 4); // deleted from 1st to 3rd index char 
       System.out.println(sb);
      // sb.deleteCharAt(5); 

        //replace()
        StringBuilder builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 6, "sty");
        System.out.println(builder); 
        builder = new StringBuilder("pigeon dirty");
        builder.replace(3, 100, "");
        System.out.println(builder);
        
        //reverse()
        sb = new StringBuilder("ABC");
        sb.reverse();//CBA  
        System.out.println(sb);

        //toString()
        String s = sb.toString();
        System.out.println(s);
		
	}

}
