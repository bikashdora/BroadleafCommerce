package org.broadleafcommerce.checkout.service;

import java.util.Map;

import org.broadleafcommerce.checkout.service.exception.CheckoutException;
import org.broadleafcommerce.checkout.service.workflow.CheckoutResponse;
import org.broadleafcommerce.order.domain.Order;
import org.broadleafcommerce.order.domain.PaymentInfo;
import org.broadleafcommerce.payment.domain.Referenced;

public interface CheckoutService {

    public CheckoutResponse performCheckout(Order order) throws CheckoutException;

    public CheckoutResponse performCheckout(Order order, Map<PaymentInfo, Referenced> payments) throws CheckoutException;

}
