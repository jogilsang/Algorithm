

![image](https://user-images.githubusercontent.com/20831981/144612408-00c3c7ab-35dc-4caf-b8c4-dd71604f999e.png)


```c
#include <stdlib.h>
#include <stdio.h>
#include <time.h>

int main()
{
    // 1. 게임안내
    printf("가위바위보 게임을 진행합니다.\n");
    
    // 2. 사용자 입력
    printf("({가위(1),바위(2),보(3)}) 중 하나를 선택해주세요.\n");
    
    int userInput;
    scanf("%d", &userInput);
    
    // 3. 컴퓨터 입력
    srand(time(NULL));
    int computerInput;
    computerInput = rand() % 3 + 1;
    
    // 4. 승부확인
    int isWon; // 0 : 패배, 1 : 승리, 2 : 무승부
    
    // 사용자의 선택
    switch(userInput) {
        // 사용자가 가위를 낸경우
        case 1 :
        printf("사용자는 가위를 냈습니다.\n");
                // 컴퓨터와 비교한다
                switch(computerInput) {
                    // 컴퓨터도 가위면 무승부
                    case 1 :
                    printf("컴퓨터는 가위를 냈습니다.\n");
                    isWon = 2;
                    // 컴퓨터도 바위면 패배
                        break;
                        
                    case 2 :
                    printf("컴퓨터는 바위를 냈습니다.\n");
                    isWon = 0;
                        break;
                    // 컴퓨터가 보를 내면 승리
                    
                    case 3 :
                    printf("컴퓨터는 보를 냈습니다.\n");
                    isWon = 1;
                        break;
                }
            break;
        // 사용자가 바위를 낸경우
        case 2 :
        printf("사용자는 바위를 냈습니다.\n");
                // 컴퓨터와 비교한다
                switch(computerInput) {

                    case 1 :
                        printf("컴퓨터는 가위를 냈습니다.\n");
                        isWon = 1;
                        break;
                    case 2 :
                        printf("컴퓨터는 바위를 냈습니다.\n");
                        isWon = 2;
                        break;
 
                    case 3 :
                        printf("컴퓨터는 보를 냈습니다.\n");
                        isWon = 0;
                        break;
                }
            break;
        // 사용자가 보를 낸경우
        case 3 : 
                // 컴퓨터와 비교한다
                switch(computerInput) {

                    case 1 :
                        printf("컴퓨터는 가위를 냈습니다.\n");
                        isWon = 0;
                        break;
                        
                    case 2 :
                        printf("컴퓨터는 바위를 냈습니다.\n");
                        isWon = 1;
                        break;

                    case 3 :
                        printf("컴퓨터는 보를 냈습니다.\n");
                        isWon = 2;
                        break;
                }
        
                printf("사용자는 보를 냈습니다.\n");
                break;
    }
    
    if(isWon == 2) {
        printf("사용자와 컴퓨터는 비겼습니다\n");
    }else if(isWon == 1){
        printf("사용자가 이겼습니다.\n");
    }else {
        printf("사용자가 패배했습니다.\n");
    }

    return 0;
}
```
