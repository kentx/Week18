package ken.week18_02;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1=new int[5];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i]=i+2;
		}
		for (int i = 0; i < arr1.length; i++) {
			System.out.println(arr1[i]);
		}
		System.out.println("============");
		//1.7 jdk ��һ��������  ��ǿforѭ��   ������������
		for(int sb:arr1){
			System.out.println(sb);
		}
		

	}

}
