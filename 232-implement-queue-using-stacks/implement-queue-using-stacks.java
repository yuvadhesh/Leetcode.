class MyQueue{
    int[] s1=new int[1000];
    int[] s2=new int[1000];
    int top1=-1;
    int top2=-1;
    public void push(int x){
        s1[++top1]=x;
    }
    public int pop(){
        if(top2==-1){
            while(top1!=-1){
                s2[++top2]=s1[top1--];
            }
        }
        return s2[top2--];
    }
    public int peek(){
        if(top2==-1){
            while(top1!=-1){
                s2[++top2]=s1[top1--];
            }
        }
        return s2[top2];
    }
    public boolean empty(){
        return top1==-1&&top2==-1;
    }
}