package org.rmt2.util.contacts;

import java.util.Comparator;

/**
 * Provides functionality to compare the either the Name, Id, or AccountNo
 * properties of two {@link com.bean.CustomerExt CustomerBean} instances.
 * 
 * 
 * @author RTerrell
 * 
 */
public class CreditorBeanComparator implements Comparator {
    public static final String SORT_NAME = "Name";

    public static final String SORT_ID = "Id";

    public static final String SORT_ACCTNO = "AccountNo";

    private String sortPropName;

    /**
     * Constructs a CreditorBeanComparator object which the default sort
     * property is "Name".
     */
    public CreditorBeanComparator() {
        this.sortPropName = CreditorBeanComparator.SORT_NAME;
        return;
    }

    /**
     * Constructs a CreditorBeanComparator object by assigning the sort
     * property.
     * 
     * @param propName
     *            The name of the column to order by.
     */
    public CreditorBeanComparator(String propName) {
        this.sortPropName = propName;
        return;
    }

    /**
     * Compares two CreditorBean objects based on a specific property.
     * 
     * @param obj1
     *            The target CreditorBean object.
     * @param obj2
     *            The CreditorBean object to compare.
     * @return 0 if the strings are equal or if obj1 and/or obj2 are not
     *         instances of CreditorBean, a negative integer if the target
     *         String is less than the specified String, or a positive integer
     *         if the target String is greater than the specified String
     */
    public int compare(Object obj1, Object obj2) {
        CreditorBean credExt1;
        CreditorBean credExt2;
        if (obj1 instanceof CreditorBean && obj2 instanceof CreditorBean) {
            credExt1 = (CreditorBean) obj1;
            credExt2 = (CreditorBean) obj2;
        }
        else {
            return 0;
        }

        return this.sort(credExt1, credExt2);
    }

    /**
     * Orders <i>cred1</i> and <i>cred2</i> based on the column set forth as
     * either "Name", "Id", or "AccountNo".
     * 
     * @param cred1
     *            The first customer object
     * @param cred2
     *            The second customer object.
     * @return a negative, zero, or a positive integer as <i>cust1</i> argument
     *         is less than, equal to, or greater than <i>cust2</i>,
     *         respectively.
     */
    private int sort(CreditorBean cred1, CreditorBean cred2) {
        if (this.sortPropName.equals(CreditorBeanComparator.SORT_NAME)) {
            return cred1.getName().toLowerCase()
                    .compareTo(cred2.getName().toLowerCase());
        }
        else if (this.sortPropName.equals(CreditorBeanComparator.SORT_ID)) {
            Integer value1 = new Integer(cred1.getCreditorId());
            Integer value2 = new Integer(cred2.getCreditorId());
            return value1.compareTo(value2);
        }
        else if (this.sortPropName.equals(CreditorBeanComparator.SORT_ACCTNO)) {
            return cred1.getAccountNo().toLowerCase()
                    .compareTo(cred2.getAccountNo().toLowerCase());
        }
        return 0;
    }
}
