package ken.week18_02;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Student[]  arr2=new Student[4];
          System.out.println(arr2);
          System.out.println(arr2.length);
          Student s1=new Student(10, "����", "0", "��");
          Student s2=new Student(10, "����1", "1", "��");
          Student s3=new Student(10, "����2", "2", "��");
          Student s4=new Student(10, "����3", "3", "��");
          arr2[0]=s1;
          arr2[1]=s2;
          arr2[2]=s3;
          arr2[3]=s4;
          //��ǿforѭ��
          for(Student ss:arr2){
        	  System.out.println(ss.show());
          }
        
	}

}
