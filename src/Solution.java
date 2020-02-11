import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

//import java.util.ArrayList;
//
//public class Solution {
//    public boolean isPalindrome(String s) {
//        StringBuffer str = new StringBuffer(s);
//        for(int i=0,j=str.length()-1; i<j;i++, j--) {
//        	while(i < j && !Character.isLetterOrDigit(str.charAt(i))) i++;
//            while(i < j && !Character.isLetterOrDigit(str.charAt(j))) j--;
//            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(j))) 
//            	return false;
//        }
//        return true;
//    }
//}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
	  }
//
//class Solution1 {
//	public boolean isPalindrome(ListNode head) {
//		if(head==null || head.next==null) return true;
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		while(head!=null) {
//			arr.add(head.val);
//			head=head.next;
//		}
//		int i = 0, j = arr.size() - 1;
//		while(i<j) {
//			if(arr.get(i).compareTo(arr.get(j))!=0) {
//				return false;
//			}
//			i++;j--;
//		}
//		return true;       
//    }
//}
//
//class Solution {
//    public boolean wordPattern(String pattern, String str) {
//    	int length = pattern.length();
//    	int [] ret = new int[length*length];
//    	int index = 0;
//    	
//    	String[] splited = str.split("\\s+");//������ʽ\s��ʾƥ���κοհ��ַ���+��ʾƥ��һ�λ��Ρ�
//    	int length1 = splited.length;
//    	if(length!=length1) return false;
//    	
//    	int [] ret1 = new int[length*length];
//    	int index1 = 0;
//    	for(int i=0; i<length-1; i++) {
//    		for(int j=i+1; j<length; j++) {
//    			if(pattern.charAt(i)==pattern.charAt(j))
//    				ret[index++]=1;
//    			else
//    				ret[index++]=0;
//    			
//    			if(splited[i].equals(splited[j]))
//    				ret1[index1++]=1;
//    			else
//    				ret1[index1++]=0;
//    		}
//    	}
//    	for(int i=0; i<length*length; i++) {
//    		if(ret[i]!=ret1[i])
//    			return false;
//    	}
//		return true;
//        
//    }
//}

//class Solution {
//    public ListNode removeElements(ListNode head, int val) {
//    	ListNode pre = new ListNode(0);
//    	pre.next = head;	
//    	ListNode temp = head;
//    	while(temp!=null) {
//    		if(temp.val==val) {
//    			pre.next=temp.next;
//    		}else pre = temp;
//    		temp=temp.next;
//    	}
//		return head;
//        
//    }
//}
//class Solution {
//    public ListNode deleteDuplicates(ListNode head) {
//    	Set<ListNode> set = new HashSet<ListNode>();
//        ListNode temp =head;
//        
//        ListNode sentinel = new ListNode(0);
//
//    	while(temp!=null) {
//    		set.add(temp);
//    		temp=temp.next;
//    	}
//    	 ListNode curr = sentinel.next;
//    	 while (curr!=null && curr.next != null) {
//    	      if (set.contains(curr)) {
//    	    	  sentinel.next = curr;
//    	    	  sentinel.next = sentinel.next.next;
//    	      }
//    	      else
//    	      curr = curr.next;
//    	    }
//		return head;
//        
//    }
//}
public class Solution{
	List<List<Integer>> res = new LinkedList<>();

	/* ������������һ�鲻�ظ������֣��������ǵ�ȫ���� */
	List<List<Integer>> permute(int[] nums) {
	    // ��¼��·����
	    LinkedList<Integer> track = new LinkedList<>();
	    backtrack(nums, track);
	    return res;
	}

	// ·������¼�� track ��
	// ѡ���б�nums �в������� track ����ЩԪ��
	// ����������nums �е�Ԫ��ȫ���� track �г���
	void backtrack(int[] nums, LinkedList<Integer> track) {
	    // ������������
	    if (track.size() == nums.length) {
	        res.add(new LinkedList<Integer>(track));
	        return;
	    }
	    
	    for (int i = 0; i < nums.length; i++) {
	        // �ų����Ϸ���ѡ��
	        if (track.contains(nums[i]))
	            continue;
	        // ��ѡ��
	        track.add(nums[i]);
	        // ������һ�������
	        backtrack(nums, track);
	        // ȡ��ѡ��
	        track.removeLast();
	    }
	}

}