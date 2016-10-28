package am.aca.ITFinder.repository.implementation;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.User;
import am.aca.ITFinder.repository.interfaces.UserRepository;

import java.sql.*;

import static am.aca.ITFinder.comman.util.MyUtil.*;

/**
 * Created by Armen on 10/18/2016.
 */
public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl instance;

    public static UserRepositoryImpl getInstance(){
        if(instance==null){
            loadProperties();
            instance = new UserRepositoryImpl();
        }
        return instance;
    }


    @Override
    public void addUser(User user) throws MyException, SQLException {
        Statement statement = null;
        try {
            Connection connection = DriverManager.getConnection(URL, PASSWORD, LOGIN);
            statement = (Statement) connection.createStatement();
            String line = "insert into user " + "(username,password)" +
                    "values ( '" + "','" + "')";
            statement.executeUpdate(line);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void editUser(Integer id) throws MyException, SQLException {

    }

    @Override
    public void deleteUser(Integer id) throws MyException, SQLException {

    }

    @Override
    public void getUser(Integer id) throws MyException, SQLException {

    }
}

