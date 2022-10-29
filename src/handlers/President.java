package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver {
    @Override
    public void approve(int id, double cost, Type type) {

        if (canApprove(cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than President.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(double cost, Type type) {

        if (type == Type.CONSUMABLES && cost <= 1000 && cost > 0) {
            return true;
        } else if (type == Type.CLERICAL && cost <= 2000 && cost > 0) {
            return true;
        } else if (type == Type.GADGETS && cost <= 3000 && cost > 0) {
            return true;
        } else if (type == Type.GAMING && cost <= 5000 && cost > 0) {
            return true;
        } else if (type == Type.PC && cost <= 8000 && cost > 0) {
            return true;
        } else {
            return false;
        }
    }
}
