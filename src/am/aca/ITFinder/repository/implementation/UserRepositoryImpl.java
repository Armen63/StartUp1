package am.aca.ITFinder.repository.implementation;

import am.aca.ITFinder.comman.exception.MyException;
import am.aca.ITFinder.comman.model.User;
import am.aca.ITFinder.repository.interfaces.UserRepository;

import java.sql.*;
import java.util.Random;

import static am.aca.ITFinder.comman.util.MyUtil.*;

/**
 * Created by Armen on 10/18/2016.
 */
public class UserRepositoryImpl implements UserRepository {
    private static UserRepositoryImpl instance;

    public static UserRepositoryImpl getInstance() {
        if (instance == null) {
            loadProperties();
            instance = new UserRepositoryImpl();
        }
        return instance;
    }

    @Override
    public void addUser(User regUser) throws MyException, SQLException {
        String QUERY = "INSERT INTO user " +
                "(ID,first_name, last_name, `e-mail`, password, about) " +
                "VALUES (?,?,?,?,?,?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {

            preparedStatement.setInt(1,regUser.getID());
            preparedStatement.setString(2, regUser.getFirstName());
            preparedStatement.setString(3, regUser.getLastName());
            preparedStatement.setString(4, regUser.geteMail());
            preparedStatement.setString(5, regUser.getPassword());
            preparedStatement.setString(6, regUser.getAbout());
            preparedStatement.executeUpdate();

        }
    }
    @Override
    public User getUser(String login, String password) throws MyException, SQLException {
        User user = null;
        String QUERY = "SELECT * FROM satartup.user WHERE `e-mail`=? AND password=?";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {

            preparedStatement.setString(1, login);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                user= new User();
                user.seteMail(resultSet.getString("e-mail"));
                user.setPassword(resultSet.getString("password"));
                user.setID(resultSet.getInt("id"));
            }
        }
        return user;
    }

    @Override
    public Boolean getUser(String login) throws MyException, SQLException {
        Boolean valid = false;
        String QUERY = "SELECT * FROM satartup.user WHERE `e-mail`=?";
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PASSWORD);
             PreparedStatement preparedStatement = connection.prepareStatement(QUERY)) {
            preparedStatement.setString(1, login);
            ResultSet resultSet = preparedStatement.executeQuery();
            valid = resultSet.next();
        }catch(Exception e)
            {
                e.printStackTrace();
            }
            return valid;
    }


}

