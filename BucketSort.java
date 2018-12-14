1. 遍历自己的数组确定长度（a数组的那个最大值）
2.桶状排序（搞一个b 从  0 开始 到最大值结束）
3.往b里放值，先遍历a。赋值，循环 每过一次 b下标（a的值）+1
4.输出b里不为0的
a b
    int b = a[0];
    for( int i = 0;i<a.length()-1;i++){
        if(a[i+1] > a[i]){
          b = a[i+1];
        }
    }
    int[] c = new Integar(b.length()+1);   456456
    for( int i = 0;i<a.length();i++){
        int f = a[i];
        c[f] += 1;
    }
    for(int i = 0;i<a.length();i++){
        if(c[i]!=0){
          System.out.print(i);
        }
   
