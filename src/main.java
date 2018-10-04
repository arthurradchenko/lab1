public class main {
    public static void main (String[] args){
        Solution solution = new Solution();
        solution.array = new int [5][5];
        solution.array = solution.random(solution.array);
        System.out.println("Radchenko A.V. Variant #12");
        System.out.println("Manual matrix:"+ '\n');
        solution.out(solution.array);
        System.out.println("New matrix:"+'\n');
        solution.out(solution.solve(solution.array));
    }
}
