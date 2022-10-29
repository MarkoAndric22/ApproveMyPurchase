package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove( double cost, Type type) {

        if (type == Type.CONSUMABLES && cost <= 500 && cost > 0) {
            return true;
        } else if (type == Type.CLERICAL && cost <= 1000 && cost > 0) {
            return true;
        } else if (type == Type.GADGETS && cost <= 1500 && cost > 0) {
            return true;
        } else if (type == Type.GAMING && cost <= 3500 && cost > 0) {
            return true;
        } else if (type == Type.PC && cost <= 6000 && cost > 0) {
            return true;
        } else {
            return false;
        }
    }
}
