package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {

        if (canApprove(cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Vice President.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {

        if (type == Type.CONSUMABLES && cost <= 700 && cost > 0) {
            return true;
        } else if (type == Type.CLERICAL && cost <= 1500 && cost > 0) {
            return true;
        } else if (type == Type.GADGETS && cost <= 2000 && cost > 0) {
            return true;
        } else if (type == Type.GAMING && cost <= 4500 && cost > 0) {
            return true;
        } else if (type == Type.PC && cost <= 6500 && cost > 0) {
            return true;
        } else {
            return false;
        }
    }
}
