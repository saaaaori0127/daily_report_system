package constants;

public enum AttributeConst {
    FLUSH("flush"),

    MAX_ROW("maxRow"),
    PAGE("page"),

    TOKEN("_token"),
    ERR("errors"),

    LOGIN_EMP("login_employee"),

    LOGIN_ERR("loginError"),

    EMPLOYEE("employee"),
    EMPLOYEES("employees"),
    EMP_COUNT("employees_count"),
    EMP_ID("id"),
    EMP_CODE("code"),
    EMP_PASS("password"),
    EMP_NAME("name"),
    EMP_ADMIN_FLG("admin_flag"),

    ROLE_FLAGADMIN(1),
    ROLE_GENERAL(0),

    DEL_FLAG_TRUE(1),
    DEL_GLAG_FALSE(0),

    REPORT("report"),
    REPORTS("reports"),
    REP_COUNT("reports_count"),
    REP_ID("id"),
    REP_DATE("report_date"),
    REP_TITLE("title"),
    REP_CONTENT("content");

    private final String text;
    private final Integer i;

    private AttributeConst(final String text) {
        this.text = text;
        this.i = null;
    }

    private AttributeConst(final Integer i) {
        this.text = null;
        this.i = i;
    }

    public String getVAlue() {
        return this.text;
    }

    public Integer getIntegerValue() {
        return this.i;
    }
}
