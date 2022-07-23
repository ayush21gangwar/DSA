    

class Solution
{
    int thirdLargest(int a[], int n)
    {
	    // Your code here
	    Arrays.sort(a);
	    ArrayList<Integer> alist= new ArrayList<>();
	    for(int i=0; i<a.length;i++){
	    if(!alist.contains(a[i])){
	        alist.add(a[i]);
	    }
	    }
	    if(alist.size()<=2){
	        return -1;
	    }
	    else if(alist.size()==3){
	        return alist.get(2);
	    }
	    return alist.get(alist.size()-3);
	    
    }
}
