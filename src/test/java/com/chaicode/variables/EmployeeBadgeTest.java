package com.chaicode.variables;

import com.chaicode.variables.model.EmployeeProfile;
import com.chaicode.variables.model.ProductItem;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Variables - Employee Badge")
class EmployeeBadgeTest {

    @Test
    void managerBadge() {
        var profile = new EmployeeProfile("Priya Sharma", 42, "Engineering", true);
        assertEquals("[ID-00042] Priya Sharma | Engineering | MANAGER",
                EmployeeBadge.formatBadge(profile));
    }

    @Test
    void staffBadge() {
        var profile = new EmployeeProfile("Alex Kim", 7, "Sales", false);
        assertEquals("[ID-00007] Alex Kim | Sales | STAFF",
                EmployeeBadge.formatBadge(profile));
    }

    @Test
    void largeIdPadding() {
        var profile = new EmployeeProfile("Sam Lee", 10000, "HR", false);
        assertEquals("[ID-10000] Sam Lee | HR | STAFF",
                EmployeeBadge.formatBadge(profile));
    }
}
