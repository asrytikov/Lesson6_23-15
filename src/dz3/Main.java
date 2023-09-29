public class Main {
    public static void main(String[] args) {

        int[] mas = new int[50];

        for (int i =0; i< mas.length; i++){
            mas[i] = (int)(Math.random()*100 - 50);
        }

        for(int item : mas){
            System.out.print(item + " ");
        }

        int positiv = 0;
        int negativ = 0;
        int zero = 0;

        for (int item: mas) {
            if (item>0){
                positiv++;
            }else if (item<0){
                negativ++;
            }else{
                zero++;
            }
        }
        System.out.println("Info");
        System.out.println("+: " + positiv);
        System.out.println("-: " + negativ);
        System.out.println("0 :" +  zero);





    }
}