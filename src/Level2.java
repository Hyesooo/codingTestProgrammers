import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Level2 {
    public int[] progresses() {
        List<Integer> answer = new ArrayList<>();

        int[] progresses = {95, 95, 99, 99, 80, 77, 88, 90};
        int[] speeds = {1, 1, 1, 1, 1, 1,1,2};

        List<Integer> progressesList = Arrays.stream(progresses).boxed().collect(Collectors.toList());
        List<Integer> speedsList = Arrays.stream(speeds).boxed().collect(Collectors.toList());

        while(!progressesList.isEmpty()) {
            for(int i=progressesList.size()-1 ; i>=0; i--){
                int tmp = progressesList.get(i) + speedsList.get(i);
                progressesList.set(i, tmp);
                if(i == 0 && tmp >= 100) {
                    int deployeeCnt = 0;
                    List<Integer> tmpList = new ArrayList<>();
                    tmpList.addAll(progressesList);
                    for (int j=0; j<tmpList.size(); j++) {
                        if(tmpList.get(j) >= 100){
                            deployeeCnt++;
                            tmpList.remove(j);
                        }else { break; }
                    }
                    answer.add(deployeeCnt);
                }
            }
        }
        for (Integer integer : answer) {
            System.out.println(integer);
        }

        return answer.stream().mapToInt(i->i).toArray();
    }
}
