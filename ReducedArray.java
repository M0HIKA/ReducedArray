import java.util.*;
public class ReducedArray
{
	public static void main(String[] args) {
   	 Scanner sc=new Scanner(System.in);
   	 System.out.println("Enter the length of array ");  
   	 int arrLength=sc.nextInt();
   	 int firstArr[]=new int[arrLength];
   	 for(int index=0;index<arrLength;index++)
   	 {
   		 firstArr[index]=sc.nextInt();
   	 }
   	 ReducedArray ob=new ReducedArray();
   	 int secondArr[]=firstArr.clone();         //Creating copy of original array
   	 int arrayAfterSorting[]=ob.sortArray(secondArr,arrLength);
   	 int finalArray[]=ob.findingOrderOfElements(firstArr,arrayAfterSorting,arrLength);
   	 for(int index=0;index<arrLength;index++)
   	 {
   		 System.out.print(finalArray[index]+" ");
   	 }
	}
   	 int[] sortArray(int secondArr[],int arrLength)
   	 {
   		 for(int firstIndex=0;firstIndex<arrLength;firstIndex++)
   		 {
       		 for(int secondIndex=0;secondIndex<arrLength-firstIndex-1;secondIndex++)
       		 {
       		 	if(secondArr[secondIndex]>secondArr[secondIndex+1]){
          		 int tempVar= secondArr[secondIndex];
            		 secondArr[secondIndex] = secondArr[secondIndex+ 1];
           		 secondArr[secondIndex + 1] = tempVar;
       		 }
       		 }
   		 }
    	   		 return secondArr;
   	 }
   	 int[] findingOrderOfElements(int firstArr[],int arrayAfterSorting[],int arrLength)
   	 {
   		 for(int firstIndex=0;firstIndex<arrLength;firstIndex++)
   		 {
       		 for(int secondIndex=0;secondIndex<arrLength;secondIndex++)
       		 {
           		 if(firstArr[firstIndex]==arrayAfterSorting[secondIndex])
           		 {
               		 firstArr[firstIndex]=secondIndex;
               		 break;
           		 }
       		 }
   		 }
   	 
   		 return firstArr;
      		 
   	 }
  	 
  	 
	}
