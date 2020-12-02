package com.gfkl.adventofcode;

import java.util.Objects;

public class Password {

    private PasswordPolicy  policy;
    private String          value;

    public Password(PasswordPolicy policy, String value) {
        this.policy = policy;
        this.value = value;
    }

    public Password(String password) {
        String[] policyAndPassword = password.split(":");
        this.policy = new PasswordPolicy(policyAndPassword[0]);
        this.value = policyAndPassword[1].trim();
    }

    public boolean isValid() {
        return this.policy.isValid(this.value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Password password = (Password) o;
        return Objects.equals(policy, password.policy) &&
                Objects.equals(value, password.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, value);
    }

    @Override
    public String toString() {
        return "Password{" +
                "policy=" + policy +
                ", value='" + value + '\'' +
                '}';
    }
}
