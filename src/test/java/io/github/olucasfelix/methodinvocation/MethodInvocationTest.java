package io.github.olucasfelix.methodinvocation;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class MethodInvocationTest {

    @Test
    void shouldInvokeMethodOnDifferentObjects() {

        var user = new User();
        var product = new Product();

        var userName = "Gregor Samsa";
        AttributeSetter.setObjectName(user, userName);

        var productName = "The Metamorphosis";
        AttributeSetter.setObjectName(product, productName);

        assertThat(user.name).isEqualTo(userName);
        assertThat(product.name).isEqualTo(productName);
    }
}
