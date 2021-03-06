package org.samovich.cop2800.chapter12.assignment;

/*
 * AUTHOR:	R Grant
 * DATE:	3/2014
 * Updated: Valery Samovich on 7/10/2016
 */
public class SubcontractedPart extends ManufacturedPart {
    private String processDescription;
    private double subcontractCost;
    public static final String DEFAULT_PROCESS_DESCRIPTION = "no process description";

    public SubcontractedPart() throws InvalidProductionArgumentException     // <--------------------- New constructor added
    {
        this(0, DEFAULT_PROCESS_DESCRIPTION, 0);
    }

    public SubcontractedPart(int id) throws InvalidProductionArgumentException     //create minimal object
    {
        this(id, DEFAULT_PROCESS_DESCRIPTION, 0);
    }

    public SubcontractedPart(int id, String processDesc, double sCost) throws InvalidProductionArgumentException {
        super(id, 0, 0);  //call ManufacturedPart ctor
        this.setProcessDescription(processDesc);
        this.setSubcontractCost(sCost);
    }

    //object with sub, mfg, and part object info
    public SubcontractedPart(int id, String partDesc, double sellPrice,   //for Part object
                             double lCost, double mCost,  //for ManufacturedCost object
                             String processDesc, double sCost) throws InvalidProductionArgumentException  //for SubcontractedPArt object
    {
        super(id,  //for Part
                partDesc, //
                sellPrice, //part price
                lCost, //description for part
                mCost);   //selling price of part
        this.setProcessDescription(processDesc);
        this.setSubcontractCost(sCost);
    }

    public double getProductCost()    // <--------------------- New method added
    {
        return super.getProductCost() + subcontractCost;
    }

    public String getProcessDescription() {
        return processDescription;
    }

    public void setProcessDescription(String newProcessDescription) throws NullPointerException{
        if (newProcessDescription.isEmpty())
            throw new NullPointerException("The process description was invalid");
        else
            processDescription = newProcessDescription;
    }

    public double getSubcontractCost() {
        return subcontractCost;
    }

    public void setSubcontractCost(double newSubcontractCost) throws InvalidProductionArgumentException{
        if(subcontractCost >= 0)
            subcontractCost = newSubcontractCost;
        else
            throw new InvalidProductionArgumentException("The subcontract cost was invalid");
    }

    public String toString() {
        return super.toString() + "\n" +
                "\tProcess Description: " + this.getProcessDescription() + "\n" +
                "\tSubcontract Cost: " + this.getSubcontractCost();
    }
}
