package General;

public enum GovType {
    MONARCHY(1),
    REPUBLIC(2),
    THEOCRACY(3),
    TRIBAL_GOVERNMENT(4);


    private final int intGovTypeCode;

    GovType(int intGovTypeCode) {
        this.intGovTypeCode = intGovTypeCode;
    }

    public int getIntGovTypeCode() {
        return intGovTypeCode;
    }
}
