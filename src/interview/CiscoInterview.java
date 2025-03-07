package interview;

import java.util.Comparator;
import java.util.List;

public class CiscoInterview {
    public int findMeetingRoom(List<List<Integer>> meetingTimings) {
        meetingTimings.sort(Comparator.comparingInt(o -> o.get(0)));
        int meetingRoom = 0;
        for(int i = 0; i < meetingTimings.size(); i++) {
            int startTime = meetingTimings.get(i).get(0);
            int endTime = meetingTimings.get(i).get(1);

            int j = i + 1;
            while(j < meetingTimings.size()) {
                int nextStartTime = meetingTimings.get(j).get(0);
                int nextEndTime = meetingTimings.get(j).get(1);
                if(nextStartTime >= startTime && nextEndTime <= endTime) {
                    meetingRoom++;
                }
                j++;
            }
        }
        return meetingRoom;
    }
}
