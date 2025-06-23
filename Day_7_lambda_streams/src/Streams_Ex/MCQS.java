package Streams_Ex;

public class MCQS {
	/*public static double compute(double base, Function<Integer, Integer > func){
    return func.apply((int)base);
}*/
	/*public static double compute(double base, Function<Integer, Double> func){
    return func.apply((int)base);
}*/
	/*public static double compute(double base, Function<Double, Integer> func){
    return func.apply(base);
}*/
	
	/*public static double compute(double base, Function<Double, Double> func){
    return func.apply(base);
}*/
	public static double compute(double base, Function<Integer, Double> func){
    return func.apply(base);
}
public static void main(String[] args) {
	
    double principle = 100;
    int interestrate = 5;
    double amount = compute(principle, x->x*interestrate);
    System.out.println(amount);
}
