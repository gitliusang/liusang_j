package erfenfa;

public class ErFenFa {
	
	public int getEr(int [] arr,int value){
		int start = 0;// 开始下标为0
		int end = arr.length - 1;// 结束下标
//		int index = -1;
		int mid = (start + end) / 2;
		
		while(start<=end){
			if (arr[mid]>value) {
				end = mid -1;
			}else if(arr[mid]<value){
				start = mid + 1;
			}else{
//				index = mid;
				return mid;
			}
			
			if (value<arr[start]||value>arr[end]) {
				return -1;
			}
			mid = (start + end) / 2;
			System.out.println("训话");
		}
		return -1;
	}

	// 二分法
	public static void main(String[] args) {
		// 定义数组
		int[] arr = { 1, 2, 3, 4, 5,  6,  7, 8 };
		//            0, 1, 2, 3, 4,  5,  6  7
		int seeNum = 8;// 要查询的值
		
		ErFenFa e = new ErFenFa();
		int index = e.getEr(arr, seeNum);
		
//		while (arr[mid]!=seeNum) {
//			if (seeNum>arr[mid]) {
//				start = mid+1;
//			}else{
//				end = mid -1;
//			}
//			
//			if (end<start) {
//				index = -1;
//				break;
//			}else{
//				mid = (start + end) / 2;
//				index = mid;
//			}
//
//		}
		
		System.out.println(index);
	}
}
