import common.Type;
import handlers.*;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, -75, Type.CONSUMABLES);
        System.out.println("------------------------------------");
        manager.approve(2, 290, Type.CONSUMABLES);
        System.out.println("------------------------------------");
        manager.approve(3, 450, Type.CONSUMABLES);
        System.out.println("------------------------------------");
        manager.approve(4, 550, Type.CONSUMABLES);
        System.out.println("------------------------------------");
        manager.approve(5, 1000, Type.CONSUMABLES);
        System.out.println("------------------------------------");
        System.out.println("....................................");
        manager.approve(6, 0, Type.CLERICAL);
        System.out.println("------------------------------------");
        manager.approve(7, 330, Type.CLERICAL);
        System.out.println("------------------------------------");
        manager.approve(8, 550, Type.CLERICAL);
        System.out.println("------------------------------------");
        manager.approve(9, 1500, Type.CLERICAL);
        System.out.println("------------------------------------");
        manager.approve(10, 2000, Type.CLERICAL);
        System.out.println("------------------------------------");
        System.out.println("....................................");
        manager.approve(11, -1, Type.GADGETS);
        System.out.println("------------------------------------");
        manager.approve(12, 930, Type.GADGETS);
        System.out.println("------------------------------------");
        manager.approve(13, 1400, Type.GADGETS);
        System.out.println("------------------------------------");
        manager.approve(14, 2000, Type.GADGETS);
        System.out.println("------------------------------------");
        manager.approve(15, 3000, Type.GADGETS);
        System.out.println("------------------------------------");
        System.out.println("....................................");
        manager.approve(16,0,Type.GAMING);
        System.out.println("------------------------------------");
        manager.approve(17,2600,Type.GAMING);
        System.out.println("------------------------------------");
        manager.approve(18,3500,Type.GAMING);
        System.out.println("------------------------------------");
        manager.approve(19,4200,Type.GAMING);
        System.out.println("--------------------------------------");
        manager.approve(20,4900,Type.GAMING);
        System.out.println("--------------------------------------");
        System.out.println("....................................");
        manager.approve(21, -22, Type.PC);
        System.out.println("------------------------------------");
        manager.approve(22, 5000, Type.PC);
        System.out.println("------------------------------------");
        manager.approve(23, 6000, Type.PC);
        System.out.println("------------------------------------");
        manager.approve(24, 6500, Type.PC);
        System.out.println("------------------------------------");
        manager.approve(25, 8000, Type.PC);
        System.out.println("------------------------------------");
        manager.approve(26, 10000, Type.PC);
        System.out.println("------------------------------------");
    }
}
