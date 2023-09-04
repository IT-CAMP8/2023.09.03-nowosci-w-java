package pl.camp.it.java12;

public class Switch {
    public static void main(String[] args) {
        int i = 4;
        /*switch(i) {
            case 1:
            case 2:
                System.out.println("1 albo 2");
                break;
            case 3:
                System.out.println("3");
                break;
            case 4:
                System.out.println("4");
                break;
            default:
                System.out.println("cos innego !!!");
        }*/

        switch(i) {
            case 1,2 -> System.out.println("1 albo 2");
            case 3 -> System.out.println("3");
            case 4 -> {
                System.out.println("4");
                System.out.println("cos jeszcze !!!");
            }
        }

        System.out.println(switch(i) {
            case 1,2 -> "1 albo 2";
            case 3 -> "3";
            case 4 -> "4";
            default -> "cos innego !!!";
        });
    }
}
