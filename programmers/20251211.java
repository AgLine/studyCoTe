// https://school.programmers.co.kr/learn/courses/30/lessons/42840

import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int [][] person = {
            {1, 2, 3, 4, 5},
            {2, 1, 2, 3, 2, 4, 2, 5},
            {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] cnt = new int[3];

        for(int i = 0; i < answers.length; i++){//입력받는값
            for(int j=0; j < person.length; j++){//수포자들입력
                if(answers[i] == person[j][i % person[j].length]){
                    cnt[j]++;
                }
            }
        }

        //출력테스트
        /*
        for(int a: cnt){
            System.out.println(a);
        }
        */
        int max = Arrays.stream(cnt)
                        .max()
                        .getAsInt();
        //최대값 출력 확인
        //System.out.println(max);

        //ArrayList에 넣은후 배열로 변환
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < cnt.length; i++){
            if(cnt[i] == max){
                list.add(i + 1);
            }
        }

        int[] answer = new int[list.size()];

        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}
