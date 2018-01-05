package ken.week18_02;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student[]  arr2=new Student[4];
          System.out.println(arr2);
          System.out.println(arr2.length);
          Student s1=new Student(10, "´¨ÆÕ", "0", "ÄÐ");
          Student s2=new Student(10, "´¨ÆÕ1", "1", "ÄÐ");
          Student s3=new Student(10, "´¨ÆÕ2", "2", "ÄÐ");
          Student s4=new Student(10, "´¨ÆÕ3", "3", "ÄÐ");
          arr2[0]=s1;
          arr2[1]=s2;
          arr2[2]=s3;
          arr2[3]=s4;
          //ÔöÇ¿forÑ­»·
          for(Student ss:arr2){
        	  System.out.println(ss.show());
          }
        
	}

}
