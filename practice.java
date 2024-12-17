class Armstrong{
  public static void main(String[] args){
    int sumofcubes =0,a,temp;
    int num = 153;
    temp = num;
    while(num > 0){
      a = num %10;
      num = num/10;
      sumofcubes = sumofcubes+ (a*a*a);
    }
    if(sumofcubes == num){
      System.out.println("armstrong number");
    }
    else{
      System.out.println("not a armstrong number");
    }
  }
}
