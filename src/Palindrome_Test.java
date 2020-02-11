import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Palindrome_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Solution s = new Solution();
//		boolean b = s.isPalindrome("A man, a plan, a canal: Panama");
//		System.out.println(b);
//		System.out.println("begin~~");
//		Solution1 s = new Solution1();
//		ListNode list1 = new ListNode(1);
//		ListNode list2 = new ListNode(2);
//		ListNode list3 = new ListNode(3);
//		list1.next=list2;
//		list2.next=list3;
//		boolean b = s.isPalindrome(list1);
//		System.out.println(b);
		
//		"deadbeef"
		//"all people seem all to need need link"
//		String s1 = "deadbeef";
//		String s2 = "all people seem all to need need link";
//		Solution s = new Solution();
//		boolean b = s.wordPattern(s1, s2);
//		System.out.println(b);
//		Solution s = new Solution();
//		int [] nums = {1,2,3};
//		System.out.println(s.permute(nums).toString());//È«ÅÅÁÐ
		
		int[] nums = {1,2,0};
		
		System.out.println(firstMissingPositive(nums));
		
	}
	public static int firstMissingPositive(int[] nums) {
		//Collections.sort(arg0);
		List<Integer> l = new ArrayList<Integer>(nums.length);
		 Set set = new HashSet();
	    for(int i = 0; i<nums.length;i++) {
	    	l.add(nums[i]);
	    	set.add(nums[i]);
	    }
	    Collections.sort(l);
	   // System.out.println(l.toString());
	   for(int i = 1;i<nums.length;i++) {
		   if(set.contains(i)) {
			   continue;
		   }else {
			   return i;
		   }
	   }
        return l.get(l.size()-1)+1;
    }
	
}
