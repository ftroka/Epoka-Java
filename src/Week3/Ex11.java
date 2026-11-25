package Week3;

public class Ex11 {
	public static void mystery(int[] arr) {
		arr[0] = arr[0] * 2;
		}
		public static void main(String[] args) {
		int[] nums = {5, 6, 7};
		mystery(nums);
		System.out.println(nums[0]);
		}
}
