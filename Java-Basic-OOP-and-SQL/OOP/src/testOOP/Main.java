package testOOP;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Block block = new Block(8, 2, 300);
        Block block2 = new Block(-2,8,200);

        List<Block> blocks = new ArrayList<>();
        blocks.add(block);
        blocks.add(block2);
        for (int i = 0; i < blocks.size()-1; i++) {

            if (blocks.get(i).getFloor()<blocks.get(i+1).getFloor()){

                System.out.println("block2 > block");
            }
            else {

                System.out.println("block2 < block");
            }
        }
        System.out.println(blocks);

    }
}
