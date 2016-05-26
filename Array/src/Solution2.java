
public class Solution2 {

	public static void main(String[] args) {
		int value[] = new int[10];
		for (int i = 0; i < 10; i++) {
			value[i] = i;
		}
		traverse(value);
		insert(value, 666, 5);
		// delete(value, 3);
		// traverse(value);
	}

	/**
	 * 插入
	 * 
	 * @param old
	 * @param value
	 * @param index
	 * @return
	 */
	public static int[] insert(int[] old, int value, int index) {  
        for (int k = old.length - 1; k > index; k--)  
            old[k] = old[k - 1];  
        old[index] = value;  
        return old;  
    }  

	/**
	 * 遍历
	 * 
	 * @param data
	 */
	public static void traverse(int data[]) {
		for (int j = 0; j < data.length; j++) {
			System.out.println(data[j] + " ");
		}
	}

	/**
	 * 删除
	 * 
	 * @param old
	 * @param index
	 * @return
	 */
	public static int[] delete(int[] old, int index) {
		for (int h = index; h < old.length - 1; h++) {
			old[h] = old[h + 1];
		}
		old[old.length - 1] = 0;
		return old;
	}
}
