class Solution {
    public int findSpecialInteger(int[] arr) {
        int n= arr.length;
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!hm.containsKey(arr[i])){hm.put(arr[i],1);}
            else{hm.put(arr[i],hm.get(arr[i])+1);}
        }
            System.out.println(hm);

        int threshold = n/4;
        System.out.println(threshold);
        for(int i=0;i<n;i++){
            if(hm.get(arr[i])>threshold){return arr[i];}
        }
        return -1;
    }
}