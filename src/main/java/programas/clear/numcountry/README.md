# 문제 설명
124 나라가 있습니다. 124 나라에서는 10진법이 아닌 다음과 같은 자신들만의 규칙으로 수를 표현합니다.

1. 124 나라에는 자연수만 존재합니다.
2. 124 나라에는 모든 수를 표현할 때 1, 2, 4만 사용합니다.


예를 들어서 124 나라에서 사용하는 숫자는 다음과 같이 변환됩니다.


|  <center>10 진법</center> |  <center>124 나라</center> |  <center> 10 진법</center> |  <center>124 나라</center> |
|:--------:|:--------:|:--------:|:--------:|
|<center>1 </center> | <center> 1 </center> | <center> 10 </center>| <center>14</center>|
|<center>2 </center> | <center> 2 </center> | <center> 11 </center>| <center>21</center>|
|<center>3 </center> | <center> 4 </center> | <center> 12 </center>| <center>22</center>|
|<center>4 </center> | <center> 11 </center> | <center> 13 </center>| <center>24</center>|
|<center>5 </center> | <center> 12 </center> | <center> 14 </center>| <center>41</center>|


자연수 n이 매개변수로 주어질 때, n을 124 나라에서 사용하는 숫자로 바꾼 값을 return 하도록 solution 함수를 완성해 주세요.

## 제한사항
n은 500,000,000이하의 자연수 입니다.
