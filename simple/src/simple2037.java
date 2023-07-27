import java.util.Arrays;

public class simple2037 {
    public static void main(String[] args) {

    }

    public int minMovesToSeat(int[] seats, int[] students){
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for (int i = 0; i < students.length; i++) {
            ans += Math.abs(students[i] - seats[i]);
        }
        return ans;
    }
}
