package lesson24.exercise;

import java.util.Arrays;

/**
 * Created by Паша on 05.07.2018.
 */
public class Demo {
    public static void main(String[] args) {
        GeneralDAO<Sys> systemDAO = new GeneralDAO<>();
        Sys system1 = new Sys(11, "...");
        systemDAO.save(system1);

        System.out.println(Arrays.deepToString(systemDAO.getALL()));

        systemDAO.save(system1);
        System.out.println(Arrays.deepToString(systemDAO.getALL()));

        GeneralDAO<Tool> toolDAO = new GeneralDAO<>();
        Tool tool1 = new Tool("rewrw", "fsdfs");
        toolDAO.save(tool1);
        System.out.println(Arrays.deepToString(toolDAO.getALL()));

        GeneralDAO<Order> orderDAO = new GeneralDAO<>();

    }
}
