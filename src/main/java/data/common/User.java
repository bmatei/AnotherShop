package data.common;

import data.common.AuthenticationData;
import data.financial.Account;

public class User {
    protected String name;
    protected AuthenticationData data;
    protected Account wallet;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public AuthenticationData getData() { return data; }
    public void setData(AuthenticationData data) { this.data = data; }
}