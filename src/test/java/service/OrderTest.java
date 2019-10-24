package service;

import com.os.entity.Order;
import com.os.factory.DaoFactory;
import com.os.persistance.interfaces.OrderDao;
import com.os.service.impl.OrderServiceImpl;
import org.junit.Test;

import java.util.List;

public class OrderTest {
    private DaoFactory daoFactory = DaoFactory.getInstance();
    private OrderDao orderDao = daoFactory.createOrderDao();
    private OrderServiceImpl orderService = new OrderServiceImpl();

    @Test
    public void getAll(){
        List<Order> orders = orderService.getAllOrders();
        System.out.println(orders);
    }
}
