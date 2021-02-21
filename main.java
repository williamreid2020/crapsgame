/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;

/**
 *
 * @author rreid2
 */
public class main {

    public static int diceRoll() {
        int rand = 0;
        for (int i = 0; i < 6; i++) {
            rand = (int) (Math.random() * 6) + 1;
        }
        return rand;
    }

    public static void main(String[] args) {
        int i = 1;
        int wins = 0;
        int loses = 0;
        boolean win = true;

        for (i = 1; i <= 100000; i++) {
            int die1 = diceRoll();
            int die2 = diceRoll();
            int dieTotal = (die1 + die2);
            if (i <= 10) {
                System.out.println("Round " + i + " , Roll 1 -- Die1: " + die1 + " , Die2: " + die2 + " -- Total: " + dieTotal);
            }
            switch (dieTotal) {
                case 2:
                    if (i <= 10) {
                        System.out.println("LOSS!");
                    }
                    loses++;
                    break;

                case 3:
                    if (i <= 10) {
                        System.out.println("LOSS!");
                    }
                    loses++;
                    break;
                case 4:
                    win = pointWin(dieTotal, i);

                    if (win == true) {
                        if (i <= 10) {
                            System.out.println("WIN!");
                        }
                        wins++;
                    } else if (win == false) {
                        if (i <= 10) {
                            System.out.println("LOSS!");
                        }
                        loses++;
                    }
                    break;

                case 5:
                    win = pointWin(dieTotal, i);

                    if (win == true) {
                        if (i <= 10) {
                            System.out.println("WIN!");
                        }
                        wins++;
                    } else if (win == false) {
                        if (i <= 10) {
                            System.out.println("LOSS!");
                        }
                        loses++;
                    }
                    break;
                case 6:
                    win = pointWin(dieTotal, i);

                    if (win == true) {
                        if (i <= 10) {
                            System.out.println("WIN!");
                        }
                        wins++;
                    } else if (win == false) {
                        if (i <= 10) {
                            System.out.println("LOSS!");
                        }
                        loses++;
                    }
                    break;

                case 7:
                    if (i <= 10) {
                        System.out.println("WIN!");
                    }
                    wins++;
                    break;
                case 8:
                    win = pointWin(dieTotal, i);

                    if (win == true) {
                        if (i <= 10) {
                            System.out.println("WIN!");
                        }
                        wins++;
                    } else if (win == false) {
                        if (i <= 10) {
                            System.out.println("LOSS!");
                        }
                        loses++;
                    }
                    break;

                case 9:
                    win = pointWin(dieTotal, i);

                    if (win == true) {
                        if (i <= 10) {
                            System.out.println("WIN!");
                        }
                        wins++;
                    } else if (win == false) {
                        if (i <= 10) {
                            System.out.println("LOSS!");
                        }
                        loses++;
                    }
                    break;
                case 10:
                    win = pointWin(dieTotal, i);

                    if (win == true) {
                        if (i <= 10) {
                            System.out.println("WIN!");
                        }
                        wins++;
                    } else if (win == false) {
                        if (i <= 10) {
                            System.out.println("LOSS!");
                        }
                        loses++;
                    }
                    break;

                case 11:
                    if (i <= 10) {
                        System.out.println("WIN!");
                    }
                    wins++;
                    break;
                case 12:
                    if (i <= 10) {
                        System.out.println("LOSS!");
                    }
                    loses++;
                    break;
            }
            if (i <= 10) {
                System.out.println(wins + " wins(s) , " + loses + " loss(es)");
            }
        }
        System.out.println("");
        System.out.println("OVERALL:"); // prints overall score
        System.out.println(wins + " wins(s) , " + loses + " loss(es)");
        
    }

    public static boolean pointWin(int point, int i) {
        if (i <= 10) {
            System.out.println("Point is " + point);
        }
        for (int j = 2; j > 0; j++) {

            int die1 = diceRoll();
            int die2 = diceRoll();
            int dieTotal = (die1 + die2);
            if (i <= 10) {
                System.out.println("Round " + i + " , Roll " + j + " -- Die1: " + die1 + " , Die2: " + die2 + " -- Total: " + dieTotal);
            }
            if (dieTotal == 7) {
                return false;
            } else if (dieTotal == point) {
                return true;
            }

        }
        return true; // will never get reached
    }

}
