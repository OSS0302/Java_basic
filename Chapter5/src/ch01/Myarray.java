package ch01;

public class Myarray {


	int[] intArr;   	//int array
	int count;  		//개수
		
	public int ARRAY_SIZE;
	public static final int ERROR_NUM = -999999999;
	
	public Myarray()
	{
		count = 0;
		ARRAY_SIZE = 10;
		intArr = new int[ARRAY_SIZE];
	}
	
	public Myarray(int size) // 사이즈 만큼 잡겠다.
	{
		count = 0;
		ARRAY_SIZE = size;
		intArr = new int[size];
	}
	
	public void addElement(int num)
	{
		if(count >= ARRAY_SIZE){
			System.out.println("not enough memory");
			return;
		}
		intArr[count++] = num; // 카운트 증가 계수를 계속세고 있다.
				
	}

	public void insertElement(int position, int num)
	{
		int i ;
		if(position<0 || position >count) {
			return;
		}
		if(count >=ARRAY_SIZE ) {
				
		}
		if(position < 0 || position > count ){  //index error
			System.out.println("insert Error");
			return;
		}
		// 한개씩 뒤로 이동 꽉찬경우
		for( i = count-1; i >= position ; i--){
			intArr[i+1]  = intArr[i];     
		}
		
		intArr[position] = num;
		count++; //요소의 갯수를 고려한다. 자수만 관리하나다.
	}
	
	public int removeElement(int position) //배열 삭제 
	{
		int ret = ERROR_NUM;
		
		if( isEmpty() ){
			System.out.println("There is no Arrayelement");
			return ret;
		}
		// 앞으로 데이테이동한다.
		if(position < 0 || position >= count ){  //index error
			System.out.println("remove Error");
			return ret;
		}
		
		ret = intArr[position];
		
		for(int i = position; i<count -1; i++ )
		{
			intArr[i] = intArr[i+1];
		}
		count--;
		return ret;
	}
	
	public int getSize()
	{
		return count;
	}
	
	public boolean isEmpty()
	{
		if(count == 0){
			return true;
		}
		else return false;
	}
	
	public int getElement(int position)
	{
		if(position < 0 || position > count-1){ //포지션이 0보다 작고 -1보다 크다. 
			
			System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
			return ERROR_NUM;
		}
		return intArr[position];
	}
	
	public void printAll()
	{
		if(count == 0){
			System.out.println("출력할 내용이 없습니다.");
			return;
		}
			
		for(int i=0; i<count; i++){
			System.out.println(intArr[i]);
		}
		
	}
	
	public void removeAll()
	{
		for(int i=0; i<count; i++){
			intArr[i] = 0;
		}
		count = 0;
	}
}
