package dao;

import entity.UserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.SessionFactoryConfiguration;

public class UserDao {
    private javax.swing.JOptionPane JOptionPane;

    /////////////////////////  User CRUD Operations   ////////////////////////////////
    public void userCreateAcount(UserEntity entity) {


        Transaction transaction=null;
    try(Session session= SessionFactoryConfiguration.getInstance().getSession())
    {
        transaction= session.beginTransaction();
        session.save(entity);
        transaction.commit();
    }catch (Exception e){
        if (transaction!=null){
            transaction.rollback();
        }
      }
    }

    public UserEntity searchUser(int id) {
        Transaction transaction=null;
        UserEntity user=null;
        try(Session session=SessionFactoryConfiguration.getInstance().getSession()){
            transaction= session.beginTransaction();
            user=session.get(UserEntity.class,id);
            transaction.commit();
        }catch (Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
        }
        return user;
    }

    public UserEntity deleteUser(int id) {
        Transaction transaction=null;
        UserEntity userEntity=null;
        try(Session session=SessionFactoryConfiguration.getInstance().getSession()){
            transaction=session.beginTransaction();
            userEntity=session.get(UserEntity.class,id);
            session.delete(userEntity);
            transaction.commit();
            JOptionPane.showMessageDialog(null,"Success Delete");
        }catch (Exception e){
            transaction.rollback();
            JOptionPane.showMessageDialog(null,"Error");
        }
        return userEntity;
    }

    public UserEntity searchButtonUser(int id) {
        Transaction transaction=null;
        UserEntity entity=null;
        try (Session session=SessionFactoryConfiguration.getInstance().getSession()){
            transaction= session.beginTransaction();
            entity=session.get(UserEntity.class,id);
            transaction.commit();
        }catch (Exception e){
            if (transaction!=null){
                transaction.rollback();
            }
        }
        return entity;
    }
}
