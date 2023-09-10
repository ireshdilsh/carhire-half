package dao;

import entity.CustomerEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryConfiguration;

public class CustomerDao {
    public void customerRegister(CustomerEntity entity) {
        Transaction transaction=null;
        try (Session session= SessionFactoryConfiguration.getInstance().getSession())
        {
            transaction=session.beginTransaction();
            session.save(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction!=null){transaction.rollback();}
        }
    }

    public CustomerEntity customerDelete(int id) {
        Transaction transaction=null;
        CustomerEntity entity=null;
        try (Session session=SessionFactoryConfiguration.getInstance().getSession()){
            transaction=session.beginTransaction();
            entity=session.get(CustomerEntity.class,id);
            session.delete(entity);
            transaction.commit();
        }catch (Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
        }
        return entity;
    }

    public CustomerEntity searchCustomer(int id) {
        Transaction transaction=null;
        CustomerEntity entity=null;
        try (Session session=SessionFactoryConfiguration.getInstance().getSession()){
            transaction=session.beginTransaction();
            entity=session.get(CustomerEntity.class,id);
            transaction.commit();
        }catch (Exception e){
            if (transaction!=null){transaction.rollback();
            }
        }
        return entity;
    }

}
