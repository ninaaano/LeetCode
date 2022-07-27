class Solution {
    public void duplicateZeros(int[] arr) {
        //고정 길이 정수 배열이 주어지면 arr0이 발생할 때마다 복제하고 나머지 요소를 오른쪽으로 이동합니다. 원래 배열의 길이를 초과하는 요소는 기록되지 않습니다. 위의 수정 사항을 입력 배열에 적용하고 아무 것도 반환하지 않습니다.
        
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                for(int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
                i++;
            } 
        }
        
    }
}