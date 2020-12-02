package com.gfkl.adventofcode;

import com.gfkl.adventofcode.policy.Policy;
import com.gfkl.adventofcode.policy.PositionsPolicy;
import com.gfkl.adventofcode.policy.RangePolicy;

import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

public class PasswordValidator {

    public static final String PASSWORD_DELIMITER = ":";

    private Policy  policy;
    private String  password;

    public static PasswordValidator createRangePassword(String password) {
        return new PasswordValidator(password, RangePolicy.class);
    }

    public static PasswordValidator createPositionsPassword(String password) {
        return new PasswordValidator(password, PositionsPolicy.class);
    }

    public boolean isValid() {
        return this.policy.isValid(this.password);
    }

    private PasswordValidator(String password, Class<? extends Policy> policyClass) {
        this.password = getPassword(password);
        try {
            this.policy = policyFactoryBuilder(getPolicy(password), policyClass);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            e.printStackTrace();
        }
    }

    private Policy policyFactoryBuilder(String policy, Class<? extends Policy> policyClass) throws InstantiationException, IllegalAccessException, InvocationTargetException, NoSuchMethodException {
        return policyClass.getConstructor(String.class).newInstance(policy);
    }

    private String getPassword(String password) {
        return password.split(PASSWORD_DELIMITER)[1].trim();
    }

    private String getPolicy(String password) {
        return password.split(PASSWORD_DELIMITER)[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PasswordValidator passwordValidator = (PasswordValidator) o;
        return Objects.equals(policy, passwordValidator.policy) &&
                Objects.equals(password, passwordValidator.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(policy, password);
    }

    @Override
    public String toString() {
        return "Password{" +
                "policy=" + policy +
                ", value='" + password + '\'' +
                '}';
    }
}
